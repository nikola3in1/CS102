public class Student {
    private int brIndexa,idSmera, espb;
    private String ime,prezime;

    @Override
    public String toString() {
        return "Student{" +
                "brIndexa=" + brIndexa +
                ", idSmera=" + idSmera +
                ", espb=" + espb +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                '}';
    }

    public Student(String ime, String prezimem, int brIndexa, int idSmera, int espb) {
        this.brIndexa = brIndexa;
        this.idSmera = idSmera;
        this.espb = espb;
        this.ime = ime;
        this.prezime = prezimem;
    }

    public int getBrIndexa() {

        return brIndexa;
    }

    public void setBrIndexa(int brIndexa) {
        this.brIndexa = brIndexa;
    }

    public int getIdSmera() {
        return idSmera;
    }

    public void setIdSmera(int idSmera) {
        this.idSmera = idSmera;
    }

    public int getEspb() {
        return espb;
    }

    public void setEspb(int espb) {
        this.espb = espb;
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
}
