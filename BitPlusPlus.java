//Source: CodeForces, Question 282A
//http://codeforces.com/problemset/problem/282/A

import java.util.*;
public class BitPlusPlus{
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    int statementNum = scan.nextInt();
    int x = 0;

    for(int i = 0; i < statementNum; i++){
      String statement = scan.next();
      switch(statement){
        case "X++":
          x++;
          break;
        case "++X":
          x++;
          break;
        case "X--":
          x--;
          break;
        case "--X":
          x--;
          break;
      }
    }
    System.out.println(x);
  }
}
