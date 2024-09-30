import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        long A[] = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0 ; i < N ; i++){
            A[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(A);

        int count = 0;
        for(int k = 0; k < N ; k++){
            int i = 0;
            int j = N - 1;
            while(i < j){
                if(A[i] + A[j] == A[k]){
                    if(i != k && j != k){ //i와 j가 k와 같으면 안됨(자기 자신을 좋은 수 만들기에 포함하면 안됨)
                        count++;
                        break;
                    }else if(i == k) i++;
                    else if(j == k) j--;
                }else if(A[i] + A[j] < A[k]) i++;
                else j--;
            }
        }
        System.out.println(count);
        br.close();
    }
}
