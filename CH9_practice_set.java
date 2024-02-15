package Object_Oriented_programming;

class cylinder{
    private int radius;
    private int height;
    private int length;
    private int breadth;

    public cylinder(){ //Que 3
        radius = 8;
        height = 12;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfacearea(){ //Que 2
        return 2*Math.PI*radius*radius+2*3.14*radius*height;
    }

    public double volume(){ //Que 2
        return Math.PI*radius*radius*height;
    }
}

class rectangl{
    int length;
    int breadth;

    public rectangl(){
        length = 10;
        breadth = 25;
    }

    public rectangl(int l , int b){
        length = l;
        breadth = b;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

class sphere{
    int radius;
    int height;
    public sphere(){
        radius = 4;
        height = 7;
    }
    public sphere(int r , int h){
        radius = r;
        height = h;
    }
    public double surfacearea(){
        return 4*Math.PI*radius;
    }
    public double volume(){
        return 4/3*Math.PI*radius*radius*radius;
    }

    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }
    public void setRadius(int r){
        radius = r;
    }
    public void setHeight(int h){
        height = h;
    }
}

public class CH9_practice_set {
    public static void main(String[] args) {
        //Que 1
//        Object_Oriented_programming.cylinder sum = new Object_Oriented_programming.cylinder();
//        sum.setRadius(5);
//        sum.setHeight(10);
//        System.out.println(sum.getHeight());
//        System.out.println(sum.getRadius());

        //Que 2
//        Object_Oriented_programming.cylinder sum1 = new Object_Oriented_programming.cylinder();
//        sum1.setRadius(6);
//        sum1.setHeight(12);
//        System.out.println("Surface of Object_Oriented_programming.cylinder is " + sum1.surfacearea());
//        System.out.println( "Volume of the Object_Oriented_programming.cylinder is " + sum1.volume());

        //Que 3
//        System.out.println(sum1.getRadius());
//        System.out.println(sum1.getHeight());

        //Que 4
//        Object_Oriented_programming.rectangl sum = new Object_Oriented_programming.rectangl(7,21);
//        System.out.println(sum.getLength());
//        System.out.println(sum.getBreadth());

        //Que 5
        sphere sus = new sphere(9,19);
//        sus.setRadius(8);
//        sus.setHeight(29);
        System.out.println(sus.getRadius());
        System.out.println(sus.getHeight());
//        System.out.println(sus.surfacearea());
//        System.out.println(sus.volume());



    }
}
