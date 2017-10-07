package dz09;

/**
 *
 * @author makij
 */
public class Profesor {
    private Predmet predmet;
    
    public Profesor(Predmet predmet){
        this.predmet = predmet;
    }
    
    public void setPredmet(Predmet predmet){
        this.predmet = predmet;
    }
    
    public Predmet getPredmet(){
        return this.predmet;
    }
}
