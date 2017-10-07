package zad11;

public class zadatak11 {
    public static void main(String[]args){
        System.out.println(rekurzija(500));;
    }
    public static String rekurzija(int br){
        return rekurzija(br,0,"");
    }

    public static String rekurzija(int br,int pom,String hex){
        if(br==0)
            return hex;
        if(br-16>0) {
            return rekurzija(br - 16, pom + 1, "");
        }else if(br<16){
            return hex = getHex(pom)+""+getHex(br);
        }

        return "a";
    }
    public static String getHex(int a){
        String hex = "";
        System.out.println(a);
        char base16[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        if(a%16==0){
            return base16[a/16]+"";
        }else{
            return base16[a/16]+""+base16[a%16];
        }


    }

}
