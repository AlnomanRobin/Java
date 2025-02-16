package diu;

public class Thread2 implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("DIU");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e2){
                System.out.println(e2);
            }
        }
    }
}
