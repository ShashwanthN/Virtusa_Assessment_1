class OldClass {
    @Deprecated
    public void oldMethod() {
        System.out.println("old");
    }
    public void newMethod() {
        System.out.println("new");
    }
}
class NewClass extends OldClass {
    @Override
    public String toString() {
        return "override";
    }
    @SuppressWarnings("deprecation")
    public void testThings() {
        oldMethod();
        newMethod();
    }
}
public class BuiltInAnnotation {
    public static void main(String[] args) {
        NewClass obj = new NewClass();
        System.out.println(obj.toString());
        obj.testThings();
    }
}