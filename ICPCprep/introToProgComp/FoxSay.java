import java.util.*;

public class FoxSay{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int casesNum = input.nextInt();
        input.nextLine();
        for(int i = 0; i < casesNum; i++){

            String[] recording = input.nextLine().split(" ");

            //String[] animalSounds = new String[100];
            String soundLine = input.nextLine();
            StringBuilder foxSounds = new StringBuilder();
            while(!soundLine.equals("what does the fox say?")){

                String sound = soundLine.split(" ")[2];

                for(int j = 0; j < recording.length; j++){
                    if(sound.equals(recording[j])){
                        recording[j] = null;
                    }
                }
                soundLine = input.nextLine();
            }

            for(String sound: recording){
                if(sound != null){
                    foxSounds.append(sound + " ");
                }
            }
            System.out.println(foxSounds.substring(0, foxSounds.length()-1));
        }

    }
}
