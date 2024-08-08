// (1) Write a program to create circle class with area function to ƒnd area of circle.

public class AreaOfCircle {

    public static void main(String[] args) {
        circle obj = new circle();
        double a1 = obj.area(10);
        System.out.println(a1);
        double a2 = areaOfRec(10,20);
        System.out.println(a2);

    }

    static double areaOfRec(int x,int y){
        double answer = x*y;
        return answer;
    }
}

class circle {
    double area(int r) {
        double ans;
        ans = Math.PI * r * r;
        return ans;
    }
}