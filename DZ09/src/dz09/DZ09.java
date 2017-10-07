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
public class DZ09 {

    public static void main(String[] args) {
        Predmet p1 = new Predmet(10);
        Predmet p2 = new Predmet(15);
        
        Profesor prof1 = new Profesor(p1);
        Profesor prof2 = new Profesor(p2);
        
        Student s1 = new Student("aaa bbb", 666);
        Student s2 = new Student("ccc ddd", 222);
        Student s3 = new Student("xxx yyy", 444);
        
        p1.prijavi(s1);
        p2.prijavi(s2);
        p2.prijavi(s3);
        p2.odjavi(s3);
        p1.prijavi(s3);
        p2.odjavi(s3);
        System.out.println(p1);
        System.out.println(p2);
        
    }
    
}
