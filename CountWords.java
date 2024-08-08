import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class CountWords {

    public static void main(String[] args) {
        try{
            // FileInputStream fis = new FileInputStream("abcd.txt");
            int line = 0;
            int chars = 0;
            int words = 0;

            BufferedReader br = new BufferedReader(new FileReader("abcd.txt"));
            String data;

            while ((data = br.readLine()) != null) {
                line++;
                chars += data.length();

                String[] newWords = data.split("\\s+");
                words += newWords.length;
            }
            System.out.println("Total Characters are: "+chars);
            System.out.println("Total words are: "+words);
            System.out.println("Total lines are: "+line);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}