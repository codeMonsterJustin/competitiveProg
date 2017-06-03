//Source: CodeForces, Question 50A
//http://codeforces.com/problemset/problem/50/A

import java.util.*;
public class DominoPiling{
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    int m = scan.nextInt();
    int n = scan.nextInt();

    System.out.println((n/2)*m + ((n%2)*m)/2);
  }
}
