//Source: CodeForces, Question 118A
//http://codeforces.com/problemset/problem/118/A

import java.util.*;
public class StringTask{
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    String word = scan.next().toLowerCase();
    StringBuilder newWord = new StringBuilder();

    for(int i = 0; i < word.length(); i++){
      if(StringTask.isVowel(word.charAt(i))){
        continue;
      }
      else{
        newWord.append('.');
        newWord.append(word.charAt(i));
      }
    }
    System.out.println(newWord);
  }

  private static boolean isVowel(char c){

    if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='y'){
      return true;
    }
    return false;
  }
}
