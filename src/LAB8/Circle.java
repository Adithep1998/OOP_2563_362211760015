package LAB8;

public class Circle extends Object2D{

    //con
    private static final double PI = 3.141;
    //attribute
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calArea() {
        //circle area = PI * (r*r)
        double area = PI * radius * radius;
        super.setArea(area);
    }


}
