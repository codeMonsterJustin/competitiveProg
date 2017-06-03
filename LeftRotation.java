//Source: Hackerrank, Cracking the Coding Interview.
//https://www.hackerrank.com/challenges/ctci-array-left-rotation

import java.util.*;
public class LeftRotation{
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int d = scan.nextInt();
    int[] arr = new int[n];

    for(int i = 0; i < n; i++){
      arr[i] = scan.nextInt();
    }

    for(int i = 0; i < n; i++){
      System.out.print(arr[(i+d) % n]);
      System.out.print(" ");
    }

  }
}
