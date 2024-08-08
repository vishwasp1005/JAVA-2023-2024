// 6(4)esign a class named MyPoint to represent a point with x and y coordinates. The class contains:
// a. The data fields x and y that represent the coordinates with 
// getter methods.
// b. A no-arg constructor that creates a point (0, 0).
// c. A constructor that constructs a point with specified 
// coordinates.
// d. A method named distance that returns the distance from this 
// point to a specified point of the MyPoint type.
// e. A method named distance that returns the distance from this 
// point to another point with specified x- and y-coordinates.


public class Points {
    public static void main(String[] args) {
        MyPoints p1 = new MyPoints(4d,2d);
        MyPoints p2 = new MyPoints(8d, 9d);

        System.out.println(p1.distance(p2));
        System.out.println(p1.distance(20, 10));
    }
}

class MyPoints{
    double x;
    double y;

    MyPoints(){
        this.x = 0;
        this.y = 0;
    }

    MyPoints(Double x,Double y){
        this.x = x;
        this.y = y;
    }

    public double distance(MyPoints temp){
        
        double pntx = this.x - temp.x;
        double pnty = this.y - temp.y;

        return Math.sqrt((pntx*pntx) + (pnty * pnty));
    }

        public double distance(double x , double y){
            double pntx = this.x - x;
            double pnty = this.y - y;

            return Math.sqrt((pntx*pntx) + (pnty * pnty));
        }

    // public double getX() {
    //     return x;
    // }

    // public double getY() {
    //     return y;
    // }

}