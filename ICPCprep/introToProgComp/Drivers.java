import java.util.*;


public class Drivers{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //int rows = Integer.parseInt(input.nextLine());
        int rows = input.nextInt();
        input.nextLine();
        while(rows != 0){

            int dayHours = 0;
            int nightHours = 0;
            boolean violated = false;

            for(int i = 0; i < rows; i++){

                String[] line = input.nextLine().split(" ");

                String sunRise = line[0];
                String sunSet = line[1];
                String start = line[2];
                String finish = line[3];

                if(Drivers.timeDiff(start, finish) > 120){
                    //System.out.println("NON");
                    violated = true;
                    //break;
                }
                else{

                    if(Drivers.isNight(sunRise, sunSet, start, finish)){
                        nightHours += timeDiff(start, finish);
                    }
                    else{
                        dayHours += timeDiff(start, finish);
                    }
                }
            }
            //rows = Integer.parseInt(input.nextLine());
            rows = input.nextInt();
            input.nextLine();
            if(nightHours >= 600 && dayHours + nightHours >= 3000 && !violated){
                System.out.println("PASS");
            }
            else{
                System.out.println("NON");
            }
        }
    }

    //***************** HELPER FUNCTIONS ******************

    /*
     * Return time difference in minutes
     */
    public static int timeDiff(String first, String second){

        int firstInMin = Integer.parseInt(first.split(":")[0])*60 + Integer.parseInt(first.split(":")[1]);
        int secondInMin = Integer.parseInt(second.split(":")[0])*60 + Integer.parseInt(second.split(":")[1]);

        return secondInMin - firstInMin;

    }

    public static boolean isNight(String sunRise, String sunSet, String start, String finish){

        if(timeDiff(sunRise, start) < 0){
            if(timeDiff(start, sunRise) - timeDiff(sunRise, finish) >= 0){
                return true;
            }
        }
        else if(timeDiff(sunSet, finish) > 0){
            if(timeDiff(sunSet, finish) - timeDiff(start, sunSet) >= 0){
                return true;
            }
        }

        return false;

    }
}
