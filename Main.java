import java.util.*;

class Main {
  public static void main(String[] args) {
    Random rNGesus = new Random();
    int array[] = new int[10];
    for (int x = 0; x <= (array.length) - 1; x++) {
      array[x] = rNGesus.nextInt(70);
      System.out.println(array[x]);
    }
    System.out.println("The unsorted array is: " + Arrays.toString(array));
    for (int i = 0; i <= (array.length) - 1; i++) {
      int element = array[i];
      int j = i;
      System.out.println("Progress: " + Arrays.toString(array));
      while (j > 0 && array[j - 1] > element) {
        array[j] = array[j - 1];
        j = j - 1;
      }
      array[j] = element;
    }
System.out.println("The sorted array is "+Arrays.toString(array));
  }
}