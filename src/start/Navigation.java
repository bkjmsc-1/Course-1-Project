package start;
public class Navigation{

    public static boolean menu = false;

    public static void navigate(int choice){

        System.out.println(menu);

        if(menu){

            if(choice == 1){
                FileList.revealFiles();
            } else if(choice == 2){
                Addition.addFiles();
            } else if(choice == 3){
                Deletion.deleteFile();
            } else if (choice == 4){
                Search.searchFile();
            } else if (choice == 5){
                Close.closeProgram();
            }
        } else {
            HomeButton.returnHome();
            }
    } 
}
