public class BubleSortTest2
{
  public static void main(String[] args)
  {
    int [] array = new int[100];
    for (int i = 0; i < 100; i++)
    {
      array[i] = 100 - i;
    }
    BubleSort.sort(array);
  }
}
