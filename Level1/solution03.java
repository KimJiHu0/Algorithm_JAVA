package Level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class solution03 {
	
	public static int[] solution(int[] numbers) {
        int[] answer = {};
        int idx = 0;
        
        Set<Integer> set = new HashSet<Integer>();
        
        for(int i = 0; i < numbers.length-1; i++) {
        	for(int j = i + 1; j < numbers.length; j++) {
        		set.add(numbers[i] + numbers[j]);
        	}
        }
        Iterator<Integer> iter = set.iterator();
        answer = new int[set.size()];
        while(iter.hasNext()) {
        	answer[idx] = iter.next();
        	idx++;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[]{2,1,3,4,1})));
	}

}
