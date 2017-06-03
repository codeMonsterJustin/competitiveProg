import java.util.*;

public class AlmostAnAnagram{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int[] aLettersCount = new int[26];
        int[] bLettersCount = new int[26];
        String a = scan.next();
        String b = scan.next();

        if(a.length() > b.length()){
            String temp;
            temp = b;
            b = a;
            a = temp;
        }
        else if(a.length() == b.length()){
            String[] arr = {a, b};
            Arrays.sort(arr);
            a = arr[0];
            b = arr[1];
        }
        for(char c : a.toCharArray()){
            aLettersCount[(int)c - 'a']++;
        }
        for(char c : b.toCharArray()){
            bLettersCount[(int)c - 'a']++;
        }

        if(a.equals(b)){
            System.out.printf("%s is identical to %s\n", a, b);
        }
        else if(AlmostAnAnagram.isAnagram(aLettersCount, bLettersCount)){
            System.out.printf("%s is an anagram of %s\n", a, b);
        }
        else if(AlmostAnAnagram.isAlmostAnagram(aLettersCount, bLettersCount)){
            System.out.printf("%s is almost an anagram of %s\n", a, b);
        }
        else{
            System.out.printf("%s is nothing like %s\n", a, b);
        }
    }

    public static boolean isAnagram(int[] a, int[] b){
        for(int i = 0; i < 26; i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }

    public static boolean isAlmostAnagram(int[] a, int[] b){
        int ruleBroken = 0;
        int aLength = 0;
        int bLength = 0;
        int lengthDiff;

        for(int i = 0; i < 26; i++){
            aLength += a[i];
            bLength += b[i];
            ruleBroken += Math.abs(a[i] - b[i]);
        }

        lengthDiff = Math.abs(aLength - bLength);

        if(lengthDiff == 1 && ruleBroken == 1){
            return true;
        }
        else if(lengthDiff == 0 && ruleBroken == 2){
            return true;
        }

        return false;
    }
}
