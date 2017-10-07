package zad1;

public class Main {
    public static void main(String[] args){
        Oblik2D obl= new Pravougaonik(2,3);
        Trougao obl2= new Trougao(12,3,4);
        Oblik2D a= OblikUtil.uporediP(obl,obl2);
        System.out.println(a.povrsina());
    }
}
