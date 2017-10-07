import java.util.*;

/**
 * Created by nikola3in1 on 10.4.17..
 */
public class Student {
    private String ime;
    private String prezime;
    private int index;
    public static void main(String []args){
        ArrayList<Student> lista = new ArrayList<Student>();
        lista.add(new Student("Nikola","Nikolic",2332));
       // Set<Student> setovi = new HashSet<Student>();

        Student ja= new Student("nikola","mitrovic",2934);
        Student ad1= new Student("nikola1","mitrovic1",29341);

        final Map<Integer,String> polozeniIspti = new HashMap<Integer,String >();
        polozeniIspti.put(1414,"CS121, CS411");
        polozeniIspti.put(1422, "CS411");

        for (Student s :
                lista) {
            System.out.println(s+"sasd");
            for(Map.Entry<Integer,String> ispit :
                polozeniIspti.entrySet()){
                    if(ispit.getKey().equals(s.getIndex())){
                        System.out.println(ispit.getValue());
                    }
                }

            }

        }

//        setovi.add(ja);
//        setovi.add(ad1);
//        for (Student s :
//                setovi) {
//            System.out.println(s.hashCode());
//        }

    //}
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + getIndex();
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o){
            return true;
        }
        if(this == null){
            return false;
        }
        if(getClass() != o.getClass()){
            return false;
        }
        final Student student = (Student) o ;
        if(this.index != student.index){
            return false;
        }
        return true;
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

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Student(String ime, String prezime, int index) {
        setIme(ime);
        setPrezime(prezime);
        setIndex(index);
    }
}
