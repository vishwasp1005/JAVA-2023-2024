import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your string here: ");
        String st = sc.nextLine();
        String newst = "";

        for(int i=st.length()-1; i>=0; i--){
            newst = newst + st.charAt(i);
        }
        if(st.equals(newst)){
            System.out.println("string is pelindrom");
        }
        else{
            System.out.println("string is not pelindrom");
        }

        System.out.println("enter a number: ");
        int a = sc.nextInt();
        int b = 0;

        while(a > 0){

        b = (b * 10) + (a % 10);
        a = a /10;

        }
        sc.close();
    }
}
