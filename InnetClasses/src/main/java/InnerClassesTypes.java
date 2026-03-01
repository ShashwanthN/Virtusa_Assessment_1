class Outer {
    int a=1;
    static int b =2;
    class MemberInner {
        void print() {
            System.out.println(a);
        }
    }
    static class StaticNested {
        void show() {
            System.out.println(b);
        }
    }
    void Method() {
        class LocalInner {
            void display() {
                System.out.println("Hii");
            }
        }
        LocalInner li=new LocalInner();
        li.display();
    }
}

public class InnerClassesTypes {
    public static void main(String[] args) {
        Outer out=new Outer();
        Outer.MemberInner in1=out.new MemberInner();
        in1.print();
        Outer.StaticNested in2=new Outer.StaticNested();
        in2.show();
        out.Method();
        Thread t=new Thread() {
            public void run() {
                System.out.println("anin");
            }
        };
        t.start();
    }
}