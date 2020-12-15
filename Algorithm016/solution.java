package Algorithm016;

public class solution {
	
	// 별찍기1
	
	public static void main(String[] args) {
		
		// 입력받은 수
		int n = 5;
		
		// 이중반복문을 돌아줄 때 i는 한줄, 한줄을 의미.
		for(int i = 0; i < n; i++) {
			// j가 첫번째 줄에는 별이 한개, 두번째 줄에는 두개, 세번째는 세개 찍여야한다.
			// 그래서 첫번째 줄인 i가 0일때는 i+1 만큼 별을 찍어주어 1개가 찍히고
			// 두번째줄인 i가 1일때에는 i+1 => 2 만큼 별을 찍어 2개가 되고
			// 세번째 줄인 i가 2일떄에는 i+1 => 3 만큼 별을 찍어 3개가 된다
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
