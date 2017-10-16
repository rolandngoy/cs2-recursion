public class BinarySearch{
  public static void main(String[] args){
    int[] list = {1, 3, 4, 7, 8, 10};
    System.out.println(search(list, 10));
  }

  public static int search(int[] list, int target){
    return find_rc(list, 0, list.length-1, target);
  }

  public static int find_rc(int[] list, int left, int right, int target){
    if(left == right){
      if(target == list[left]){
        return left;
      }else{
        return -1;
      }
    }

    if(left + 1 == right){
      if(target == list[left]){
        return left;
      }else if(target == list[right]){
        return right;
      }else{
        return -1;
      }
    }

    int middle = (int) Math.floor((left+right)/2);
    if(target == list[middle]){
      return middle;
    }else if(target < list[middle]){
      // search in the first half
      return find_rc(list, left, middle-1, target);
    }else{
      // search in the second half
      return find_rc(list, middle+1, right, target);
    }
  }
}