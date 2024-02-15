package Object_Oriented_programming;

class retrob{
    private int id;
    private String name;
    private int model;
    public  retrob(){       //constructor
        id = 1021;
        name = "Yamaha Fzx"; // Constructors can be overloaded
        model = 210;
    }
    public  retrob(String  newname , int num , int nm ){ //constructor
        id = num;
        name = newname;
        model = nm;
    }

    public String getName() {
        return name;
    }
    public int getModel(){
        return model;
    }
    public void setName(String n) {
        name = n;
    }
public void setId(int id){
        this.id = id;
}
    public int getId() {
        return id;
    }
}

class employ1{
    int nw;
    int salary;
    String name;
    public employ1(int sal1){
        salary = sal1;
    }
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String name1){
        name = name1;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}

class student{
    private String name;
    private int rollnumber;
    private int grnumber;
    private String address;
    public student(){         //constructor
        rollnumber = 34;
        grnumber = 1021;
        name = "Ram";
        address = "Panvel";
    }
    public student(student ref){ //copy constructor
        rollnumber = ref.rollnumber;
        grnumber = ref.grnumber;
        name = ref.name;
         address = ref.address;
    }
    public void ans(){
        System.out.println(rollnumber);
        System.out.println(grnumber);
        System.out.println(name);
        System.out.println(address);
    }

    public String getName(){
        return name;
    }
    public String setName(String nam){
        name = nam;
        return name;
    }

    public int getRollnumber() {
        return rollnumber;
    }
    public void setRollnumber(int rn){
        if(rn>=10){
            rollnumber = rn;

        }
        else{
            System.out.println("Wrong input");
        }
    }
    public int getGrnumber(){
        return grnumber;
    }
    public void setGrnumber(int gn){
        if(gn<500){
            grnumber = gn;
        }
        else{
            System.out.println("Unable to access");
        }
    }
    public String getAddress(){
        return address;
    }
    public String setAddress(String sA){
        address = sA;
        return address;
    }
}
// private constructor - These constructors can be used with-in the class and cannot be accessed in any other class
class pri {             //always paste main method in your private constructor class to get the output
    int s;
    String country;
    private pri() { //private constructor
        s = 21;
        country = "India";
//        System.out.println(s);
//        System.out.println(country);
    }
    public int getS (){
        return s;
    }
    public void setS(int r){
        s = r;
    }
    public String getCountry(){
        return country;
    }
    public void setCountry(String co){
        country = co;
    }

//    public static void main(String[] args) {
        pri check = new pri();
//        check.setCountry("Argentina");
//        check.setS(7);
//        System.out.println(check.getCountry());
//        System.out.println(check.getS());
//    }
}


public class CH9_Constructors {
    public static void main(String[] args) {
        retrob bikes = new retrob("Fzx", 1221, 210);

//        bikes.setName("Ronin");
//        bikes.setId(2110);
//        System.out.println(bikes.getName());
//        System.out.println(bikes.getId());
//        System.out.println(bikes.getModel());

        //Quick quiz - Overload the Object_Oriented_programming.employee const. to initialize the salary of rs 10000
        employ1 man = new employ1(10000);
//        man.setName("Ram");
//        man.setSalary(80000);
//        System.out.println(man.getName());
        System.out.println(man.getSalary());

        //Copy constructor
//        Object_Oriented_programming.student info = new Object_Oriented_programming.student(); // constructor
//        Object_Oriented_programming.student data = new Object_Oriented_programming.student(info); // copy constructor
//        info.setRollnumber(21);
//        info.setName("Raj");
//        info.setGrnumber(51);
//        info.setAddress("Hyderabad");
//        data.setRollnumber(21);
//        data.setName("Raj");
//        data.setGrnumber(51);
//        data.setAddress("Hyderabad");
//        System.out.println(data.getGrnumber());
//        System.out.println(data.getName());
//        System.out.println(data.getRollnumber());
//        System.out.println(data.getAddress());
//        System.out.println(info.getGrnumber());
//        System.out.println(info.getName());
//        System.out.println(info.getRollnumber());
//        System.out.println(info.getAddress());
//        data.ans();
//        info.ans();






    }
}
