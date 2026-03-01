interface Worklog {
    void Start();
}
public class AnonLambda {
    public static void main(String[] args) {
        Worklog log1 =new Worklog() {
            public void Start() {
                System.out.println("Im workin");
            }
        };
        log1.Start();
        Worklog log2=() -> System.out.println("100 percent working");
        log2.Start();
    }
}