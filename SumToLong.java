public class SumToLong{
  public static void main(String[] args){
    long n = 1000000000L;
    System.out.println("sumTo("+n+")="+sumTo1(n));
  }

  static long sumTo(long n){
    if (n == 1){
      return 1;
    }else{
      return sumTo(n-1)+n;
    }
  }

  static long sumTo1(long n){
    long sum = 0;
    for(int i=1; i<=n; i++){
      sum += i;
    }
    return sum;
  }
}