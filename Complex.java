/* (5) Deƒne class for Complex number with real and imaginary as data members. Create its contructor, overload the constructors. 
Also deƒne addition method to add two complex objects.*/

import java.util.Scanner;

public class Complex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        complex num = new complex(a,b);
        num.sum(num.real , num.imaginary);
        sc.close();
    }
   
}
class complex{
    int real;
    int imaginary;

   public complex(int a, int b) {
       real = a;
       imaginary = b;
   }

   void sum(int a, int b) {
       System.out.println(a + "+i" + b);
   }
}