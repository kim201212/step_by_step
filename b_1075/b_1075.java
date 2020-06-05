package b_1075;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1075 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int f = Integer.parseInt(br.readLine());
        n = n-(n%100);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<100;i++){
            if((n+i)%f==0){
                min=i;
                break;
            }
        }
        System.out.println(String.format("%02d", min));
    }
}