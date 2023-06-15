import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static List<String> data = new ArrayList<>();

    public static void main(String[] args) {
        readFile();
        writeFile();
    }

    public static List<String> readFile() {
        String filePath = "C://Users//ledac//IdeaProjects//BTTK//src//information.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = reader.readLine()) != null) {
                String pattern = "98[0-9]?2";
                Pattern regexPattern = Pattern.compile(pattern);
                Matcher matcher = regexPattern.matcher(line);

                if(matcher.find()){
                    System.out.println(line);
                    data.add(line);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return data;
    }

    public static void writeFile(){
        String filePath = "C:/Users/ledac/IdeaProjects/BTTK/src/writefile.txt";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            for(String s : data){
                writer.write(s);
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}