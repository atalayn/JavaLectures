package src.com.lecture.homework;

public class RockPaperScissorUtilities {

    public String  result (int userNumber, int randomNumber){



        if(userNumber==randomNumber){
            return "tie";

        }else if (userNumber==0 && randomNumber==2){

            return "won";
        }
        else if (userNumber==1 && randomNumber==0){
            return "won";

        }

        else if (userNumber==2 && randomNumber==1){

            return "won";
        }
        else if (userNumber==0 && randomNumber==1){

            return "lost";
        } else if (userNumber==1 && randomNumber==2){
            return "lost";
        }else if (userNumber==2 && randomNumber==0){
            return "lost";
        }else{
            return "invalid";
        }






    }
}
