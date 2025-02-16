package diu;

public class Thread1 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("CSE");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e1){
                System.out.println(e1);
            }
        }
    }
}
