public class QuickSort{

  // sort an array of integers into ascending order
  public static void sort(int[] array){
    sort_rc(array, 0, array.length-1);
  }

  // recursive version with explicit left and right bounds.
  public static void sort_rc(int[] array, int left, int right){
    if (left >= right){ // size 0 or 1 case: already sorted
      return;
    }else if (left + 1 == right){ // size 2 case: sort it
      if (array[left] > array[right]){
        swap(array, left, right);
      }
      return;
    }

    // size > 2 case: sort it recursively
    int partition = partition(array, left, right);
    sort_rc(array, left, partition-1);
    sort_rc(array, partition+1, right);
  }

  // return the index of the partition element
  // with the partition element in its final location
  // and the array divided into two unsorted halves.
  public static int partition(int[] array, int left, int right){
    // PRE: array size > 2
    int middle = (left+right)/2;
    int pivot = array[middle];

    // swap the pivot with the leftmost element
    swap(array, middle, left);

    // scan the search range from both ends toward the middle
    int left_pointer = left+1;
    int right_pointer = right;
    boolean done = false;

    while(!done){
      // left_pointer moves to the right
      // it skips elements <= pivot, so in the end:
      // - it points to the first element (from left) > middleElement, or
      // - if nothing is greater it should points to the last element
      while(array[left_pointer] <= pivot){
        left_pointer++;
        if (left_pointer > right){
          break;
        }
      }
      // right_pointer moves to the left
      // it skips elements > pivot, so in the end:
      // - it points to the first element (from right) <= pivot
      // - or, the leftmost element (pivot), which equals pivot
      while(array[right_pointer] > pivot){
        right_pointer--;
      }

      if(left_pointer < right_pointer){
        swap(array, left_pointer, right_pointer);
      }else{
        done = true;
      }
    }

    swap(array, left, right_pointer);

    return right_pointer;
  }

  // helper: swap two elements in an array.
  public static void swap(int[] array, int one, int other){
    int temp = array[one];
    array[one] = array[other];
    array[other] = temp;
  }
}