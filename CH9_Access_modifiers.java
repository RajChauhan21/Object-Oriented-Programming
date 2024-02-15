package Object_Oriented_programming;

class retro{
    private int id;
   private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public int getId(){
        return id;
    }
    public void setId(int number){
        id = number;
    }
}

class round{
    private int radius;
    private int area;
    private  float pye = 3.14f;
    private int perimeter;

    public int getRadius() {
        return radius;
    }
    public void setRadius(int rad){
        if(rad<=0){
            System.out.println("Un accessible vale");
        }
        else {
            radius = rad;
        }

    }

    public float getArea(){
        return area;
    }
    public void setArea(float a){
        if(a<=0.0){
            System.out.println("In valid value");
        }
        else{
              a = pye*radius*radius;
            area =(int) a;
        }

    }
    public float getPerimeter(){
        return perimeter;
    }
    public void setPerimeter(float p){
        if(p<10.0){
            System.out.println("Wrong input!");
        }
        else {
            p = 2*pye*radius;
            perimeter = (int) p;
        }

    }
}




public class CH9_Access_modifiers {
    public static void main(String[] args) {
        retro bike = new retro();
//        bike.id = 2110; // Throws an error due
//        bike.name = "Ronin"; // to private access modifier
//        System.out.println(bike.id);
//        System.out.println(bike.name);
//        bike.setName("FzX");
//        System.out.println(bike.getName());
//        bike.setId(2103);
//        System.out.println(bike.getId());

        round measure = new round();
        measure.setRadius(6);
        measure.setArea(10.0f);
        measure.setPerimeter( 20.0f);
        System.out.println(measure.getRadius());
        System.out.println(measure.getArea());
        System.out.println(measure.getPerimeter());

    }
}
