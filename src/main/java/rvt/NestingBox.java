package rvt;

public class NestingBox {
    public double width;
    public double height;
    public double length;

    public NestingBox(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
    public NestingBox(double side){

    }

    public NestingBox(NestingBox oldBox) {
        this.length = oldBox.length;
        this.height = oldBox.height;
        this.width = oldBox.width;
    }

    public NestingBox biggerBox() {
        return new NestingBox(
            1.25 * this.width,
            1.25 * this.height,
            1.25 * this.length
        );
    }

    public NestingBox smallerBox() {
        return new NestingBox(
            0.75 * this.width,
            0.75 * this.height,
            0.75 * this.length
        );
    }
    public boolean nests(NestingBox outsideBox) {
        return this.width < outsideBox.width &&
            this.height < outsideBox.height &&
            this.length < outsideBox.length;
        
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
     NestingBox oldBox = new NestingBox(2.5, 5.0, 6.0);
     NestingBox box = new  NestingBox(oldBox);
     NestingBox biggerBox = oldBox.biggerBox();
     NestingBox smallerBox = oldBox.smallerBox();

     System.out.println( "Area: "  + biggerBox.area() + " volume: " + biggerBox. volume() );

     System.out.println( "length: " + biggerBox.length + " height: " + biggerBox. height +
                         " width:  " + biggerBox.width )  ;
     System.out.println("Is this box fitting inside the outside box? " + smallerBox.nests(box));

  }
}