import java.util.*;

public class Multiplication{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);


        long a = scan.nextInt();
        long b = scan.nextInt();
        long c = scan.nextInt();
        long d = scan.nextInt();

        if(a*a == 1 && b*b == 1 && c*c == 1 && d*d == 1){
            System.out.println("Poor Evan!");
            return;
        }
        if(a == 0 || b == 0 || c == 0 || d == 0){
            System.out.println("Poor Evan!");
            return;
        }
        long[] nums = {a*a, b*b, c*c, d*d};

        long prod = 1;
        int i =0;
        while(prod <= 90000){
            prod *= nums[i%4];
            i++;
        }
        System.out.println(prod);
    }
}
