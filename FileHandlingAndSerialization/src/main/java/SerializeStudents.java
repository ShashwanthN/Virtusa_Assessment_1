import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerializeStudents {
    public static void main(String[] args) {
        try {
            StudentInfo s1 = new StudentInfo(3064, "Shashwanth");
            FileOutputStream fout = new FileOutputStream("student.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            out.close();
            System.out.println("saved");
            FileInputStream fin = new FileInputStream("serializeStudent.txt");
            ObjectInputStream in = new ObjectInputStream(fin);
            StudentInfo s2 = (StudentInfo) in.readObject();
            in.close();
            System.out.println("deserialized");
            System.out.println("RN: " + s2.RN);
            System.out.println("Name: " + s2.name);
        } catch(Exception e) {
            System.out.println("err " + e);
        }
    }
}