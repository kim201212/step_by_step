package b_10250;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_10250 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] room = new int[count];
        int x=0,y=0;

        for(int i=0;i<count;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            if(n%h==0) {
                x = n/h;
                y = h;
            }
            else{
                x = n/h+1;
                y = n%h;
            }
            room[i] = (100*y+x);
        }

        for(int i=0;i<count;i++){
        System.out.println(room[i]);
        }
    }
}