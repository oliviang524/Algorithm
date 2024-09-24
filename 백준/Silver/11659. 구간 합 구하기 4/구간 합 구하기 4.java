import java.util.Scanner;

public class Main {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         
         int numCount = sc.nextInt(); //숫자개수
         int questionCount = sc.nextInt(); //질의개수
         
         // 배열 받아서 합배열 생성
         long S[] = new long[numCount + 1];
         for(int i = 1; i <= numCount ; i++) S[i] = S[i-1] + sc.nextInt();
         
         // 합배열을 가지고 구간합 구하기
         for(int i = 0; i < questionCount; i++){
            int startIdx = sc.nextInt();
            int endIdx = sc.nextInt();
            System.out.println(S[endIdx] - S[startIdx-1]); 
        }
        
        sc.close();
    }
}
