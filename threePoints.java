//6(5) 5. Create a class named ThreeDPoint to model a point in a threedimensional space. Let ThreeDPoint be derived from MyPoint with 
// following additional features:
// a. A data fields named z that represents the z-coordinate.
// b. A no-arg constructor that creates a point (0, 0, 0).
// c. A constructor that constructs a point with three specified 
// coordinates.
// d. A get method that returns the z value.
// e. Override the distance method to return the distance between 
// two points in the three-dimensional space.
// f. Write a program that creates two points (0, 0, 0) and (10, 
// 30, 25.5) and display the distance between the two points.

public class threePoints {
    public static void main(String[] args) {
        ThreeDPoint t1 = new ThreeDPoint(10,20,30);
        ThreeDPoint t2 = new ThreeDPoint(78,45,46);

        System.out.println(t1.distance(t2));
        System.out.println(t1.distance(50, 20, 30));
    }
}

class ThreeDPoint extends MyPoints {
    double z;

    public ThreeDPoint() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public ThreeDPoint(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public double distance(ThreeDPoint temp) {
        double pntx = this.x - temp.x;
        double pnty = this.y - temp.y;
        double pntz = this.z - temp.z;

        return Math.sqrt((pntx * pntx) + (pnty * pnty) + (pntz * pntz));
    }

    public double distance(double x, double y, double z) {
        double pntx = this.x - x;
        double pnty = this.y - y;
        double pntz = this.z - z;

        return Math.sqrt((pntx * pntx) + (pnty * pnty) + (pntz * pntz));
    }
}