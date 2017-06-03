import java.util.*;

public class Footballers{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String[] player_details = input.nextLine().split(" ");

        if(Integer.parseInt(player_details[1]) > 17){
            System.out.println(player_details[0] + " Senior");

        }
        else if(Integer.parseInt(player_details[2]) >= 80){
            System.out.println(player_details[0] + " Senior");
        }
        else{
            System.out.println(player_details[0] + " Junior");
        }
    }
}
