package b_2747;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class b_2747 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[] p = new int[cnt+1];
        p[0]=0;
        p[1]=1;

        for(int i=2;i<=cnt;i++){
            p[i]=p[i-1]+p[i-2];
        }
        System.out.println(p[cnt]);   
    }
}