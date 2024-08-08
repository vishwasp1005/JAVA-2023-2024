// 7*

public class ThisDemo {
    public static void main(String[] args) {
        abc obj = new abc(12);
        obj.print();
    }
}

class abc{
    static int s = 10;
    int a = 5;

    public abc(int a){
        this.a = a;
    }

    void print(){
        System.out.println(abc.s);
        System.out.println(a);
    }
}