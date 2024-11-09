import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i = 0 ; i < N ; i++) if(isGroupWord(br.readLine())) count++; //그룹단어가 맞다면 count 올리기
        System.out.println(count);
        br.close();
    }
    
    //그룹단어체크메소드
    public static boolean isGroupWord(String S){
        boolean B[] = new boolean[26]; //알파벳 수 만큼 boolean 배열 변수 생성
        int prevIndex = -1, nowIndex = -1; //직전 알파벳 인덱스와 현재 알파벳 인덱스
        for(int i = 0 ; i < S.length() ; i++){ //들어온 문자열의 길이 만큼 반복
            nowIndex = S.charAt(i) - 97; //문자열을 문자로 나누었을 때 나오는 알파벳의 인덱스를 현재 알파벳 인덱스 값에 저장
            if(prevIndex == nowIndex) continue; //직전 알파벳 인덱스와 현재 알파벳 인덱스가 같다면 연속된 알파벳이라는 뜻이므로 다음 i의 반복문 진행
            else{ //직전 알파벳 인덱스와 현재 알파벳 인덱스가 다르다면...
                if(!B[nowIndex]){ //현재 알파벳 인덱스에 해당하는 boolean 값이 false 라면 처음 나온 알파벳 인덱스라는 뜻이므로
                    B[nowIndex] = true; //true로 변경해주고
                    prevIndex = nowIndex; //직전 알파벳 인덱스에 현재 알파벳 인덱스를 저장
                }else return false; //직전 알파벳 인덱스와 비연속적이고 중복으로 나온 알파벳 인덱스라면 그룹단어가 아니므로 false를 return 
            }
        }
        return true; //위 조건을 모두 통과했다면 그룹단어이므로 true를 return
    }
}