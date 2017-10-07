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
public class Predmet {
    
    private Student[] student;
    private int num;
    
    public Predmet(int kapacitet){
        this.student = new Student[kapacitet];
    }
    
    public void prijavi(Student s){
        if(num == student.length)
            return;
        num++;
        for(int i=0; i<student.length; i++)
            if(student[i] == null){
                student[i] = s;
                return;
            }
    }
    
    public void odjavi(Student s){
        if(num == 0)
            return;
        for(int i=0; i<student.length; i++)
            if(student[i] == s){
                student[i] = null;
                return;
            }
    }
    
    public String toString(){
        StringBuffer buf = new StringBuffer();
        for(int i=0; i<student.length; i++)
            if(student[i] != null)
                buf.append("("+student[i]+") ");
        
        return buf.toString();
    }
    
}
