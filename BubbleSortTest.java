public class BubbleSortTest{
  public static void main(String[] args){
    // test sort()
    int[] array = new int[]{1};
    System.out.println("expect:\ttrue");
    int[] result = BubbleSort.sort(array);
    System.out.println("got:\t"+isAscending(result));
    printArray(array);

    array = new int[]{2, 1};
    System.out.println("expect:\ttrue");
    result = BubbleSort.sort(array);
    System.out.println("got:\t"+isAscending(result));
    printArray(array);

    array = new int[]{3, 2, 1};
    System.out.println("expect:\ttrue");
    result = BubbleSort.sort(array);
    System.out.println("got:\t"+isAscending(result));
    printArray(array);

    array = new int[]{5, 4, 3, 2, 1};
    System.out.println("expect:\ttrue");
    result = BubbleSort.sort(array);
    System.out.println("got:\t"+isAscending(result));
    printArray(array);

    array = new int[100];
    for(int i=0; i<100; i++){
      array[i] = 100-i;
    }
    System.out.println("expect:\ttrue");
    result = BubbleSort.sort(array);
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