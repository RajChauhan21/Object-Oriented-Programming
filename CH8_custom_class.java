package Object_Oriented_programming;

class employee{
    int id; // for both
    String name; //for both
     String brand; //for car
    float plevel; //for Object_Oriented_programming.employee
    float rvalue; // for car
    int salary; // for Object_Oriented_programming.employee
    int price; // for car
    boolean opinion; // for both
    public void employ(){
        System.out.println("Employee id no. is : " + id);
        System.out.println("Name of the Employee : " + name);
        System.out.println("Productivity levels of the Object_Oriented_programming.employee (in %) : " + plevel+"%");
        System.out.println("Company/Organization opinion about the Object_Oriented_programming.employee : " + opinion);
        System.out.println("salary of  the Object_Oriented_programming.employee (in crores) : " + salary);

    }
    public int getPrice(){
        return price;
    }

    public int getSalary(){
        return salary;
    }

    public void carinfo(){
        System.out.println("Car id no. is : " + id);
        System.out.println("Name of the car : " + name);
        System.out.println("Brand of the car : " + brand);
        System.out.println("Resale value of the car (in %) : " + rvalue+"%");
        System.out.println("Customer's opinion about the car : " + opinion);
        System.out.println("Price of  the car (in lakhs) : " + price);
    }
}

public class CH8_custom_class {
    public static void main(String[] args) {
//        System.out.println("TVS RONIN");

        employee job = new employee(); // calling a class , for creating a object
        employee car = new employee();
        // calling with it's reference to the methods
        // Also setting Attributes

        // for job
        job.id = 21;
        job.name = "Raj";
        job.plevel = 100.0f;
        job.opinion = true;
        job.salary = 80;

        // for car
        car.id = 1021;
        car.name = "Scorpio";
        car.brand  = "Mahindra";
        car.rvalue = 90f;
        car.opinion = true;
        car.price = 18;

        //Printing the attributes
//        job.employ();
//        car.carinfo();
int price = car.getPrice();
        System.out.println(price);

        int salary = job.getSalary();
        System.out.println(salary);


    }
}
