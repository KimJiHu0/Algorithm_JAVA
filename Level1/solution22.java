package Level1;

public class solution22 {
	
	// 정수를 담고있는 배열 arr의 평균값을 return하는 solution을 완성하세요.
	
	public static double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        
        // arr의 길이만큼 for문을 돌라주는데, 
        for(int i = 0; i < arr.length; i++){
        	// 미리 선언한 sum이라는 변수에 arr의 i번지를 더해준다.
            sum += arr[i];
        }
        // 그리고 answer이라는 변수에 double 타입으로 형변환 해준 sum / arr의 length 의 값을 담아준다.
        answer = (double) sum / arr.length;
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,2,3,4}));
		System.out.println(solution(new int[] {5,5}));
	}

}
