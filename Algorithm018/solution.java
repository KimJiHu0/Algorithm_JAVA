package Algorithm018;

public class solution {
	
	// 별찍기3
	
	public static void main(String[] args) {
		
		// 입력받은 수
		int n = 5;
		
		// 이중 반복문을 돌아주는데,
		for(int i = 0; i < n; i++) {
			// 4, 3, 2, 1, 0 까지 j-- 해준다.
			for(int j = n-1; j >= 0; j--) {
				// i가 j보다 작을 때에는
				// i가 0 이니까 j가 4,3,2,1 일때 공백을 찍고 0일떄에는 별 하나 찍는다.
				// i가 1 이니까 j가 4,3,2 일떄 공백을 찍고 0,1일때에는 별 두개 찍는다.
				// i가 2 이니까 j가 4,3 일때 공백을 찍고 0,1,2일때에는 별 세개 찍는다.
				// ...
				if(i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}

}
