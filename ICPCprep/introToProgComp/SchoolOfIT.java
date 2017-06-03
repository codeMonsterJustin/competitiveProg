import java.util.*;

public class SchoolOfIT{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int rows = input.nextInt();

        for(int i = 0; i < rows; i++){

            int rank = input.nextInt();
            String name = input.next();
            
            for(int j = 0; j < rank; j++){

                System.out.println("Hello " + name);
            }
        }
    }
}
