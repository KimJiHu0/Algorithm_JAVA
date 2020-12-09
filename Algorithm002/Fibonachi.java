package Algorithm002;

import java.util.Scanner;

public class Fibonachi {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇번째까지 출력할까요?");
		int num = sc.nextInt();
		
		// num만큼의 길이 int 배열이 생성된다.
		int[]arr = new int [num];
		
		// 기본적으로 첫번째 수와 두번째 수는 1이기 때문에 미리 넣어준다.
		arr[0] = 1;
		arr[1] = 1;
		
		// 1, 1
		
		// arr의 i번지이기 때문에 2번지부터 마지막번지까지 반복문을 돌면서
		for(int i = 2; i < arr.length; i++) {
			// arr의 i번지는 arr의 i-1번지 + arr의 i-2번지 값을 arr의i번지에 더해준다.
			// ex ] arr[2] = arr[2-1] + arr[2-2]
			// arr[2] = 1 + 1 이라서 arr의 2번지는 2
			
			// arr[3] = arr[3-1] + arr[3-2]
			// arr[3] = 2 + 1 => 3
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		// 그 후 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
