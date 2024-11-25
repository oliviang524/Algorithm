import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); //듣도 못한 사람의 수
        int M = Integer.parseInt(st.nextToken()); //보도 못한 사람의 수

        HashSet<String> set = new HashSet<>(); //중복제거해주는 set사용
        for(int i = 0 ; i < N ; i++) set.add(br.readLine());
        
        ArrayList<String> list = new ArrayList<>();
        String temp = "";
        for(int i = 0 ; i < M ; i++) {
            temp = br.readLine(); //보도 못한 사람의 이름이
            if(set.contains(temp)){ //듣도 못한 사람의 이름과 같다면
                list.add(temp); //list에 추가
            }
        }

        Collections.sort(list); //사전순으로 정렬

        StringBuilder sb = new StringBuilder();
        sb.append(list.size()).append("\n"); //듣보잡 수
        for(String name : list) sb.append(name).append("\n"); //듣보잡명

        System.out.println(sb.toString()); //출력

        br.close();
    }
}