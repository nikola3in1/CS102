package zad15;
public class zadatak15 {
    public static void main(String[]args){
        int[]niz=rekurzija(12344);
        for (int i :
                niz) {
            System.out.println(i);
        }

    }
    public static int[] rekurzija(Integer br){
        int[]niz = new int[br.toString().length()];
        return rekurzija(br,0,niz);
    }
    public static int[]rekurzija(int br,int pos,int[]niz){
        if(pos==niz.length)
            return niz;

        int nr=br%10;
        niz[pos]=nr;
        return rekurzija(br/10,pos+1,niz);
    }
}
