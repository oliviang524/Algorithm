import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int stack[];
    public static int size = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        stack = new int[N];
        
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while(N > 0){
            st = new StringTokenizer(br.readLine(), " ");
            switch(st.nextToken()){
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(pop()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "top":
                    sb.append(top()).append("\n");
                    break;
            }
            N--;
        }
        System.out.print(sb.toString());
        br.close();
    }

    //정수 X를 스택에 넣는 연산
    public static void push(int X){
        stack[size] = X;
        size++;
    }

    //스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력하는 연산
    //(만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력)
    public static int pop(){
        if(size == 0) return -1;

        int result = stack[size - 1];
        stack[size - 1] = 0;
        size--;

        return result;
    }

    //스택에 들어있는 정수의 개수를 출력하는 연산
    public static int size(){
        return size;
    }

    //스택이 비어있으면 1, 아니면 0을 출력하는 연산
    public static int empty(){
        if(size == 0) return 1;
        return 0;
    }

    //스택의 가장 위에 있는 정수를 출력하는 연산
    //(만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력)
    public static int top(){
        if(size == 0) return -1;
        return stack[size - 1];
    }
}
