package Object_Oriented_programming;

class base{ // Object_Oriented_programming.base class is called as super class and parent class
    int x;
    private int g;
    public void printme(){
        System.out.println("I am a method");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }
}

class fax extends base{ // This class is also called as sub class as well as child class
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class animal{
    String color;
    float height;
    public void breed() {
        System.out.println("Breed of the Object_Oriented_programming.dog is labro");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}

class dog extends animal{
    int price;
    String name;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


public class CH10_Inheritance {
    public static void main(String[] args) {
        base cr = new base();
//        cr.setX(21);
//        System.out.println(cr.getX());
//        cr.printme();

        fax sr = new fax();

//        sr.setX(34);
//        System.out.println(sr.getX());
//        sr.setY(30);
//        System.out.println(sr.getY());
//        sr.printme();

        dog info = new dog();
        info.setColor("dusky");
        info.setHeight(5.10f);
        info.breed();
        info.setPrice(15000);
        info.setName("tommy");
        System.out.println(info.getColor());
        System.out.println(info.getHeight());
        System.out.println(info.getPrice());
        System.out.println(info.getName());

    }
}
