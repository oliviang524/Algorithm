import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String S[];
        int temp[][] = new int[N][2];
        for(int i = 0 ; i < N ; i++) {
            S = br.readLine().split(" "); //키 몸무게
            temp[i][0] = Integer.parseInt(S[0]); //키
            temp[i][1] = Integer.parseInt(S[1]); //몸무게
        }
        
        int x, y, p, q, rank;
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < N ; i++){
            x = temp[i][0];
            y = temp[i][1];
            rank = 1;
            for(int j = 0 ; j < N ; j++){
                p = temp[j][0];
                q = temp[j][1];

                if(i == j) continue; //i와 j가 같으면 pass
                else if(x < p && y < q) rank++;

            }
            sb.append(rank).append(" ");
        }

        System.out.println(sb.toString());
    }
}