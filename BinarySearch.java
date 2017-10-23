public class BinarySearch{

  public static int search(int[] list, int target){
    return find_rc(list, 0, list.length-1, target);
  }

  public static int find_rc(int[] list, int left, int right, int target){
    // size 0 problem
    if (left > right){
      return -1;
    }

    // size 1 problem
    if(left == right){
      if(target == list[left]){
        return left;
      }else{
        return -1;
      }
    }

    // size 2 problem
    if(left + 1 == right){
      if(target == list[left]){
        return left;
      }else if(target == list[right]){
        return right;
      }else{
        return -1;
      }
    }

    // size >= 3 problem
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