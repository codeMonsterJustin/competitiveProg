import java.util.*;

public class SecretSanta{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        scan.nextLine();
        int count = 0;
        HashMap<String, String> map = new HashMap<String, String>();
        String[] names_arr = new String[num];
        for(int i = 0; i < num; i++){
            String names = scan.nextLine();

            map.put(names.split(" ")[0], names.split(" ")[1]);
            names_arr[i] = names.split(" ")[0];
        }

        for(String n : names_arr){

            String key = n;
            if(map.get(key) != null){
                count++;
            }
            while(map.get(key) != null){
                key = map.put(key, null);
            }
        }

        if(count%2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }


    }
}
