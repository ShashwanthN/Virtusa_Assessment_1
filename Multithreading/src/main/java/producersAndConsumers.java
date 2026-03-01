class Box {
    int data;
    boolean hasData=false;
    synchronized void put(int num) {
        try {
            if(hasData== true) {
                wait();
            }
        } catch(Exception e) {}

        data= num;
        System.out.println("Put: " + data);
        hasData =true;
        notify();
    }

    synchronized void get() {
        try {
            if(hasData== false) {
                wait();
            }
        } catch(Exception e) {}
        System.out.println("Get: " + data);
        hasData =false;
        notify();
    }
}

class Producer extends Thread {
    Box b;
    Producer(Box box) {
        b=box;
    }
    public void run() {
        for(int i=1; i<=5; i++) {
            b.put(i);
        }
    }
}

class Consumer extends Thread {
    Box b;
    Consumer(Box box) {
        b =box;
    }
    public void run() {
        for(int i=1; i<=5; i++) {
            b.get();
        }
    }
}

public class producersAndConsumers {
    public static void main(String[] args) {
        Box b=new Box();
        Producer p1= new Producer(b);
        Consumer c1 =new Consumer(b);
        p1.start();
        c1.start();
    }
}