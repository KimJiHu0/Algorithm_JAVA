package Level2;

import java.util.Arrays;

public class solution03 {
	
	// 구명보트
	
	public static int solution(int[] people, int limit) {
	    int answer = 0;

	    Arrays.sort(people);
	    // => [50,50,70,80]

	    int min = 0;

	    // max가 people.length = [거꾸로부터 하기 위함], min이 max보다 작거나 같을때까지, max를 --
	    for (int max = people.length - 1; min <= max; max--){
	    	// 만약에 people의 min번지 [peopele의 0번지] + people의 마지막번지를 더했을 때 limit보다 작거나 같다면
	      if (people[min] + people[max] <= limit) {
	    	  // min을 ++해줍니다.
	    	  min++;
	      }
	      answer++;
	    }

	    return answer;
	}
	
	public static int solution1(int[] people, int limit) {
		
		// 최대 + 최소 를 구명보트에 태워서 보내야한다.
        Arrays.sort(people);
        // => [50,50,70,80]
 
        int answer = 0;
        
        // index는 people의 길이-1. 즉, 3
        int index = people.length - 1;
        // 0부터 3까지 for문을 돌리는데 i++
        for(int i = 0; i <= index; i++) {
        	System.out.println("answer에 ++해");
        	// 일단 0번지에 있는 애 태운다.
        	answer++;
        	// index가 i보다 크고, i번지와 index--번지를 더했을 떄 limit보다 크다면
            while(index > i && people[i] + people[index--] > limit) {
            	System.out.println("index가 몇이야?" + index);
            	System.out.println("몇번들어올까");
                answer++;
            }
        }
 
        return answer;
    }
	
	public static int solution2(int[] people, int limit) {
		int answer = 0;
		
		int i = 0;
		int j;
		
		Arrays.sort(people);
		
		System.out.println(Arrays.toString(people));
		
		// 몸무게가 가장 무거운 사람부터 판단한다.
		for(j = people.length-1; i <= j; j--) {
			System.out.println("i가 몇이야 : " + i);
			System.out.println("j가 몇이야  : " + j);
			// 최소 + 최대 몸무게 2명의 합이 무게제한보다 큰 경우
			// 가장 큰 몸무게의 인원을 보태 1대에 태워 보낸다.
			if(people[j] + people[i] > limit) {
				System.out.println(people[j] + " + " + people[i] + "는 limit보다 커");
				answer++;
				System.out.println("크니까 answer++해줘야지 : " + answer);
			}
			
			// 최소 + 최대 몸무게 2명의 합이 무게제한보다 같거나 작은 경우
			// - 두 명을 한 보트에 태워 보낸다.
			// - 그 다음으로 몸무게가 작은 인원을 기준으로 삼아야하기 때문에 i++를 해준다.
			else {
				System.out.println(people[j] + " + " + people[i] + "는 limit보다 작거나 같아");
				answer++;
				System.out.println("두 명 한번에 태워 보내야지 : " + answer);
				i++;
				System.out.println("i++해준 값 : " + i);
			}
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		//System.out.println(solution(new int[] {70, 50, 80, 50}, 100));
		//System.out.println(solution(new int[] {70,80,50}, 100));
		//System.out.println(solution(new int[] {50,50,80,70,40,60}, 100));
		//System.out.println(solution(new int[] {40,40,40}, 100));
		//System.out.println(solution(new int[] {10,20,30,40,50,60,70,80,90}, 100));
		//System.out.println(solution1(new int[] {70, 50, 80, 50}, 100));
		//System.out.println(solution1(new int[] {70,80,50}, 100));
		//System.out.println(solution1(new int[] {50,50,80,70,40,60}, 100));
		//System.out.println(solution1(new int[] {40,40,40}, 100));
		//System.out.println(solution1(new int[] {10,20,30,40,50,60,70,80,90}, 100));
		System.out.println(solution2(new int[] {70, 50, 80, 50}, 100));
		System.out.println(solution2(new int[] {70,80,50}, 100));
		System.out.println(solution2(new int[] {50,50,80,70,40,60}, 100));
		System.out.println(solution2(new int[] {40,40,40}, 100));
		System.out.println(solution2(new int[] {10,20,30,40,50,60,70,80,90}, 100));
	}

}
