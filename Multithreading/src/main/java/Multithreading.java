public class Multithreading {
    public static void main(String[] args) {


        thread1 t1 = new thread1("Thread A");
        thread1 t2 = new thread1("Thread B");

        t1.start();
        t2.start();

        runnable1 r1 = new runnable1("Worker 1");
        runnable1 r2 = new runnable1("Worker 2");
        Thread rt1 = new Thread(r1);
        Thread rt2 = new Thread(r2);

        rt1.start();
        rt2.start();
    }
}
