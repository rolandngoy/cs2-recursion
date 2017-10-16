public class SumToInt{
  public static void main(String[] args){
    int n = 5;
    System.out.println("sumTo("+n+")="+sumTo(n));
  }

  static int sumTo(int n){
    if (n == 1){
      return 1;
    }else{
      return sumTo(n-1)+n;
    }
  }

  static int sumTo1(int n){
    int sum = 0;
    for(int i=1; i<=n; i++){
      sum += i;
    }
    return sum;
  }
}