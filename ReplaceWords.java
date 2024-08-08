import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.BufferOverflowException;

public class ReplaceWords {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("abcd.txt"));
            BufferedWriter br1 = new BufferedWriter(new FileWriter("Newabcd.txt")); 
            String line;
            int count = 0;

            while ((line = br.readLine()) != null) {
                count++;
                  line = line.replace("meet", "mann");
                  br1.write(line);
                  br1.newLine();
            }
            br.close();
            br1.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
