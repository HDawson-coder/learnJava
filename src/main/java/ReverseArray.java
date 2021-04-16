public class ReverseArray {

  void reverse(int[] data) {
    int reverseData = 0;
    for (int i = data.length; i > 0; i--) {

    }
    System.out.println(data);
  }
}


/**
 * Complete the implementation of the reverse method below, so that it reverses the contents of the
 * data array (i.e. the values of data[0] and data[data.length - 1] must end up swapped, as must
 * the values of data[1] and data[data.length - 2] , etc.).
 * void reverse(int[] data) {
 * // TODO Complete implementation.
 * }
 */

// Reverse the contents of the data array

// Iterate through the array starting at the end of the array.
// With each pass take the index position from the for loop and set it in to a new array.
//Then print out the array in reverse.