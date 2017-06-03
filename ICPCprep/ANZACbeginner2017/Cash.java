import java.util.*;

public class Cash{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        long x = scan.nextLong();


        long ways = 0;
        //long waysSlow = 0;
        long twoCount;
        long fiveCount;

        if(x == 1){
            System.out.println(0);
            return;
        }
        if(x == 2){
            System.out.println(1);
            return;
        }
        if(x == 3){
            System.out.println(0);
            return;
        }
        if(x == 1){
            System.out.println(1);
            return;
        }
        if(x%2 == 0){
            ways = (((int)x/7)*5);
            while(true){
                if(ways % 10==0){
                    break;
                }
                ways=ways-1;
            }
            ways=(ways/10)+1;
        }
        else{
            ways = (((int)x/7)*5);
            while(true){
                if(ways % 5==0 && ways % 2 !=0){
                    break;
                }
                ways=ways-1;
            }
            ways=(ways/10)+1;
        }

        if(ways == 5){
            System.out.println(0);
        }


/*
        while(twoCount >= fiveCount){
            twoCount -=5;
            fiveCount += 2;
            waysSlow++;
        }

*/
        System.out.println(ways);
        //System.out.println(waysSlow);

    }
}
