import java.util.*;

public class Complexity{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String word = input.next();

        int[] char_count = new int[26];

        for(char c : word.toCharArray()){

            int ascii = (int) c - (int) 'a';
            char_count[ascii]++;
        }

        Arrays.sort(char_count);

        System.out.println(word.length() - (char_count[25] + char_count[24]));

    }
}
