//Source: Hackerrank, Cracking the Coding Interview.
//https://www.hackerrank.com/challenges/ctci-making-anagrams

import java.util.*;

public class MakingAnagrams{
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    String a = scan.nextLine();
    String b = scan.nextLine();
    char[] aCharCount = new char[26];
    char[] bCharCount = new char[26];
    int deleteRequired = 0;

    for(int i = 0; i < a.length(); i++){
      int val = a.charAt(i) - 97; //97 is the ASCII for 'a'
      aCharCount[val]++;
    }
    for(int i = 0; i < b.length(); i++){
      int val = b.charAt(i) - 97;
      bCharCount[val]++;
    }

    for(int i = 0; i < 26; i++){
      deleteRequired += aCharCount[i] - bCharCount[i];
    }

    System.out.println(deleteRequired);
  }
}
//Time Complexity: O(|a| + |b|)
//Space Complexity: O(|a| + |b|)
