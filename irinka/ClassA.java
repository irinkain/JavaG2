package irinka;
import java.util.Random;
import java.util.Scanner;
public class ClassA implements Method1{
    int m[] = new int[15];
    @Override
    public void Meth1(){
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        a= input.nextInt();
        b= input.nextInt();
       // System.out.println(a+" "+b);
        Random rand = new Random();
        for (int i = 0; i < 15; i++) {
            m[i] = rand.nextInt(b-a+1)+a;
        System.out.println(m[i]);}
    }

    public int Meth2(){
        int val=0;
        for(int i=0;i<15;i++){
            if(m[i]<i) val+=m[i];
        }
        return val;
    }

    public int Meth3(){
        int val2=1;
        for(int i=0;i<15;i++){
            if(m[i]>i) val2*=i;
        }
        return val2;
    }

    public void Meth4() {
        for (int i = 0; i < 15; i++) {
            if (m[i] % 2 == 0) System.out.println(m[i]);
        }
    }
}
