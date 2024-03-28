package start;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeButton {
    public static void returnHome(){
        
        Navigation.menu = false;

        System.out.println("Press 0 to return to the home screen");
        
        int keyPress;

        while(true){
            try{
                keyPress = ApplicationStart.sc.nextInt();  
                if(keyPress == 0){
                    ApplicationStart.startApplication();
                     Navigation.menu = true;
                    } 
                    else if(keyPress !=0){
                    System.out.println("You must press 0 to return to the main menu.");
                    }
            } 
        catch (InputMismatchException e){
                // System.out.println("Please hit a number not a character from Home Button");
                ApplicationStart.sc.nextInt();
                }
    }
}
}