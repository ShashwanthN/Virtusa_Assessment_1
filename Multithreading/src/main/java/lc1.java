class lc1 implements Runnable {
    public void run() {
        try {
            System.out.println("running");
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        try {
            Thread t1 = new Thread(new lc1());
            System.out.println("State 1: " + t1.getState());

            t1.start();
            System.out.println("State 2: " + t1.getState());
            Thread.sleep(100);
            System.out.println("State 3: " + t1.getState());
            t1.join();
            System.out.println("State 4: " + t1.getState());
        } catch (Exception e) {
            System.out.println("err");
        }
    }
}