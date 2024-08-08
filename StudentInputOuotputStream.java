import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

public class StudentInputOuotputStream {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("hetbhai.txt");
            FileInputStream fis = new FileInputStream("hetbhai.txt");

          
            String []s = {
                       "vandan, 19",
                        "meet, 17",
                        "het, 18"
            };

            // fos.write(s1.getBytes());
            // fos.write(s2.getBytes());
            // fos.write(s3.getBytes());
            byte[] b = s.getBytes();
            fos.write(b);
            fos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// class student{
//     int age;
//     String name;

//     public student(String name, int age){
//         this.name= name;
//         this.age = age;
//     }

//     public String toString(){
//         return "name: "+name+" age: "+age;
//     }
// }