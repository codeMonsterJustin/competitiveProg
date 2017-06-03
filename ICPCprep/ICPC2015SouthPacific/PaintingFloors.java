import java.util.*;

public class PaintingFloors{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int rows = scan.nextInt();
        int columns = scan.nextInt();
        scan.nextLine();
        char[][] floor = new char[rows][columns];

        for(int i = 0; i < rows; i++){
            char[] row = scan.nextLine().toCharArray();
            floor[i] = row;
        }
        for(int i = 0; i < columns; i++){
            if(floor[0][i] != 'x'){
                System.out.printf("%d %d\n", 1, i+1);
            }
        }
        for(int i = 0; i < rows - 1; i++){
            for(int j = 0; j < columns; j++){

                if(floor[i][j] == 'x'){
                    if(floor[i+1][j] != 'x'){
                        System.out.printf("%d %d\n", i+1+1, j+1);
                    }
                }
            }
        }
    }
}
