package Object_Oriented_programming;
class even extends Thread{
    @Override
    public void run() {
        for(int i = 0;i<=20;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
class odd extends Thread{
    @Override
    public void run() {
        for(int i = 0;i<=20;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}

class matrixmulti extends Thread{
    public void run(){
        int[][] mat1 = {{3,2,1},
                      {2,5,1}};
        int [][] mat2 = {{6,1,4},
                        {8,1,3}};
        int [][] mat3 = {{0,0,0}
                       ,{0,0,0}};
        for(int i=0; i<=1;i++){
         for(int j=0;j<=2;j++){
              mat3[i][j] = mat1[i][j] * mat2[i][j];
             System.out.print( mat3[i][j] + " ");
         }
            System.out.print("\n");
        }
    }
}
public class CH13_Thread_Practice_que {
    public static void main(String[] args) {
//        even num = new even();
//        odd num1 = new odd();
//        num.start();
//        num1.start();
        matrixmulti xr = new matrixmulti();
        xr.start();

    }
}
