public class QuickSort{

  // sort array and return a reference to the sorted array.
  // this is the client facing interface.
  public static int[] sort(int[] array){
    return sort_rc(array, 0, array.length-1);
  }

  // recursive version with explicit left and right bounds.
  public static int[] sort_rc(int[] array, int left, int right){
    // size 0 or 1 case: already sorted
    if (left >= right){
      return array;
    }

    // size 2 case: sort it
    if (left + 1 == right){
      if (array[left] > array[right]){
        // swap
        swap(array, left, right);
      }
      return array;
    }

    // size > 2 case: sort it recursively
    int partition = partition(array, left, right);
    sort_rc(array, left, partition-1);
    sort_rc(array, partition+1, right);

    return array;
  }

  // return the index of the partition element
  // and partition the array into two halves.
  public static int partition(int[] array, int left, int right){
    // PRE: array size > 2
    int middle = (left+right)/2;
    int middleElement = array[middle];

    // swap middle element with to the front
    swap(array, middle, left);

    // use pointers to filter the list from both ends
    int left_pointer = left+1;
    int right_pointer = right;
    boolean done = false;

    while(!done){
      // left_pointer moves to the right
      // it jumps over elements <= middleElement
      // in the end:
      // - it points to the first element (from left) > middleElement, or
      // - if nothing is greater it should points to the last element
      while(array[left_pointer] <= middleElement){
        left_pointer++;
        if (left_pointer > right){
          break;
        }
      }
      // right_pointer moves to the left
      // it jumps over elements > middleElement
      // in the end:
      // - it points to the first element (from right) <= middleElement
      while(array[right_pointer] > middleElement){
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

  // another way to do the following:
  // return the index of the partition element
  // and partition the array into two halves.
  public static int partition1(int[] array, int left, int right){
    // PRE: array size > 2
    int[] temp = new int[right-left+1];
    int l = -1;
    int r = temp.length;
    int middle = (left+right)/2;
    //System.out.println("middle:"+middle);
    int middleElement = array[middle];
    //System.out.println("middleElement:"+middleElement);
    for(int i=left; i<=right; i++){
      if(array[i] < middleElement){
        l++;
        temp[l] = array[i];
      }else{
        r--;
        temp[r] = array[i];
      }
    }

    int j = 0;
    for(int i=left; i<=right; i++){
      array[i] = temp[j];
      j++;
    }
    return r;
  }

  // helper: swap two elements in an array.
  public static void swap(int[] array, int one, int other){
    int temp = array[one];
    array[one] = array[other];
    array[other] = temp;
  }
}