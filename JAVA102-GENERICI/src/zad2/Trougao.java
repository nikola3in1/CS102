package zad2;

//p = bh/2
//o =a+b+c
public class Trougao extends Oblik2D {
    public int b,h,c,d,e;

    public Trougao(int c, int d, int e) {
        this.c = c;
        this.d = d;
        this.e = e;
        if(c>d && c>e){
            this.b=c;
            if(d>e){
                this.h=d;
            }else{
                this.h=e;
            }
        }else if(d>c && d>e){
            this.b=d;
            if(c>e){
                this.h=c;
            }else{
                this.h=e;
            }
        }else if(e>d && e>c){
            this.b=e;
            if(d>c){
                this.h=d;
            }else{
                this.h=c;
            }
        }
    }

    @Override
    public double povrsina() {
        return (b*h)/2;
    }

    @Override
    public double obim() {
        return c+d+e;
    }
}
