package rvt;

public class BoxConstructorAcces {
    private double width;
    private double height;
    private double length;

    public BoxConstructorAcces(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
    public BoxConstructorAcces(double side){

    }

    public BoxConstructorAcces(BoxConstructorAcces oldBox) {
        this.length = oldBox.length;
        this.height = oldBox.height;
        this.width = oldBox.width;
    }
    

    public double area() {
       return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
    }
    private double faceArea() {
        return width * height;
    }
    private double topArea() {
        return length * width;
    }
    private double sideArea() {
        return height * length;
    }

    public double volume(){
        return width * length * height; 
    }
    public static void main ( String[] args )
  {
     BoxConstructorAcces oldBox = new BoxConstructorAcces(2.5, 5.0, 6.0);
     BoxConstructorAcces box = new  BoxConstructorAcces(oldBox) ;

     System.out.println( "Area: "  + box.area() + " volume: " + box. volume() );

     System.out.println( "length: " + box.length + " height: " + box. height +
                         " width:  " + box.width )  ;

  }
}

