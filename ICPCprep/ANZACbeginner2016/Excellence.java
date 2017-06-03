import java.util.*;

public class Excellence{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int rows = input.nextInt();
        int max = 2000001; //Just above the maximum limit base on input constrain
        int pairRating = 0;
        int[] ratings = new int[rows];
        for(int i = 0; i < rows; i++){
            ratings[i] = input.nextInt();
        }
        Arrays.sort(ratings);

        for(int i = 0; i < rows/2; i++){
            pairRating = ratings[i] + ratings[rows - 1 - i];
            if(pairRating < max){
                max = pairRating;
            }
        }
        System.out.println(max);

    }
}
