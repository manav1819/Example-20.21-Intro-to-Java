package test1;

public class Rectangle extends GeometricObject{

    private double length;
    private double width;

    public Rectangle(double lengthGiven, double widthGiven){
        length=lengthGiven;
        width=widthGiven;
    }

    public Rectangle(){
        length=0.0;
        width=0.0;
    }

    public void setLength(double lengthGiven){
        length=lengthGiven;
    }

    public void setWidth(double widthGiven){
        width=widthGiven;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public double getArea(){
        return length*width;
    }

}

