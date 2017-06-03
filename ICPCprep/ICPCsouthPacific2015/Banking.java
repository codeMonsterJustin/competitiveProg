import java.util.*;

public class Banking{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String pin = scan.nextLine();
        char[] pWord = scan.nextLine().toCharArray();
        int sum = 0;
        if(!Banking.isValid(pin, pWord)){
            System.out.println("non sequitur");
            return;
        }
        int j = 0;
        for(int i = 0; i < pWord.length; i++){
            if(Character.isUpperCase(pWord[i])){
                int skip = pWord[i] - 'A' + 1;
                j += skip;
            }
            else{
                int take = pWord[i] - 'a' + 1;
                for(int k = 0; k < take; k++){
                    sum += Character.getNumericValue(pin.charAt(j));
                    j++;
                }
            }
        }

        System.out.println(sum);
    }

    public static boolean isValid(String pin, char[] pWord){
        int len = pin.length();
        int pWordSum = 0;
        for(char c : pWord){
            if(Character.isUpperCase(c)){
                pWordSum += (c - 'A' + 1);
            }
            else{
                pWordSum += (c - 'a' + 1);
            }
        }
        return len == pWordSum;
    }
}
