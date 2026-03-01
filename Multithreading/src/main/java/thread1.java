class thread1 extends Thread {
    String name;
    thread1(String n) {
        name = n;
    }

    public void run() {
        try {
            for(int i=1; i<=3; i++) {
                System.out.println(name + " " + i);
                Thread.sleep(500);
            }
        } catch(Exception e) {
            System.out.println(e);
        }
        System.out.println(name + "complited");
    }
}

