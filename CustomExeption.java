import java.util.Scanner;

public class CustomExeption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of integers: ");
        int n = sc.nextInt();
        int sum =0;

        for(int i = 0;i < n;i++){
            try{
                System.out.println("enter number for "+ (i+1)+ "");
                int num = sc.nextInt();
                

                if(num<0){
                    throw new NegativeExeption();
                }
                else if((num/10)%2 == 0){
                    throw new DivByHundresExeption();
                }
                else if(num>=1000 && num<=2000){
                    throw new GrThen1000Exeption();
                }
                else if (num > 7000) {
                    throw new GrThen7000Exception();
                }
                else{
                    sum += num;
                }
    
            }
            catch(NegativeExeption e1){
                System.out.println("aa to Negative sankhya 6 bhai!!!");
            }
            catch(DivByHundresExeption e2){
                System.out.println("aa even javab nathi aapto bhai");
            }
            catch(GrThen1000Exeption e3){
               System.out.println("aa taro number hajar thi moto ane be hajar thi nano 6...");
            }
            catch(GrThen7000Exception e4){
                System.out.println("7000 thi moto 6...");
            }
        }
            System.out.println("Sum of the numbers is " + sum);
            sc.close();
        }

        
}

class NegativeExeption extends Exception{
 
}

class DivByHundresExeption extends Exception{
   
}

class GrThen1000Exeption extends Exception{
 
}

class GrThen7000Exception extends Exception{

}