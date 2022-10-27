package copy_File;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Main {
    private static void  copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            ObjectInputStream ois = new ObjectInputStream(is);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = ois.read(buffer)) > 0) {
                oos.write(buffer, 0, length);
            }
            oos.close();
            ois.close();
        }finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {
        File file1 = new File("C:\\Users\\ASUS\\Desktop\\Máy tính\\Modull_2\\Thuchanh271022\\src\\copy_File\\test1.csv");
        File file2 = new File("C:\\Users\\ASUS\\Desktop\\Máy tính\\Modull_2\\Thuchanh271022\\src\\copy_File\\test2.csv");
        try{
            copyFileUsingJava7Files(file1, file2);
            copyFileUsingStream(file1, file2);
            System.out.print("Copy completed");
        }catch (IOException e) {
            System.out.print("Can't copy that file");
            System.out.print(e.getMessage());
        }
    }

}