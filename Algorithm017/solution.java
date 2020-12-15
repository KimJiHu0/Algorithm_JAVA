package Algorithm017;

public class solution {
	
	// 별찍기2
	
	public static void main(String[] args) {
		
		// 입력받은 수
		int n = 5;
		
		// 이중반복문을 돌아주는데,
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				// i가 j보다 크다면
				if(i > j) {
					// 공백
					System.out.print("?");
				// 아니라면
				}else {
					// 별찍기
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		/*
		 * i가 0 일때 / 0행일 때 => 별이 5개 찍혀야한다.
		 * 0이 j인 0,1,2,3,4 보다 크지 않으니 공백이 찍히지 않고, 별이 찍힌다.
		 * 
		 * i가 1일때 / 1행일 때 => 별4개 공백1개
		 * i가 j보다 클 때에는 j가 0일떄 한번밖에 없기 때문에, 공백을 한번 찍어주고, 전부 else 조건을 들어가서 별이 4번 찍힌다.
		 * 
		 * i가 2일때 / 2행일 때 => 별이3개 공백2개
		 * i가 j보다 클 때에는 j가 0,1일때 두번밖에 없기 때문에, 공백일 2번 찍어주고, 전부 else 조건을 들어가서 별을 3번 찍는다.
		 * 
		 * ...
		 */
		
	}

}
