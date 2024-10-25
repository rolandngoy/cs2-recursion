public class QuickSortTest
{
  public static void main(String[] args)
  {
    int[] array = new int[100];
    for(int i=0; i<100; i++)
    {
      array[i] = 100-i;
    }
    System.out.println("Is the array sorted?");
    System.out.println("Expect: \ttrue");
    QuickSort.sort(array);
    //System.out.println("got:\t"+isAscending(array));
    //printArray(Array);
  }

  public static void printArray(int[] array)
  {
    for(int i=0; i<array.length; i++)
    {
      System.out.print(array[i]+ " ");
    }
    System.out.println();
  }

  public static boolean isAscending(int[] array)
  {
    boolean result = true;
    for(int i=0; i<array.length-1; i++)
    {
      if(array[i] > array[i+1])
      {
        //not sorted
        result = false;
        break;
      }
    }
    return result;
  }
}
