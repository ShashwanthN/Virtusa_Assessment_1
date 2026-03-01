import java.io.FileInputStream;
import java.io.FileOutputStream;
public class ReadingAndWriting {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("data.txt");
            String text = "my data";
            byte b[] = text.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("saved to data.txt");
            FileInputStream fin = new FileInputStream("data.txt");
            int i = 0;
            System.out.print("reading data.txt ");
            while((i = fin.read()) != -1) {
                System.out.print((char)i);
            }
            fin.close();
        } catch(Exception e) {
            System.out.println("Error: " + e);
        }
    }
}