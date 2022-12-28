package Bigintiger;

public class JoinThreadDemo extends Thread{
    @Override
    public void run() {

        try {
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            System.out.println("Exepion has been caught"+e);
            throw new RuntimeException(e);

        }
    }

}
class Mian{
    public static void main(String[] args) {
        JoinThreadDemo t1 =new JoinThreadDemo();
        JoinThreadDemo t2 =new JoinThreadDemo();
        JoinThreadDemo t3 =new JoinThreadDemo();

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();

        t3.start();
        System.out.println(Thread.currentThread().getName());

    }
}
