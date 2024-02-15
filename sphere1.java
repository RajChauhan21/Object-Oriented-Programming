package Object_Oriented_programming;
 class rectangle1{
    int length;
    int radius;
    int breadth;
    int height;
    int side;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public double recsa(){
        return length*breadth;
    }
    public double recvol(){
        return length*breadth*height;
    }
}

class square1 extends rectangle1{
    public double squaresa(){
        return side*side;
    }

}

class circle2 extends square1{
    public double circlevol(){
        return 4/3*Math.PI*radius*radius*radius;
    }

    public  double circlsa(){
        return Math.PI*radius*radius;
    }
}
class cylinder2 extends circle2{
    public double cylinsa(){
        return 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
    }

    public double cylindervol(){
        return Math.PI*radius*radius*height;
    }
}

public class sphere1 extends cylinder2{
    public double sphervol(){
        return 4/3*Math.PI*radius*radius*radius;
    }
    public double sphersa(){
        return Math.PI*radius*radius;
    }
}



