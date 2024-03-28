package start;
import java.io.File;
import java.util.Scanner;

public class Deletion {
    public static void deleteFile(){

        Navigation.menu = false;

        System.out.println("Type in the name of the file you would like to delete.");

        Scanner sc4 = new Scanner(System.in);
        String deletedFileName = sc4.nextLine();

        File deletedFile = new File(deletedFileName);

        if(deletedFile.delete()){
            System.out.println("You have deleted the following file: " + deletedFileName);    
            Navigation.menu = false;
        } else{
            System.out.println("The file was not deleted.");
            Navigation.menu = false;
        }        
        HomeButton.returnHome();
    }
}
