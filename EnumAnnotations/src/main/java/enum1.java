enum Hello {
    hello1, hello2, hello3, hello4, hello5, hello6, hello7
}
public class enum1 {
    public static void main(String[] args) {
        Hello today = Hello.hello1;
        System.out.println("Today is: " + today);
        switch(today) {
            case hello1:
                System.out.println("bye");
                break;
            case hello2:
                System.out.println("ok stop it");
                break;
            case hello3:
                System.out.println("byee");
                break;
            default:
                System.out.println("get out");
        }
    }
}