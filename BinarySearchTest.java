public class BinarySearchTest{
  public static void main(String[] args){
    int[] array;

    // size 0 case
    array = new int[0];
    System.out.println("expect:\t-1");
    System.out.println("got:\t"+BinarySearch.search(array, 42));

    // size 1 case
    array = new int[]{42};
    System.out.println("expect:\t0");
    System.out.println("got:\t"+BinarySearch.search(array, 42));
    System.out.println("expect:\t-1");
    System.out.println("got:\t"+BinarySearch.search(array, 24));

    // size 2 case
    array = new int[]{24,42};
    System.out.println("expect:\t0");
    System.out.println("got:\t"+BinarySearch.search(array, 24));
    System.out.println("expect:\t1");
    System.out.println("got:\t"+BinarySearch.search(array, 42));
    System.out.println("expect:\t-1");
    System.out.println("got:\t"+BinarySearch.search(array, 2));

    // size > 2 case
    array = new int[100];
    for(int i=0; i<100; i++){
      array[i] = 2*i;
    }
    System.out.println("expect:\t40");
    System.out.println("got:\t"+BinarySearch.search(array, 80));
    System.out.println("expect:\t-1");
    System.out.println("got:\t"+BinarySearch.search(array, 79));
  }
}