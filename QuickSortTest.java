public class QuickSortTest{
  public static void main(String[] args){
    // test partition()
    int[] array = new int[]{5, 4, 3, 2, 1};
    System.out.println("expect:\t2");
    System.out.println("got:\t"+QuickSort.partition(array, 0, 4));
    printArray(array);
    array = new int[]{5, 4, 1, 2, 3};
    System.out.println("expect:\t0");
    System.out.println("got:\t"+QuickSort.partition(array, 0, 4));
    printArray(array);
    array = new int[]{3, 4, 5, 2, 1};
    System.out.println("expect:\t4");
    System.out.println("got:\t"+QuickSort.partition(array, 0, 4));
    printArray(array);

    // test sort()
    array = new int[]{5, 4, 3, 2, 1};
    System.out.println("expect:\ttrue");
    int[] result = QuickSort.sort(array);
    System.out.println("got:\t"+isAscending(result));
    printArray(array);

    array = new int[100];
    for(int i=0; i<100; i++){
      array[i] = 100-i;
    }
    System.out.println("expect:\ttrue");
    result = QuickSort.sort(array);
    System.out.println("got:\t"+isAscending(result));
    printArray(array);
  }

  public static void printArray(int[] array){
    for(int i=0; i<array.length; i++){
      System.out.print(array[i]+" ");
    }
    System.out.println();
  }

  public static boolean isAscending(int[] array){
    boolean result = true;
    for(int i=0; i<array.length-1; i++){
      if(array[i] > array[i+1]){
        // not sorted
        result = false;
        break;
      }
    }
    return result;
  }
}