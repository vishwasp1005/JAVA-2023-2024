public class Hello{

    public static void main(String[]args){
        System.out.println("num 1"+ args[0]);
        System.out.println("num 2: "+ args[1]);
        // System.out.println("branch: "+ args[2]);
        // System.out.println("sem: "+ args[3]);

        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]); 
        System.out.println(num1*num2);
        
    }
    
}