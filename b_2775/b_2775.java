package b_2775;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2775 {
    public static int bu(int k,int n){
        if(n==0){
            return 0;
        }
        else if(k==0){
            return n;
        }
        else{
            return bu(k-1,n)+bu(k,n-1);
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i<t; i++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            sb.append(bu(k, n)+"\n");
        }
        System.out.println(sb.toString());
    }
}