package start;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ApplicationStart {

    public static boolean menu = false;

    public static Scanner sc = new Scanner(System.in);
    
        public static void startApplication(){
        
            System.out.println(menu);
        menu = true;
        Menu.displayOptions();
        while(true){
            
            try{


            int choice = sc.nextInt();

            if(choice >= 0 & choice<6){
                Navigation.navigate(choice);
            } else{
                System.out.println("You must enter a proper number from the menu.");
            }
            }catch(InputMismatchException e){
                System.out.println("Characters are not allowed."); 
            }
        }
    }
}
