import java.util.*;

public class Vowels{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String word = input.next().toLowerCase();

        String[] vowelsCount = {"0a", "0e", "0i", "0o", "0u"};

        for(int i = 0; i < word.length(); i++){
            char letter = word.charAt(i);

            switch(letter){
                case 'a':
                    String updatedCount = Integer.toString(Character.getNumericValue(vowelsCount[0].charAt(0)) + 1);
                    vowelsCount[0] = updatedCount + 'a';
                case 'e':
                    updatedCount = Integer.toString(Character.getNumericValue(vowelsCount[1].charAt(0)) + 1);
                    vowelsCount[1] = updatedCount + 'e';
                case 'i':
                    updatedCount = Integer.toString(Character.getNumericValue(vowelsCount[2].charAt(0)) + 1);
                    vowelsCount[2] = updatedCount + 'i';
                case 'o':
                    updatedCount = Integer.toString(Character.getNumericValue(vowelsCount[3].charAt(0)) + 1);
                    vowelsCount[3] = updatedCount + 'o';
                case 'u':
                    updatedCount = Integer.toString(Character.getNumericValue(vowelsCount[4].charAt(0)) + 1);
                    vowelsCount[4] = updatedCount + 'u';


            }
        }

        Arrays.sort(vowelsCount);

        System.out.print(vowelsCount[0].charAt(1) + ":" + vowelsCount[0].charAt(0) + " ");
        System.out.print(vowelsCount[1].charAt(1) + ":" + vowelsCount[1].charAt(0) + " ");
        System.out.print(vowelsCount[2].charAt(1) + ":" + vowelsCount[2].charAt(0) + " ");
        System.out.print(vowelsCount[3].charAt(1) + ":" + vowelsCount[3].charAt(0) + " ");
        System.out.print(vowelsCount[4].charAt(1) + ":" + vowelsCount[4].charAt(0) + "\n");

    }
}
