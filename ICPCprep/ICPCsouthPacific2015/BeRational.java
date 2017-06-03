import java.util.*;

public class BeRational{

    public static final double ERRORMARGIN = 0.0001;
    public static void  main(String[] args){

        Scanner scan = new Scanner(System.in);
        String num = scan.next();

        String numType = BeRational.getNumType(num);
        if(numType.equals("repeat")){
            Scanner input = new Scanner(num);
            int whole = input.nextInt();
            int decimal = input.nextInt();
            int numLength;
            for(int i = 0; i < Math.ceil(20/numLength); i++){
                int decimal = '' + decimal + decimal;
            }
            

        }
        else if(numType.equals("decimal")){

        }
        else if(numType.equals("integer")){
            System.out.printf("%s/1\n", num);
        }
    }

    public static String getNumType(String num){
        boolean hasDot = false;
        boolean hasPar = false;
        for(char c : num.toCharArray()){
            if(c == '.'){
                hasDot = true;
            }
            if(c == '('){
                hasPar = true;
            }
        }
        if(hasDot && hasPar){
            return "repeat";
        }
        else if(hasDot){
            return "decimal";
        }
        else{
            return "integer";
        }
    }
}
