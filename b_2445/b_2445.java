package b_2445;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2445 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=1;i<n;i++){
            for(int j =0;j<=i-1;j++){
                sb.append("*");
            }
            for(int k =0;k <= 2*(n-i)-1;k++){
                sb.append(" ");
            }
            for(int j =0;j<=i-1;j++){
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());
        for(int i=0;i<2*n;i++){
            System.out.print("*");
        }
        System.out.print(sb.reverse().toString());
    }
}