package hackerRank.arrays;

import java.util.Scanner;

public class SimpleArraySum {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int[] arr = new int[n];
      int sum = 0;

      for (int i = 0; i < n; i++) {
         arr[i] = in.nextInt();
         sum += arr[i];
      }

      System.out.println(sum);
      in.close();
   }

}
