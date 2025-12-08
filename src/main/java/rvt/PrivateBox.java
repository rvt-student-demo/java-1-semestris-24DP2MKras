package rvt;

public class PrivateBox {
    private double width;
    private double height;
    private double length;

    public PrivateBox(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
    public PrivateBox(double side){

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
     PrivateBox box = new  PrivateBox( 2.5, 5.0, 6.0 ) ;

     System.out.println( "Area: "  + box.area() + " volume: " + box. volume() );

     System.out.println( "length: " + box.length + " height: " + box. height +
                         " width:  " + box.width )  ;

  }
}

    


