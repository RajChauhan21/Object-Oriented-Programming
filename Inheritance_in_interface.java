package Object_Oriented_programming;
interface cube{
    void cuboid();
    void cube();
    default void circle(){
        cubox(); // for accessing private methods in interface
        System.out.println("sir kal");
    }
    private void cubox(){
        System.out.println("cube ox");
    }
}
interface box extends cube{
    void box1();
    void box2();
    default void pain(){
        System.out.println("Pain is temporary , pride is forever.");
    }

}
class shape implements box{
    public void box1(){
        System.out.println("boxy loxy");
    }
    public String[] name(){
        String[] num = {"square" , "Rectangle" , "Circle" , "Cube" , "Rhombus"};
        return num;
    }
    public void box2(){
        System.out.println("Crunchy crunch");
    }
    public void cuboid(){
        System.out.println("kyu boid");
    }
    public void cube(){
        System.out.println("CR");
    }
}
public class Inheritance_in_interface {
    public static void main(String[] args) {
        shape s = new shape();
//        s.circle();
        String[] arr = s.name();
        for(String shapes:arr){
            System.out.println(shapes);
        }
    }

}
