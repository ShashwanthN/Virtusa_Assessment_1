public class SynchronizedProg {
    public static void main(String[] args) {
        Counter o =new Counter();

        Thread t1 =new Thread(new Runnable() {
            public void run() {
                for(int i=0; i<1000; i++) {
                    o.add();
                }
            }
        });
        Thread t2 =new Thread(new Runnable() {
            public void run() {
                for(int i=0; i<1000; i++) {
                    o.add();
                }
            }
        });
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch(Exception e) {
            System.out.println(e);
        }
        System.out.println("Total: " + o.c);
    }
}
