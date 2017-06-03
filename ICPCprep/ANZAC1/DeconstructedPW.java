import java.util.*;

public class DeconstructedPW{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int length = input.nextInt();
        input.nextLine();

        char[] password = new char[length];
        String[] seqNum = input.nextLine().split(" ");

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int index = 0;
        for(int i = 0; i < length; i++){

            if(password[i] == 0){ //fix this
                if(index > 25){
                    System.out.println(-1);
                    return;
                }
                password[i] = alphabet.charAt(index);
                index++;
                if(Integer.parseInt(seqNum[i]) <= length){

                    if(password[Integer.parseInt(seqNum[i]) - 1] == 0){

                        password[Integer.parseInt(seqNum[i]) -1] = password[i];
                    }
                    else if(password[Integer.parseInt(seqNum[i]) - 1] == password[i]){

                    }
                    else{
                        System.out.println(-1);
                        return;
                    }
                }
            }
            else{
                if(Integer.parseInt(seqNum[i]) <= length){
                    if(password[Integer.parseInt(seqNum[i]) - 1] == 0){
                        password[Integer.parseInt(seqNum[i]) - 1] = password[i];
                    }
                    else{
                        System.out.println(-1);
                        return;
                    }
                }
            }
        }
        //System.out.println(password.join());

        for(char c : password){
            System.out.print(c);
        }
        System.out.print("\n");



    }
}
