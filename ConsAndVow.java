import java.util.Scanner;

public class ConsAndVow {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter a String");
        String str = sc.nextLine();
        int concount = 0;
        int vowcount = 0;

        for(int j=0; j<str.length(); j++){
            if(str.charAt(j)=='a' || str.charAt(j)=='e' || str.charAt(j)=='i' || str.charAt(j)=='o' || str.charAt(j)=='u' || str.charAt(j)=='A' || str.charAt(j)=='E' || str.charAt(j)=='I' || str.charAt(j)=='O' || str.charAt(j)=='U')
             vowcount++;
        
        else{
            concount++;
        }
    }
    sc.close();
        System.out.println("consonent chhe aatla: "+concount);
        System.out.println("vowel chhe aatla: "+vowcount);
}
}
