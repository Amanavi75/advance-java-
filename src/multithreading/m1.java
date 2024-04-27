package multithreading;

public class m1 extends Thread{
    public void run(){
        System.out.println("priority of thread is" + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        m1 obj = new m1();
        System.out.println(obj.getName());
        System.out.println(obj.getId());
        obj.setPriority(Thread.NORM_PRIORITY);
        obj.setPriority(Thread.MAX_PRIORITY);
        obj.setPriority(Thread.MIN_PRIORITY);
        System.out.println(obj.isAlive());
    }
    
}
