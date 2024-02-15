package Object_Oriented_programming;
class CR{
    public int a = 7;
    protected int c = 21;
    int f = 82;
    private int g = 45;
    public void result(){
        System.out.println(a);
        System.out.println(c);
        System.out.println(f);
        System.out.println(g);
    }
}

class XR extends CR{
//    private void check(){  // private A.M cannot run in subclasses
//        System.out.println("Private access");
//    }
    public void mtr(){
        System.out.println("Hello");
    }
//    default void tr(){ // Default A.M cannot run in subclasses
//        System.out.println();
//    }
    protected void cr(){
        System.out.println("I am i protected");
    }
}

public class CH12_Access_modifier {
    public static void main(String[] args) {
        CR r = new CR();
        r.result(); // All A.M can be used in the same class
//        System.out.println(r.g()); // private A.M can't be used in the same package
        XR x = new XR();
//        x.check();
//        x.mtr();
        x.cr();
    }
}
