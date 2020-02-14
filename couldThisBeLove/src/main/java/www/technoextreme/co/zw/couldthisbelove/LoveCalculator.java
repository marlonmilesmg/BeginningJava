package www.technoextreme.co.zw.couldthisbelove;

import java.util.Random;

public class LoveCalculator {

    public static void main(String[] args) {
            System.out.println("Your love score is: " + ifYouHadMyLove("Mr. X", "Miss Y"));
    }

    public static int ifYouHadMyLove(String yourName, String herName){
        Random randObject = new Random();
        int loveScore = randObject.nextInt(101);

        if(loveScore > 80){
            System.out.println("You love each other like bhurugwa nebhande");
        } else if(loveScore > 40){
            System.out.println("Something like that. Ndizvowowo");
        } else {
            System.out.println("No love found, Try harder!!!");
        }
        return loveScore;
    }
}
