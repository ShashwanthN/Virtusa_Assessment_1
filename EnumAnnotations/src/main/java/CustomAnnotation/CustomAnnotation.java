package CustomAnnotation;

@UserInfo(name = "shashwanth", level = 2)
public class CustomAnnotation {
    public static void main(String[] args) {
        try {
            CustomAnnotation obj = new CustomAnnotation();
            Class c = obj.getClass();
            UserInfo info = (UserInfo) c.getAnnotation(UserInfo.class);
            System.out.println("User: " + info.name());
            System.out.println("Level: " + info.level());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}