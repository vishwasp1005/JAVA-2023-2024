import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StudentData {
    public static void main(String[] args) {
        try{
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("studentData.txt"));
            dos.writeUTF("het");
            dos.writeInt(18);

            dos.writeUTF("meet");
            dos.writeInt(19);

            dos.writeUTF("Vandan");
            dos.writeInt(20);

            dos.close();

            DataInputStream dis = new DataInputStream(new FileInputStream("studentData.txt"));
            while (dis.available() > 0) {
                String name = dis.readUTF();
                int age = dis.readInt();

                student s = new student(name, age);
                System.out.println(s);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
class student{
    int age;
    String name;

    public student(String name, int age){
        this.name= name;
        this.age = age;
    }

    public String toString(){
        return "name: "+name+" age: "+age;
    }
}