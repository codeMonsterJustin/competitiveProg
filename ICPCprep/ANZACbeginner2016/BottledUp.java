import java.util.*;

public class BottledUp{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int s = input.nextInt();
        int v1 = input.nextInt();
        int v2 = input.nextInt();
        int diff = v1 - v2;
        int remain = s%v1;

        int num1 = 0;
        int num2 = 0;

        boolean possible = false;
        if(remain == 0){
            num1 = s/v1;
            num2 = 0;
            possible = true;
        }
        else if(v2 > s/2){
            System.out.println("Impossible");
            return;
        }
        else{
            for(int i = 1; i <= v2; i++){

                if((v2*i - remain)%diff == 0){
                    num2 = (v2*i - remain)/diff + 1;
                    num1 = (s - num2*v2)/v1;
                    possible = true;
                    break;
                }
            }
        }
        // else if((v2 - s%v1)%diff == 0){
        //
        //     num2 = (v2-s%v1)/diff + 1;
        //     num1 = (s - num2*v2)/v1;
        // }

        if(possible){
            System.out.printf("%d %d\n", num1, num2);
        }
        else{
            System.out.println("Impossible");
            return;
        }

    }
}
