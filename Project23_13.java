/*
 * Kyle Brown
 * Program 23.13
 * Execution time for sorting
 * This program runs a few different sort methods and obtains their execution
 * time. It then prints a table displaying results.
*/

import java.util.ArrayList;


public class Project23_13 {
    
public static void main (String [] args){
//prints headers
System.out.print("|Array Size    |Selection Sort|Bubble Sort   |Merge Sort   "
        + " |Quick Sort    |Heap Sort     |Radix Sort    |");
//sends to execution method
for (int i = 50000; i <= 300000; i+= 50000)
    print(i);
}

//prints results
public static void print (int arraySize){
//sets column width at 14 (the width of the longest header, Selection Sort)
int width = 14;

int[] list = new int[arraySize];
for (int count = 0; count < list.length; count++){
    list[count] = (int)(Math.random() * 300000);
}
System.out.print("\n");
for (int i = 0; i < 7; i++){
    for (int j = 0; j < width; j++){
        System.out.print("-");
    }
    System.out.print("|");
}
System.out.printf("\n%" + width + "d|", arraySize);

//runs the sorts and prints their times to the current row
int[] values = new int[arraySize];
System.arraycopy(list, 0, values, 0, list.length);
long startTime = System.currentTimeMillis();
selectionSort(values);
long endTime = System.currentTimeMillis();
long executionTime = endTime - startTime;
System.out.printf("%" + width + "d|", executionTime);

values = new int[arraySize];
System.arraycopy(list, 0, values, 0, list.length);
startTime = System.currentTimeMillis();
bubbleSort(values);
endTime = System.currentTimeMillis();
executionTime = endTime - startTime;
System.out.printf("%" + width + "d|", executionTime);

values = new int[arraySize];
System.arraycopy(list, 0, values, 0, list.length);
startTime = System.currentTimeMillis();
mergeSort(values);
endTime = System.currentTimeMillis();
executionTime = endTime - startTime;
System.out.printf("%" + width + "d|", executionTime);

values = new int[arraySize];
System.arraycopy(list, 0, values, 0, list.length);
startTime = System.currentTimeMillis();
quickSort(values);
endTime = System.currentTimeMillis();
executionTime = endTime - startTime;
System.out.printf("%" + width + "d|", executionTime);

values = new int[arraySize];
System.arraycopy(list, 0, values, 0, list.length);
startTime = System.currentTimeMillis();
heapSort(values);
endTime = System.currentTimeMillis();
executionTime = endTime - startTime;
System.out.printf("%" + width + "d|", executionTime);

values = new int[arraySize];
System.arraycopy(list, 0, values, 0, list.length);
startTime = System.currentTimeMillis();
radixSort(values, 1000000);
endTime = System.currentTimeMillis();
executionTime = endTime - startTime;
System.out.printf("%" + width + "d|", executionTime);
}


//Many of these (as some have already been covered) were
//taken from the book examples/companion website
public static void selectionSort(int[] list) {
    for (int i = 0; i < list.length - 1; i++) {
      // Find the minimum in the list[i..list.length-1]
      double currentMin = list[i];
      int currentMinIndex = i;

      for (int j = i + 1; j < list.length; j++) {
        if (currentMin > list[j]) {
          currentMin = list[j];
          currentMinIndex = j;
        }
      }

      // Swap list[i] with list[currentMinIndex] if necessary;
      if (currentMinIndex != i) {
        list[currentMinIndex] = list[i];
        list[i] = (int) currentMin;
      }
    }
}
public static void bubbleSort(int[] list) {
    boolean needNextPass = true;
    
    for (int k = 1; k < list.length && needNextPass; k++) {
      // Array may be sorted and next pass not needed
      needNextPass = false;
      for (int i = 0; i < list.length - k; i++) {
        if (list[i] > list[i + 1]) {
          // Swap list[i] with list[i + 1]
          int temp = list[i];
          list[i] = list[i + 1];
          list[i + 1] = temp;
          
          needNextPass = true; // Next pass still needed
        }
      }
    }
  }
public static void mergeSort(int[] list) {
  if (list.length > 1) {
   // Merge sort the first half
   int[] firstHalf = new int[list.length / 2];
   System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
   mergeSort(firstHalf);

   // Merge sort the second half
   int secondHalfLength = list.length - list.length / 2;
   int[] secondHalf = new int[secondHalfLength];
   System.arraycopy(list, list.length / 2, secondHalf, 0,
     secondHalfLength);
   mergeSort(secondHalf);

   // Merge firstHalf with secondHalf into list
   merge(firstHalf, secondHalf, list);
  }
 }
public static void merge(int[] list1, int[] list2, int[] temp) {
  int current1 = 0; // Current index in list1
  int current2 = 0; // Current index in list2
  int current3 = 0; // Current index in temp

  while (current1 < list1.length && current2 < list2.length) {
   if (list1[current1] < list2[current2])
    temp[current3++] = list1[current1++];
   else
    temp[current3++] = list2[current2++];
  }

  while (current1 < list1.length)
   temp[current3++] = list1[current1++];

  while (current2 < list2.length)
   temp[current3++] = list2[current2++];
 }
public static void quickSort(int[] list) {
  quickSort(list, 0, list.length - 1);
 }
private static void quickSort(int[] list, int first, int last) {
  if (last > first) {
   int pivotIndex = partition(list, first, last);
   quickSort(list, first, pivotIndex - 1);
   quickSort(list, pivotIndex + 1, last);
  }
 }
private static int partition(int[] list, int first, int last) {
  int pivot = list[first]; // Choose the first element as the pivot
  int low = first + 1; // Index for forward search
  int high = last; // Index for backward search

  while (high > low) {
   // Search forward from left
   while (low <= high && list[low] <= pivot)
    low++;

   // Search backward from right
   while (low <= high && list[high] > pivot)
    high--;

   // Swap two elements in the list
   if (high > low) {
    int temp = list[high];
    list[high] = list[low];
    list[low] = temp;
   }
  }
  while (high > first && list[high] >= pivot)
   high--;

  // Swap pivot with list[high]
  if (pivot > list[high]) {
   list[first] = list[high];
   list[high] = pivot;
   return high;
  } else {
   return first;
  }
 }
public static void heapSort(int[] list) {
  // Create a Heap of integers
  Heap<Integer> heap = new Heap<Integer>();

  // Add elements to the heap
  for (int i = 0; i < list.length; i++)
   heap.add(list[i]);

  // Remove elements from the heap
  for (int i = list.length - 1; i >= 0; i--)
   list[i] = heap.remove();
 }
static void radixSort(int[] list, int maxOrder) {
  for (int order = 1; order < maxOrder; order *= 10) {
   @SuppressWarnings("unchecked")
   ArrayList<Integer>[] bucket = new ArrayList[10];
   
   for (int i = 0; i < bucket.length; i++) {
    bucket[i] = new java.util.ArrayList<>();
   }
   
   for (int i = 0; i < list.length; i++) {
    bucket[(list[i] / order) % 10].add(list[i]);
   }
   
   int k = 0;
   for (int i = 0; i < bucket.length; i++) {
    if (bucket[i] != null) {
     for (int j = 0; j < bucket[i].size(); j++)
      list[k++] = bucket[i].get(j);
    }
   }
  }
 }
}
