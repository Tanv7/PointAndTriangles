package Tanya;

public class Triangle {
    private Point p1,p2,p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Triangle() {
        p1=new Point(0,0);
        p2=new Point(0,0);
        p3=new Point(0,0);
    }

    public double side1len(){
        return sqrt((p2.getX()- p1.getX())*(p2.getX()- p1.getX())
                +(p2.getY()- p1.getY())*(p2.getY()- p1.getY()));
    }
    public double side2len(){
        return sqrt((p3.getX()- p2.getX())*(p3.getX()- p2.getX())
                +(p3.getY()- p2.getY())*(p3.getY()- p2.getY()));
    }
    public double side3len(){
        return sqrt((p3.getX()- p1.getX())*(p3.getX()- p1.getX())
                +(p3.getY()- p1.getY())*(p3.getY()- p1.getY()));
    }

    public double perim(){
        return side1len()+side2len()+side3len();

    }
    public double triangS(){
        return sqrt(perim()/2*(perim()/2-side1len())*
                (perim()/2-side2len())*
                (perim()/2-side3len()));

    }

    @Override
    public String toString() {
        return "Triangle{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                ", p3=" + p3 +
                '}';
    }
}
}
