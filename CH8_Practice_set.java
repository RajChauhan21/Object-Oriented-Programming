package Object_Oriented_programming;

class employ{
int salary;
String name;
public int getSalary(){
    return salary;
    }
public String getName(){
    return name;
}
public void setName(String name1){
     name = name1;
}
}

class smartphone{
    public void ring(){
        System.out.println("Ringing.......");
    }
    public void vibrate(){
        System.out.println("Vibrating........");
    }
    public void call(){
        System.out.println("Calling to Ram..........");
    }
    public void batterylevel(){
        System.out.println("Battery Low! , connect to Charger");
    }
}

class square{
    int side;
    public int area(){
        return side*side;
    }
    public int getSide(){
        return side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class rectangle{
    int length;
    int width;
    public int area(){
        return length*width;
    }
    public int perimeter(){
        return (length+width)*2;
    }
}

class vicecity{
    public void hit(){
        System.out.println("Tommy is Hitting the Enemy");
    }
    public void run(){
        System.out.println("Tommy Running behind the cars");
    }
    public void fire(){
        System.out.println("Tommy Firing against cops");
    }
    public void passed(){
        System.out.println("Mission passed! ");
        System.out.println(" + 250$");
    }
}

class circle{
    float pye;
    int radius;
    public float area(){
        return  (pye*radius*radius);
    }
    public float perimeter(){
        return 2*pye*radius;
    }



}

public class CH8_Practice_set{
    public static void main(String[] args) {
        //Que 1
//        Object_Oriented_programming.employ info = new Object_Oriented_programming.employ();
//        info.name = "Raj";
//        info.salary = 800000000;
//        System.out.println(info.name);
//        System.out.println(info.salary);
//        int salary = info.getSalary();
//        System.out.println(salary);
//        String name = info.getName();
//        System.out.println(name);
//        info.setName("Ram");
//        System.out.println(info.getName());

        //Que 2
//        Object_Oriented_programming.smartphone samsung = new Object_Oriented_programming.smartphone();
//        samsung.ring();
//        samsung.vibrate();
//        samsung.call();
//        samsung.batterylevel();

        //Que 3
//        Object_Oriented_programming.square calculate = new Object_Oriented_programming.square();
//        calculate.side = 10;
//        System.out.println("Area of the Object_Oriented_programming.square is " + calculate.area());
//        System.out.println( "perimeter of the Object_Oriented_programming.square is " + calculate.perimeter());
//        int side = calculate.getSide();
//        System.out.println(calculate.side);

        //Que 4
//        Object_Oriented_programming.rectangle sum = new Object_Oriented_programming.rectangle();
//        sum.length = 10;
//        sum.width = 8;
//        System.out.println("Area of the Object_Oriented_programming.rectangle is " + sum.area());
//        System.out.println("perimeter of the Object_Oriented_programming.rectangle is " + sum.perimeter());

        //Que 5
//        Object_Oriented_programming.vicecity tommy = new Object_Oriented_programming.vicecity();
//        tommy.hit();
//        tommy.run();
//        tommy.fire();
//        tommy.passed();

        //Que 6
//        circle1 calc = new circle1();
//        calc.pye = 3.14f;
//        calc.radius = 6;
//        System.out.println("Area of the Object_Oriented_programming.circle is " + calc.area());
//        System.out.println("Perimeter of the Object_Oriented_programming.circle is " + calc.perimeter());
//



    }
}
