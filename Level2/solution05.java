package Level2;

public class solution05 {
	
	// 피보나치 수
	
	
	/*
	 * 시간초과 에러
	 * 
	public static int solution(int n) {
		int answer = 0;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			list.add(fibo(i));
		}
		
		answer = (list.get(list.size()-1) + list.get(list.size()-2)) % 1234567;
		
		return answer;
	}
	
	public static int fibo(int num) {
		if(num <= 1) {
			return num;
		} else {
			return fibo(num-2) + fibo(num-1);
		}
	}
	*/
	
	public static int solution(int n) {
		int answer = 0;
		
		long[] arr = new long[n+1];
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i = 2; i < arr.length; i++) {
			arr[i] = (arr[i-1] + arr[i-2]) % 1234567;
		}
		
		answer = (int)arr[n];
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(3));
		System.out.println(solution(5));
	}

}
