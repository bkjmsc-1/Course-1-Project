package start;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Addition {
    public static void addFiles(){

        Navigation.menu = false;
        System.out.println("Type the file name you would like to add.");
        System.out.println("Make sure to include the extenstion.");
        
        Scanner sc3 = new Scanner(System.in);
        String addedFileName = sc3.nextLine();

        try{
            File addedFile = new File(addedFileName);

            if(addedFile.createNewFile()){
                System.out.println("You have added the following file: " + addedFileName);
            } else{
                System.out.println("The file " + addedFileName + " already exists.");
            }

        } catch(IOException e){
            e.printStackTrace();
        }
        HomeButton.returnHome();
    }   
}
