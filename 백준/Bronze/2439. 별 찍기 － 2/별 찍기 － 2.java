import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i = 1 ; i <= N ; i++) {
            if(i < N){
                for(int j = N ; j > i ; j--){
                    bw.append(" ");
                }
            }
            for(int j = 1 ; j <= i ; j++){
                bw.write("*");
            }
            bw.write("\n"); 
        }
        bw.flush(); //남아있는 데이터를 모두 출력시킴
        bw.close(); //OutputStream을 닫음
        br.close(); //InputStream을 닫음
    }
}