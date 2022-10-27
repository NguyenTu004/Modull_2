package copyFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {
    public static void main(String[] args) {
        try{
            FileInputStream inputStream  = new FileInputStream("C:\\Users\\ASUS\\Desktop\\Máy tính\\text.txt");
            FileOutputStream outputStream  = new FileOutputStream("C:\\Users\\ASUS\\Desktop\\Máy tính\\test.txt");
            int text;
            while ((text = inputStream.read()) != -1) {
                outputStream.write(text);
            }
            inputStream.close();
            outputStream.close();
        }catch (Exception e){
            System.out.println();
        }

    }
}
