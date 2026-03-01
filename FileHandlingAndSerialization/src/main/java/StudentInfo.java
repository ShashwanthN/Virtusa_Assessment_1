import java.io.Serializable;

class StudentInfo implements Serializable {
    int RN;
    String name;
    public StudentInfo(int rn, String name) {
        this.RN = rn;
        this.name = name;
    }
}