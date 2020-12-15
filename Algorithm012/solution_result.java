package Algorithm012;

public class solution_result {

	public static void main(String[] args) {
		
		int n = 4;
		int count = 1;
		int[][] arr = new int[n][n];
		
		// 이중반복문 돌아주며
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				// arr의[i][j]가 아닌
				// 세로로 값을 입력해줘야하기 때문에 arr의 [j][i]번지에 count를 넣어준다.
				// arr[0][0] = 1
				// arr[1][0] = 2
				// arr[2][0] = 3
				// arr[3][0] = 4
				// 한 후 안쪽 for문을 벗어나서 바깥쪽 for문을 돌아주며, i가 ++되어서
				// arr[0][1] = 5
				// arr[1][1] = 6
				// ...
				// 식으로 하여 세로로 들림
				arr[j][i] = count;
				count++;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		
	}
}
