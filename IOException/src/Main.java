import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static List<String> nodo = new ArrayList<>();
    public static void main(String[] args) {
        readFile();
        writeFile();
    }
    public static List<String> readFile(){
        String filePath = "C:/Users/ledac/IdeaProjects/ReadWriteFile/src/file.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null){
                if(line.contains("NODO training")){

                    nodo.add(line);
                    System.out.println(line);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return nodo;
    }

    public static void writeFile(){
        String filePath = "C:/Users/ledac/IdeaProjects/ReadWriteFile/src/write.txt";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            for(String line : nodo) {
                writer.write(line);
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}