package Algorithm029;

import java.util.Scanner;

public class solution_result {

	// 음계

	// 오름차순인지 내림차순인지 판별하는 메소드
	public static void distinc(int[] input) {
		
		// 오름차순인지 정의하는 변수
		boolean aflag = true;
		
		// input의 0번지가 1이 아니면
		if(input[0] != 1) {
			// 오름차순이 아니기 때문에 false를 준다.
			aflag = false;
		}
		// input의 0번지는 이미 검사했기 떄문에 1번지부터 마지막-1 번지까지 반복문을 돌며
		for(int i = 1; i < input.length-1; i++) {
			// input의 i번지 - input i+1번지가 -1이 아니면, 즉, 1 2 3 4 순이 아니라면
			if(input[i]-input[i+1] != -1) {
				// aflag는 false고 바로 for문을 나간다.
				aflag = false;
				break;
			}
		}
		
		// 내림차순인지 정의하는 변수를 선언
		boolean bflag = true;
		
		// 만일 0번지가 8이 아니면 내림차순이 아니라서 false
		if(input[0] != 8) {
			bflag = false;
		}
		// 똑같이 1번지부터 마지막-1번지까지 반복문을 돌며
		for(int i = 1; i < input.length-1; i++) {
			// i번지 - i+1번지가 1이 아니면. 즉, 8 7 6 5.. 순이 아니면
			if(input[i]-input[i+1] != 1) {
				// 내림차순이 아니라 false
				bflag = false;
				// 바로 반복문 탈출
				break;
			}
		}
		// aflag가 true면
		if(aflag) {
			// ascending 출력
			System.out.println("ascending");
		}
		// bflag가 true면
		else if(bflag) {
			// descending 출력
			System.out.println("descending");
		}
		// 둘 다 아니면
		else {
			// mixed 출력
			System.out.println("mixed");
		}
	}

	public static void main(String[] args) {
		// 숫자를 입력하는 부분 [배열로 담아주었다.]
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		// 8개를 받아와야해서 int배열 8size를 만들어준다.
		int[] arr = new int[8];
		// 입력한 값 모두 여기에.
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		distinc(arr);
	}

}
