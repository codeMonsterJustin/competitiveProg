//Source: CodeForces, Question 158A
//http://codeforces.com/problemset/problem/158/A

import java.util.*;
public class NextRound{
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    int contestentNum = scan.nextInt();
    int winningPlace = scan.nextInt();
    int winnerCount =0;
    int lowestScore = 0;

    for(int i = 0; i < contestentNum; i++){
      int score = scan.nextInt();
      if(score <= 0){
        break;
      }
      if(score >= lowestScore){
        winnerCount++;
      }
      if(i == winningPlace-1){
        lowestScore = score;
      }
    }
    System.out.println(winnerCount);

  }
}
