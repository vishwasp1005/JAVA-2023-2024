// (6) WAP that counts the number of objects created using static.

public class CountObject {
    public static void main(String[] args) {
       GanoObjectNe g1 = new GanoObjectNe();
       GanoObjectNe g2 = new GanoObjectNe();
       GanoObjectNe g3 = new GanoObjectNe();
       GanoObjectNe g4 = new GanoObjectNe();
       GanoObjectNe g5 = new GanoObjectNe();

       System.out.println(GanoObjectNe.count);
    }
}

class GanoObjectNe{

    static int count=0;

    GanoObjectNe(){
       count++;
    }
}