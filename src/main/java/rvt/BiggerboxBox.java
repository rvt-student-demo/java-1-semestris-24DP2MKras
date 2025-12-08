package rvt;

public class BiggerboxBox {
    public double width;
    public double height;
    public double length;

    public BiggerboxBox(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
    public BiggerboxBox(double side){

    }

    public BiggerboxBox(BiggerboxBox oldBox) {
        this.length = oldBox.length;
        this.height = oldBox.height;
        this.width = oldBox.width;
    }

    public BiggerboxBox biggerBox() {
        return new BiggerboxBox(
            1.25 * this.width,
            1.25 * this.height,
            1.25 * this.length
        );
    }

    public BiggerboxBox smallerBox() {
        return new BiggerboxBox(
            0.75 * this.width,
            0.75 * this.height,
            0.75 * this.length
        );
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
     BiggerboxBox oldBox = new BiggerboxBox(2.5, 5.0, 6.0);
     BiggerboxBox box = new  BiggerboxBox(oldBox);
     BiggerboxBox biggerBox = oldBox.biggerBox();
     BiggerboxBox smallerBox = oldBox.smallerBox();

     System.out.println( "Area: "  + biggerBox.area() + " volume: " + biggerBox. volume() );

     System.out.println( "length: " + biggerBox.length + " height: " + biggerBox. height +
                         " width:  " + biggerBox.width )  ;

  }
}