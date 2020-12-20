package Algorithm024;

public class solution {
	
	// 평균 넘는 학생의 % 구하기

	public static void main(String[] args) {
		
		// 학생수 : 7
		int student = 7;
		// 학생들의 점수
		int[] score = new int[] {100,95,90,80,70,60,50};
		
		// 합계
		int sum = 0;
		// 평균
		double avg = 0;
		
		// sum에 score의 점수를 모두 더해줍니다.
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		// avg에는 sum / 학생 수를 double형태로 담아줍니다. 
		avg = (double)sum / student;
		
		// int a는 평균이 넘는 학생들입니다.
		int a = 0;
		
		for(int i = 0; i < score.length; i++) {
			if(avg < score[i]) {
				a++;
			}
		}
		double answer = 0;
		
		// A는 몇%의 학생이 평균을 넘는지 구해줍니다.
		double A = ((double)a / student) * 100;
		// A에 *1000을 곱한 57.1428 * 1000 해준 57142.8.. 을 반올림해준 57143을 1000으로 나눠서 담아줍니다.
		answer = Math.round(A * 1000.0) / 1000.0;
		//System.out.println(String.format("%.3f", answer));
		
		System.out.println(answer+"%");
		// 57.143%
		
	}
	
}
