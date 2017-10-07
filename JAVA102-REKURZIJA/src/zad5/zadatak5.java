package zad5;

public class zadatak5 {
    public static void main(String[] args){
        int[][]m={{1,2,3,4},{2,1,3,4},{3,3,3,4},{4,4,4,1}};
        for (int i=0;i<m.length;i++){
            for (int j=0;j<m.length;j++){
                System.out.print(m[i][j]+", ");
            }
            System.out.println();
        }
        System.out.println(rekurzija(m));
        System.out.println(m.length);
    }

    public static boolean rekurzija(int[][]m,int x,int y){
        if(y==m.length-1) {
            return true;
        }
        System.out.print(m[x][y]+" : "+m[y][x]);
        System.out.println("  "+x+" "+y);

        if(m[x][y]==m[y][x]) {
            if(x>y){
                return rekurzija(m,x,y+1);
            }else {
                return rekurzija(m, x + 1, y);
            }
        }
        return false;

    }
    public static boolean rekurzija(int[][]m){
        return rekurzija(m,0,0);
    }
}
