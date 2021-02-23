package LAB8;

public abstract class Object2D {
    //atrribute
    private String b_color;
    private double area;


    abstract public void calArea();

    //getter and setter
    public String getB_color() {
        return b_color;
    }

    public void setB_color(String b_color) {
        this.b_color = b_color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
