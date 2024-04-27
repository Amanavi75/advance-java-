package multithreading;

public class m2 extends Thread {
    public static void main(String[] args) {
        Runnable r1 = new Runnable(){
            public void run(){
                System.out.println("thread 1 without using lambda");
            }
        };

        Thread t1 = new Thread(r1);
        t1.start();

        Runnable r2 = ()->{
            System.out.println("thread 2 with lambda");
        };

        Thread t2 = new Thread(r2);
        t2.start();
    }
    
}
