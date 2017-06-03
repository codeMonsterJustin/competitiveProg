import java.util.*;

public class AlternatingSeries{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int d = input.nextInt();
        int r = input.nextInt();

        int sum = d + r;

        if((sum/5)%2 == 0){
            System.out.println("Darcy");
        }
        else{
            System.out.println("Rajko");
        }
    }
}
