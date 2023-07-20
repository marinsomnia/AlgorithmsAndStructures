import java.util.Arrays;

public class Main {
   public static void main(String[] args) {
      int[] array = new int[] {5,6,1,3,8,0,9};
      HeapSort.sort(array); // Используем статический способ доступа
      System.out.println(Arrays.toString(array));

   }
}