class runnable1 implements Runnable {
    String n;
    runnable1(String name) {
        n = name;
    }

    public void run() {
        try {
            for(int i=1; i<=3; i++) {
                System.out.println(n + " " + i);
                Thread.sleep(500);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

