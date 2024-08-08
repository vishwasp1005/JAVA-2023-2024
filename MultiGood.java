// 1* Write an application that executes two threads. One thread 
// displays "Good Morning" every 1000 milliseconds & another thread 
// displays "Good Afternoon" every 3000 milliseconds. Create the 
// threads by implementing the Runnable interface.


public class MultiGood {
    public static void main(String[] args) {
        Runnable r1 = new good("Morning!", 1000);
        Runnable r2 = new good("Afternoon!",3000);
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();

        //jo only thread thi karie to runnable ni jagya e direct thread kri ne ema j pass kari devana.
    }    
}

class good implements Runnable{
    String data;
    int delay;

    public good(String data, int delay){
        this.data = data;
        this.delay = delay;
    }
    public void run(){
        try {
            while (true) {
                System.out.println(data);
                Thread.sleep(delay);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
