import java.util.*;

public class Beholder{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        long n = scan.nextLong();
        long x = scan.nextLong();


        if(n == 1 && x == 0){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }
}
