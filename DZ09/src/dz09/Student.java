/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz09;

/**
 *
 * @author makij
 */
public class Student {
    private String ImePrezime;
    private int Index;
    
    public Student(String ImePrezime, int Index){
        this.ImePrezime = ImePrezime;
        this.Index = Index;
    }
    
    public void setImePrezime(String ImePrezime){
        this.ImePrezime = ImePrezime;
    }
    
    public String getImePrezime(){
        return ImePrezime;
    }
    
    public void setIndex(int Index){
        this.Index = Index;
    }
    
    public String toString(){
        return ImePrezime + " : " + Index;
    }
    
    public int getIndex(){
        return Index;
    }
    
    
    
}
