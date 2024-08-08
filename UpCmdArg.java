/* (6) Write an application that searches through its command-line argument. If an argument is found that does not begin with 
and upper case letter, display error message and terminate. */

public class UpCmdArg {
    public static void main(String[] args) {
        String s1 = args[0];

        if(s1.charAt(0)>'a' && s1.charAt(0)<'z'){
            System.out.println("bhul 6 bhai");
        }
        else{
            System.out.println(s1);
        }
    }
}
