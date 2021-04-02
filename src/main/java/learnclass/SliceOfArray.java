package learnclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SliceOfArray {

  public static int[] sliceOfPizza(int[] arr, int start, int end, int stride) {
    List<Integer> sliceList = new ArrayList<>();

    for(int i = start; i < end; i += stride) {
      sliceList.add(arr[i]);
    }
    int[] arrayTotal = new int[sliceList.size()];
    for(int i = 0; i < sliceList.size(); i++) {
      arrayTotal[i] = sliceList.get(i);
    }
    return arrayTotal;
  }
  public static void main(String[] args) {
    int[] arr = {1, 1, 2, 3, 5, 6, 13, 21, 34, 55};
    int start = 1, end = 9;
    int[] slice = sliceOfPizza(arr, start, end, 2);
    System.out.println(Arrays.toString(slice));
  }
}
