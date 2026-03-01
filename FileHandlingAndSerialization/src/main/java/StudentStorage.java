import java.io.FileWriter;

public class StudentStorage {
    public static void main(String[] args) {
        String studentName = "SHASH";
        int RN = 3064;
        String GPA = "10/10 u bet";
        try {
            FileWriter fw = new FileWriter("student.txt");
            fw.write("Student Name: " + studentName + "\n");
            fw.write("RN: " + RN + "\n");
            fw.write("GPA: " + GPA + "\n");
            fw.close();
            System.out.println("Savd");
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}