import java.io.*;
import java.util.ArrayList;


public class Assignment1 {
    public static ArrayList<String> fileList=new ArrayList<String>();
    public static void main(String args[]){
        listDirectory("/home");
        displayFiles(fileList);
    }

    public static void displayFiles(ArrayList<String> fileList) {
        for (String filePath:fileList){
            System.out.println(filePath);
        }
        if (fileList.size()==0){
            System.out.println("No match found");
        }
    }

    public static void listDirectory(String path){
        File dir = new File(path);
        File[] files = dir.listFiles();

        if (files != null && files.length > 0) {
            for (File file : files) {
                // Check if the file is a directory
                if (file.isDirectory()) {
                    listDirectory(file.getAbsolutePath());
                } else {
                    String fileName=file.getName();
                    if (fileName.matches(".*\\b.java\\b.*") ){
                        fileList.add(file.getAbsolutePath() +" " +fileName);

                    }
                }
            }
        }
    }
}