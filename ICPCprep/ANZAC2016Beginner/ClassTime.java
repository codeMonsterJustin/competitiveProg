import java.util.*;

public class ClassTime{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int rows = input.nextInt();
        input.nextLine();

        String[] nameArray = new String[rows];

        for(int i = 0; i < rows; i++){
            String[] name = input.nextLine().split(" ");
            nameArray[i] = name[1] + " " + name[0];
        }
        Arrays.sort(nameArray);

        for(String name : nameArray){
            System.out.printf("%s %s\n", name.split(" ")[1], name.split(" ")[0]);
        }
    }
}
