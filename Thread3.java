package diu;

public class Thread3{
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        Thread t3=new Thread(t2);
        t1.start();
        t3.start();
    }
}
