import java.util.*;

public class CrazyEmail{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int rows = input.nextInt();
        input.nextLine();
        HashMap<String, String> connections = new HashMap<String, String>(100000);
        int avail = 0;
        for(int i = 0; i < rows; i++){
            String[] connection = input.nextLine().split(" ");
            String first = connection[0];
            String second = connection[2];

            connections.put(first, second);
        }
        for(String s : connections.keySet()){
            String curr = connections.get(s);
            int q = 0;
            while(!curr.equals(s) && !curr.equals("available") && !curr.equals("not")){
                curr = connections.get(curr);
                q++;
            }

            if(curr.equals("available")){
                curr = connections.get(s);
                //String next = curr;
                avail += q;
                while(!connections.get(curr).equals("available")){
                    // = connections.get(one);
                    curr = connections.put(curr, "available");
                }
            }
            else if(curr.equals(s) || curr.equals("not")){
                curr = connections.get(s);


                if(connections.get(curr)!= null){
                    while(!connections.get(curr).equals(s) || !connections.get(curr).equals("not")){
                        System.out.println(curr);
                        curr = connections.put(curr, "not");
                        if(connections.get(curr) == null){
                            break;
                        }
                    }
                }

            }

        }

        System.out.println(avail);


    }
}
