import java.util.*;

public class Deciding{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int rows = input.nextInt();

        for(int i = 0; i < rows; i++){
            
            String flower = input.next();
            int len = flower.length();

            if(flower.charAt((len/2) -1) == flower.charAt(len/2)){
                
                System.out.println("Do-it");
            }
            else{
             
                System.out.println("Do-it-Not");
            }

        }










    }
}
