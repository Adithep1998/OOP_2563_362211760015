package LAB8;

import java.util.ArrayList;

public class Object2DApp {
    public static void main(String[] args) {

        //วงกลม
        Circle c1 = new Circle(10.0);
        c1.calArea();
        System.out.println(c1.getArea());

        //สี่เหลี่ยม
        Rectangle r1 = new Rectangle(5,5);
        r1.calArea();
        System.out.println(r1.getArea());

        //สามเหลี่ยม
        Triangle t1 = new Triangle(5,5);
        t1.calArea();
        System.out.println(t1.getArea());


        ArrayList<Object2D> myObject = new ArrayList<Object2D>();
        myObject.add(c1);
        myObject.add(r1);
        myObject.add(t1);




    }//main
}//class
