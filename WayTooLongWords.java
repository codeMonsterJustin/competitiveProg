//Source: CodeForces, Question 71A
//http://codeforces.com/problemset/problem/71/A

import java.util.*;
public class WayTooLongWords{
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();

    for(int i = 0; i < num; i++){
      String word = scan.next();
      int wordLength =  word.length();

      if(wordLength <= 10){
        System.out.println(word);
      }
      else{
        System.out.println(word.charAt(0) + Integer.toString(wordLength-2) + word.charAt(wordLength - 1));
      }
    }
  }
