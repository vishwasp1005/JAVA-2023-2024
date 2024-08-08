// 2* Write a program to create two threads, one thread will print odd 
// numbers and second thread will print even numbers between 1 to 20 
// numbers.

public class OddEvenThread {
    public static void main(String[] args) {
        Runnable r1 = new bhega("odd");
        Runnable r2 = new bhega("even");

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}

class bhega implements Runnable {

    String s1;

    public bhega(String s1) {
        this.s1 = s1;
    }

    public void run() {

        try {

            if (s1.equals("even")) {
                for (int i = 2; i <= 20; i+=2) {
                    System.out.println("Even number is: " + i);
                    Thread.sleep(500);
                }
            }
            else if(s1.equals("odd")){
                for (int i = 1; i <= 20; i+=2) {
                    System.out.println("Odd number is: " + i);
                    Thread.sleep(500);
                }
            }
            else{
                System.out.println("na hoi....");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
