import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); //듣도 못한 사람의 수
        int M = Integer.parseInt(st.nextToken()); //보도 못한 사람의 수

        String names[] = new String[N + M]; //총 듣보잡 명단
        for(int i = 0 ; i < names.length ; i++) names[i] = br.readLine();

        Arrays.sort(names); //사전순정렬

        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i = 1 ; i < names.length ; i++){
            if(names[i].equals(names[i - 1])) {
                count++;
                sb.append(names[i]).append("\n");
            }
        }

        System.out.println(count);
        System.out.print(sb.toString());

        br.close();
    }
}