import java.io.FileReader;

public class DigitFive {
    public static void main(String[] args) {
        
        try{
            FileReader fr = new FileReader(args[0]);
            // FileInputStream fis = new FileInputStream(args[0]);
            int chars;
            int count = 0;

            while ((chars = fr.read()) > -1) {
                if(chars == '5'){
                    count ++;
                }
            }
            System.out.println(count);
            fr.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
