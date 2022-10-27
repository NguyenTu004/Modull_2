package file_text_Max;

import java.io.*;
import java.util.*;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath){
        List<Integer> number = new ArrayList<Integer>();
        try{
            File file = new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader( new FileReader( file));
            String line = "";
            while ((line = br.readLine()) != null){
                number.add(Integer.parseInt(line));
            }
            br.close();
        }catch (Exception e){
            System.err.println("File khong ton tai hoac noi dung co loi!!");
        }
        return number;
    }
    public void writeFile(String filePath, int max){
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Gia tri lon nhat la: "+max);
            bufferedWriter.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }

        }
        return max;
    }
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("C:\\Users\\ASUS\\Desktop\\Máy tính\\text.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("C:\\Users\\ASUS\\Desktop\\Máy tính\\text.txt", maxValue);
    }
}

