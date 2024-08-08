//1. Refine the student manager program to manipulate the student 
// information from files by using the BufferedReader and 
// BufferedWriter.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class StudentInfo {
    public static void main(String[] args) {
        try {
            
            BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt"));
            String line;

            bw.write("het,18\n");
            bw.write("meet,19\n");
            bw.write("vandan,20\n");
            bw.close();
            System.out.println("Successfully wrote data");

            BufferedReader br = new BufferedReader(new FileReader("student.txt"));
            while ((line = br.readLine()) != null) {
                String name_age[] = line.split(",");
                String name = name_age[0];
                int age = Integer.parseInt(name_age[1]);
                student s = new student(name, age);
                System.out.println(s);
            }
            br.close();

        } catch (Exception e) {
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