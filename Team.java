//Source: CodeForces, Question 231A
//http://codeforces.com/problemset/problem/231/A

import java.util.*;
public class Team{
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    int qNum = scan.nextInt();
    int solvable = 0;

    for(int i = 0; i < qNum; i++){
      int p = scan.nextInt();
      int v = scan.nextInt();
      int t = scan.nextInt();

      if(p + v + t >= 2){
        solvable++;
      }
    }
    System.out.println(solvable);
  }
}
