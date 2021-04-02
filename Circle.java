package test1;

public class Circle extends GeometricObject{

    private double radius;
    private final double PI = 3.141;

    public Circle (double radiusGiven){
        radius=radiusGiven;
    }

    public Circle(){
        radius=0.0;
    }

    public void setRadius (double radiusGiven){
        radius=radiusGiven;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return PI*radius*radius;
    }


}
