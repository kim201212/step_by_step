package b_2869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_2869 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        int cnt,temp =a-b;
        v -= a;
        cnt = v/temp;

        if(v-(temp*cnt)<=0){
            cnt +=1;
        }
        else{
            cnt +=2;
        }
        System.out.println(cnt);
    }
}