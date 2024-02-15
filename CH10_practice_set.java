package Object_Oriented_programming;

class circle1 {
    int radius = 8;
    int s;
    String name;
     public circle1(){
         System.out.println("I am a Object_Oriented_programming.circle constructor");
    }
public circle1(int r){
         System.out.println("I am a Object_Oriented_programming.circle constructor" + r);
    }

    public double area (){
        return Math.PI*radius*radius;
    }

    public double volume(){
         return Math.PI*radius*radius;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class cylinder1 extends circle1{
    int c;
    int height = 10;
    public cylinder1(){
//        super(4);
        System.out.println("I am a constructor from Object_Oriented_programming.cylinder1 class ");
    }
public cylinder1(int r,int m){
        super(r);
        System.out.println("I am a constructor from Object_Oriented_programming.cylinder1 class " + m);
    }

    public double volumec() {
    return Math.PI*radius*radius*height;
    }
    public double areac(){
        return 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
    }
    public int ans(int f){
        return f;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}

class rectangular{
    int width;
    int height;
    int length;

    public rectangular(){
        System.out.println("I am a default constructor form Object_Oriented_programming.rectangular class");
    }

    public rectangular(int w){
        width = w;
        System.out.println(width);
    }
    public int volume(){
        return length*width*height;
    }

    public int surfacearea(){
        return length*width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}

class cuboid extends rectangular{

    public cuboid(){
//        super(3);
        System.out.println("I am a default constructor from Object_Oriented_programming.cuboid class");
    }
    public cuboid(int w,int h){
        super(w);
        System.out.println("I am a overloaded constructor from Object_Oriented_programming.cuboid class " + h);
    }
    public double surfaceareac(){
        return 2*(length * width + width * height + length * height);
    }

    public double volumec(){
        return length*width*height;
    }

}



public class CH10_practice_set {
    public static void main(String[] args) {
        //Que 1
//        System.out.println(n.value(2));
//        n.setName("I am a Object_Oriented_programming.circle");
//        n.setS(21);
//        System.out.println(n.getName());
//        System.out.println(n.getS());

        //Que 3
//        Object_Oriented_programming.cylinder1 cy = new Object_Oriented_programming.cylinder1();
//        System.out.println(cy.areac());
//        System.out.println(cy.volumec());
//        cy.setName("I am a Object_Oriented_programming.cylinder");
//        cy.setS(7);
//        cy.setC(21);
//        System.out.println(cy.getC());
//        System.out.println(cy.getS());
//        System.out.println(cy.getName());
//        System.out.println(cy.ans(100));
//        System.out.println(cy.area());
//        System.out.println(cy.volume());

        //Que 2
//        Object_Oriented_programming.rectangular obj = new Object_Oriented_programming.rectangular();
//        System.out.println("Volume of the Object_Oriented_programming.rectangle is " + obj.volume());
//        System.out.println("Surface area of the Object_Oriented_programming.rectangle is " + obj.surfacearea());

//        Object_Oriented_programming.cuboid obc = new Object_Oriented_programming.cuboid(7,21);
//        System.out.println("Volume of the Object_Oriented_programming.cuboid is " + obc.volume());
//        System.out.println("Surface area of the Object_Oriented_programming.cuboid is "+ obc.surfacearea());

        //Que 4
        cuboid obj = new cuboid();
        obj.setHeight(12);
        obj.setLength(10);
        obj.setWidth(4);
        System.out.println("from Object_Oriented_programming.rectangular class - volume " + obj.volume()); // from Object_Oriented_programming.rectangular class
        System.out.println("surface area " + obj.surfacearea()); // from Object_Oriented_programming.rectangular class
        System.out.println("form Object_Oriented_programming.cuboid class " + obj.volumec()); // from Object_Oriented_programming.cuboid class
        System.out.println("surface area " + obj.surfaceareac()); //from Object_Oriented_programming.cuboid class


    }
}
