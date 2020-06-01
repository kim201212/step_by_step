package b_1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1978 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] pn = new int[n];
        int cnt =0,temp=0;

        for(int i=0;i<n;i++){
            pn[i]=Integer.parseInt(st.nextToken());
            if(pn[i]==1){}
            else if(pn[i]==2){
                cnt++;
            }
            else{
                for(int j =2;j<pn[i];j++){
                    if(pn[i]%j==0){
                        temp++;
                    }
                }
                if(temp==0){
                    cnt++;
                }
                temp=0;
            }
        }
        System.out.println(cnt);
    }
}