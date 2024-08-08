// 7(2)Write a program that illustrates interface inheritance. Interface 
// A is extended by A1 and A2. Interface A12 inherits from both P1 
// and P2.Each interface declares one constant and one method. Class 
// B implements A12.Instantiate B and invoke each of its methods. 
// Each method displays one of the constants

public class InterfaceInherItance {

    public static void main(String[] args) {
        B obj = new B();
        obj.a();
    }
}  
// interface B{

// }
// abstract class C{

// }
// class A extends C implements B{
    
// }   
interface A{
    int a = 1;
    public void a();
}
interface A1 extends A{
    int b =2;
    public void a();
}
interface A2 extends A{
    int c= 3;
    public void a();
}
interface A12 extends A1,A2{
    int d = 4;
    public void a();
}
class B implements A12{
    public void a(){
        System.out.println("bhai bhai...");
    }
}