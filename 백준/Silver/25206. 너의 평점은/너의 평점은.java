import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //학점, 과목평점, P 학점을 제외한 학점의 총합, P 학점을 제외한 학점 * 과목평점의 총합
        double gradeScore, gradeAvgScore, totalGradeScore = 0.0, totalGradeAvgScore = 0.0;

        for(int i = 0 ; i < 20 ; i++){
            String A[] = br.readLine().split(" "); // 입력받은 '과목명 학점 등급'
            if(A[2].charAt(0) == 'P') continue; //입력받은 등급이 P이면 계산안함
            gradeAvgScore = gradeAvgScore(A[2]); //입력받은 등급에 따른 과목평점
            gradeScore = Double.parseDouble(A[1]); // 입력받은 학점 : 3.0
            totalGradeScore += gradeScore; //P 학점을 제외한 학점을 계속 더하기
            totalGradeAvgScore += gradeScore * gradeAvgScore; //학점 * 과목평점을 계속 더하기
        }
        System.out.println(totalGradeAvgScore / totalGradeScore); //P 학점을 제외한 학점 * 과목평점의 총합 / P 학점을 제외한 학점의 총합
        br.close();
    }

    // 입력받은 등급에 따른 과목평점 구하는 메소드
    public static double gradeAvgScore(String grade){
        if(grade.charAt(0) == 'F') return 0.0; //F 등급이면 0.0 return
        double gradeAvgScore[] = {4.0, 3.0, 2.0, 1.0}; //A, B, C, D의 점수
        int grade1 = grade.charAt(0) - 65; // 입력받은 등급의 앞자리 index : A(0), B(1), C(2), D(3)
        char grade2 = grade.charAt(1); // 입력받은 등급의 뒷자리 +, 0
        double score = gradeAvgScore[grade1]; // 등급에 따른 점수 초기화
        if(grade2 == '+') score += 0.5; // 등급에 +가 붙어있으면 점수에 0.5 더하기
        return score;
    }
}