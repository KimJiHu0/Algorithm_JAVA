package Level1;

import java.util.Arrays;

public class solution37 {

	// 모의고사
	
	// 테스트케이스8번 실패

	/*
	 * 수포자는 수학을 포기한 사람의 준말입니다.
	 * 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다.
	 * 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
	 * 
	 * 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
	 * 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
	 * 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
	 * 
	 * 1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에
	 * 담아 return 하도록 solution 함수를 작성해주세요.
	 * 
	 * [1,2,3,4,5] return [1]
	 * [1,3,2,4,2] return [1,2,3]
	 */
	
	public static int[] solution(int[] answers) {
		
		int[] answer = {};
		
		// 수포자1의 찍는 순서
        int[] idx1 = {1, 2, 3, 4, 5};
        // 수포자1의 cnt
        int cnt1 = 0;
        // 수포자1의 정답 갯수
        int answer1 = 0;
        
        // 수포자2의 찍는 순서
        int[] idx2 = {2, 1, 2, 3, 2, 4, 2, 5};
        // 수포자2의 cnt
        int cnt2 = 0;
        // 수포자2가 맞춘 정답 갯수
        int answer2 = 0;
        
        // 수포자3의 찍는 순서
        int[] idx3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        // 수포자3의 cnt
        int cnt3 = 0;
        // 수포자3이 맞춘 정답 개수
        int answer3 = 0;
        
        
        for(int i = 0; i < answers.length; i++) {
        	// 수포자 1의 결과값 출력하는 조건문
        	if(idx1[cnt1] == answers[i]) {
        		answer1++;
        	}
        	cnt1++;
        	if(cnt1 == idx1.length) {
        		cnt1 = 0;
        	}
        	
        	// 수포자 2의 결과값 출력하기 위한 조건문
        	if(idx2[cnt2] == answers[i]) {
        		answer2++;
        	}
        	cnt2++;
        	if(cnt2 == idx2.length) {
        		cnt2 = 0;
        	}
        	
        	// 수포자 3의 결과값 출력하기 위한 조건문
        	if(idx3[cnt3] == answers[i]) {
        		answer3++;
        	}
        	cnt3++;
        	if(cnt3 == idx3.length) {
        		cnt3 = 0;
        	}
        }
        System.out.println("1번 : "+answer1 + "개");
        System.out.println("2번 : "+answer2 + "개");
        System.out.println("3번 : "+answer3 + "개");
        
        // max라는 변수에 answer1의 값을 넣고,
        int max = answer1;
        
        // max보다 answer2가 크면
        if(max < answer2) {
        	// max는 answer2이고
        	max = answer2;
        	// answer배열에 2를 넣는다.
        	answer = new int[] {2};
        }
	// max보다 answer3가 크다면
	if(max < answer3) {
        	// max에 answer3를 대입
        	max = answer3;
        	// answer배열에 3을 대입한다.
        	answer = new int[] {3};
        }
	// 그렇지않다면
	if(max == answer1){
        	// answer배열에 1을 대입.
        	answer = new int[] {1};
        }
        
        // 만약에 answer1과 answer2가 같고 answer2와 answer3이 같고, answer1과 answer3이 같다면
        if(answer1 == answer2 && answer2 == answer3 && answer1 == answer3) {
        	// answer배열에 1,2,3을 대입
        	answer = new int[] {1,2,3};
        // 그렇지않고 answer1과 answer2가 같고, max가 answer3이 아니라면
        } else if((answer1 == answer2) && max != answer3) {
        	// answer에 1과2를 대입.
        	answer = new int[] {1,2};
        // 그렇지않고 answer1과 answer3이 같고, max가 answer2가 아니라면
        } else if((answer1 == answer3) && max != answer2) {
        	// 1,3을 answer에 대입
        	answer = new int[] {1,3};
        // 그렇지않고 answer2와 answer3이 같고, max에 answer1이 아니라면
        } else if((answer2 == answer3) && max != answer1) {
        	// answer에 2,3 대입
        	answer = new int[] {2,3};
        }
        return answer;
    }
	
	public static void main(String[] args) {
		// 1번 => 1,2,3,4,5
		// 2번 => 2,1,2,3,2,4,2,5
		// 3번 => 3,3,1,1,2,2,4,4,5,5
		System.out.println(Arrays.toString(solution(new int[] {1,2,3,4,5})));
		System.out.println(Arrays.toString(solution(new int[] {1,3,2,4,2})));
		System.out.println(Arrays.toString(solution(new int[] {2,3,1,4,5})));
		System.out.println(Arrays.toString(solution(new int[] {4,2,5,3,1})));
		System.out.println(Arrays.toString(solution(new int[] {3,1,2,5,4})));
	}

}
