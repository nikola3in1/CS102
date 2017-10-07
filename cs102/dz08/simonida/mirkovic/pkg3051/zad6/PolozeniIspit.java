/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs102.dz08.simonida.mirkovic.pkg3051.zad6;

/**
 *
 * @author sm
 */
public class PolozeniIspit {

    private String oznaka;
    private int ocjena;

    public PolozeniIspit() {
    }

    public PolozeniIspit(String oznaka, int ocjena) {
        this.oznaka = oznaka;
        this.ocjena = ocjena;
    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public int getOcjena() {
        return ocjena;
    }

    public void setOcjena(int ocjena) {
        this.ocjena = ocjena;
    }

    @Override
    public String toString() {
        return "Polozeni Ispit{" + "ime ispita: " + oznaka + ", ocjena : " + ocjena + '}';
    }
    

}
