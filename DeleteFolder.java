package DELETEFILES;

import java.io.File;

public class DeleteFolder {
    public static void main(String[] args) {
        File myObj=new File("/home/muniiramohamed096/muniira");
        if(myObj.delete()){
            System.out.println("Deleted the folder: "+ myObj.getName());
        }else{
            System.out.println("Failed to delete the file. ");
        }
    }
}
