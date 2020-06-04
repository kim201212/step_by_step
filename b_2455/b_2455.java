package b_2455;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_2455 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int p,m,temp=0,max = Integer.MIN_VALUE;

        for(int i=0;i<4;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            m=Integer.parseInt(st.nextToken());
            p=Integer.parseInt(st.nextToken());

            temp =temp+p-m;
            if(temp>max){
                max = temp;
            }
        }
        System.out.println(max);
    }
}