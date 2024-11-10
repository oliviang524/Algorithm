import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double score, gradeScore;
        double gradeAvgScore[] = {4.0, 3.0, 2.0, 1.0, 0.0, 0.0}; //A, B, C, D, E(사용안함), F의 각각의 점수
        char grade;
        int grade1;
        char grade2;

        double totalGradeScore = 0; //P 학점을 제외한 학점의 총합
        double totalGradeAvgScore = 0; //P 학점을 제외한 학점 * 과목평점의 총합

        for(int i = 0 ; i < 20 ; i++){
            String A[] = br.readLine().split(" "); // 입력받은 '과목명 학점 등급'
            grade = A[2].charAt(0); //입력받은 등급
    
            if(grade == 'P') continue; //입력받은 등급이 P이면 패스
            
            grade1 = grade - 65; // 입력받은 등급의 앞자리 A(0), B(1), C(2), D(3), E(없다고 생각, 4), F(5)
            gradeScore = Double.parseDouble(A[1]); // 입력받은 학점 : 3.0
            totalGradeScore += gradeScore; //P 학점을 제외한 학점을 계속 더하기
            if(grade != 'F'){ //F등급이 아니면
                grade2 = A[2].charAt(1); // 입력받은 등급의 뒷자리 +, 0
                if(grade2 == '+') score = gradeAvgScore[grade1] + 0.5;  //입력받은 등급의 뒷자리가 +라면 0.5점 더하기
                else score = gradeAvgScore[grade1]; //아니라면 등급에 맞는 학점 그대로 더하기
            }else score = gradeAvgScore[grade1];
    
            totalGradeAvgScore += gradeScore * score;
        }
        System.out.println(totalGradeAvgScore / totalGradeScore);
        br.close();
    }
}