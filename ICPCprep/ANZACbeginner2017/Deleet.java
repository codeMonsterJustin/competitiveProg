import java.util.*;

public class Deleet{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        StringBuilder output = new StringBuilder();
        int printed = 0;
        String line = scan.nextLine();
        String[] words = line.split(" ");
        for(String s : words){

            boolean exitLoop = false;
            for(char c : s.toCharArray()){
                if(Character.getNumericValue(c) == 8 || Character.getNumericValue(c) == 9){
                    //System.out.print(s);
                    output.insert(output.length(), s);
                    output.insert(output.length(), ' ');
                    //printed = printed+= (s.length() + 1);
                    /*
                    if(!(printed >= line.length())){
                        System.out.print(' ');
                    }
                    */


                    exitLoop = true;
                    break;
                }
            }

            if(exitLoop){
                continue;
            }

            //if(words.charAt(0) >= 'a'){
                for(char c : s.toCharArray()){
                    char ans;
                    if(c == 'a'){
                        //System.out.print('4');
                        //output += '4';
                    }
                    else if(c == 'b'){
                        //System.out.print('6');
                        //output += '6';
                    }
                    else if(c == 'e'){
                        //output += '3';
                    }
                    else if(c == 'i'){
                        //output += '1';
                    }
                    else if(c == 'o'){
                        //output += '0';
                    }
                    else if(c == 's'){
                        //output += '5';
                    }
                    else if(c == 't'){
                        //output += '7';
                    }
                    else if(c == 'z'){
                        //output += '2';
                    }
                    else if(c == '1'){
                        output.insert(output.length(),'i');
                    }
                    else if(c == '3'){
                        output.insert(output.length(),'e');
                    }
                    else if(c == '5'){
                        output.insert(output.length(),'s');
                    }
                    else if(c == '7'){
                        output.insert(output.length(),'t');
                    }
                    else{
                        output.insert(output.length(),c);
                    }

                }
                //printed = printed + 2;
                //if(!(printed >= line.length())){
                    output.insert(output.length(), ' ');
                //}


        }
        System.out.println(output.substring(0, output.length() - 1));
        //System.out.println(line.length());
        //System.out.println(printed);


    }
}
