package b_2490;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_2490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<3;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
            switch (a){
                case 4: 
                    sb.append("E\n");
                    break;
                case 3: 
                    sb.append("A\n");
                    break;
                case 2: 
                    sb.append("B\n");
                    break;
                case 1: 
                    sb.append("C\n");
                    break;
                default:
                    sb.append("D\n");
            }
        }
        System.out.println(sb.toString());
    }
}