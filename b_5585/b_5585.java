package b_5585;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_5585 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int price = Integer.parseInt(br.readLine());
        price = 1000-price;
        int cnt =0;
        int[] m = {500,100,50,10,5,1};

        for(int i=0;i<m.length;i++){
            cnt += price/m[i];
            price = price%m[i]; 
        }
        System.out.println(cnt);
    }
}