package start;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Search {
    
    static String folderPath = "C:\\Users\\bkjms\\Desktop\\java_oop\\final_1\\";
    static int fileFound;

    public static void searchFile(){  
        
        Navigation.menu = false;

        System.out.println("Please enter the file path to search for:");
        
        String fileChoiceTest = ApplicationStart.sc.next();

        System.out.println(fileChoiceTest);
        // Scanner sc2 = new Scanner(System.in);
        // String fileChoice = sc2.nextLine();

//Get the path of the folder

        File folder = new File(folderPath);

//List out all the folders and files within the current directory
        File files[] = folder.listFiles();

//Create an empty arraylist that will be populated with only the files from the folder
        ArrayList<File> filesOnly = new ArrayList<File>();

//Loop through the folders and files to filter out folders and add the files to the filesOnly arraylist
        for(int i = 0; i<files.length; i++){
            if(files[i].isFile()){
                filesOnly.add(files[i]);
            }
        }

        Collections.sort(filesOnly);

//Test to see the filesOnly arraylist is properly filtered
        // for(File file : filesOnly){
        //     System.out.println(file);
        //     System.out.println("I printed somthing");
        // }
       
//Test the size of the filtered arraylist
        // System.out.println(filesOnly.size());

    for(int i = 0; i<filesOnly.size(); i++){
        String fileName = filesOnly.get(i).getName();

        if(fileChoiceTest.equalsIgnoreCase(fileName)){
            System.out.println("Your file has been found!");
            fileFound = 1;
             }  
        }

        if(fileFound == 0){
            System.out.println("Sorry, your file could not be found.");
        }
        HomeButton.returnHome();
    } 
}
// for(File file: filesOnly){
        
//         if(fileChoice.equalsIgnoreCase(fileName)){
//             System.out.println("Your file has been found!");
//             fileFound = 1;
//             return;
//         }
//     }
