package start;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileList {
    
    static String folderPath = "C:\\Users\\bkjms\\Desktop\\java_oop\\final_1\\";
    static Path dirPath = Paths.get(folderPath);
    
    // public static boolean isEmptyDirectory(Path folderPath) throws IOException
    // {
    //     if(Files.isDirectory(folderPath)){
    //         try (Stream<Path> entries = Files.list(folderPath)){
    //             return !entries.findFirst().isPresent();
    //         }
    //     }
    //         return false;
    //     }

    public static void revealFiles() {

        Navigation.menu = false;
    
        File folder = new File(folderPath);
        File files[] = folder.listFiles();
        
        // boolean empty = isEmptyDirectory(dirPath);

        // System.out.println(empty);

        // System.out.println("The file number is " + empty);

    System.out.println("These are the current files:");

    for(File file:files){
        if(file.isFile()){
            System.out.println(file.getName());
            } 
        } HomeButton.returnHome();
        } 

    }
