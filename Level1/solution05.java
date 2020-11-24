package Level1;

import java.util.Arrays;

public class solution05 {
	/*
	 * 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.

	       예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면

       1. array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
       2. 1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
       3. 2에서 나온 배열의 3번째 숫자는 5입니다.
                배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.
                
       57.1점
	 */
	
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
		/*
		 * answer = new int[commands.length];
		 * 
		 * for (int i = 0; i < commands.length; i++) { int[] real =
		 * Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
		 * Arrays.sort(real); answer[i] = real[commands[i][2] - 1];
		 * 
		 * }
		 * 
		 * return answer;
		 */
        int start = 0;
        int end = 0;
        int idx = 0;
        
        for(int i = 0; i < commands.length; i++) {
        	for(int j = 0; j < commands.length;) {
        		start = commands[i][j]-1;
        		j++;
        		end = commands[i][j];
        		j++;
        		idx = commands[i][j]-1;
        		j++;
        		int[] tmp = Arrays.copyOfRange(array, start, end);
        		Arrays.sort(tmp);
        		answer[i] = tmp[idx];
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		   System.out.println(Arrays.toString(solution(new int[] {1,5,2,6,3,7,4}, new int[][] {{2,5,3}, {4,4,1}, {1,7,3}})));
	}

}
