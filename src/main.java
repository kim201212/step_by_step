import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(Fac_Min(num));

    }
    public static int Fac(int x){
        if(x<=1){
           return x;
        }
        else{
            return Fac(x-1)*x;

        }
    }
    public static int Fac_Min(int x) {

        int fac = Fac(x);
        int num;
        int min = 10;

        while (true) {
            num = fac % 10;
            fac = fac / 10;
            if (num == 0) {
            } else {
                if (num < min) {
                    min = num;
                }else{min=min;}
            }
            if(fac==0){
                break;
            }
        }
        return min;
    }
}
