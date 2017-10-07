/**
 * Created by nikola3in1 on 3.4.17..
 */
public class Student implements Comparable<Student>{
    private int index;

    @Override
    public int compareTo(Student student) {
        return prezime.compareTo(String.valueOf(student.getPrezime()));
    }

    private String ime;
    private String prezime;

    @Override
    public String toString() {
        return "Student{" +
                "index=" + index +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                '}';
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Student() {
    }
}
