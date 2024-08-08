import java.util.Scanner;
public class LengthOfString {
 public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("enter a string: ");
    String str = sc.nextLine();

    System.out.println(str.length());
    String str2 = "";

    for(int i = str.length()/2; i<str.length(); i++){
        // System.out.println(str.charAt(i));
        str2=str2+str.charAt(i);
    }
    System.out.println(str2);
    sc.close();
 }   
}
