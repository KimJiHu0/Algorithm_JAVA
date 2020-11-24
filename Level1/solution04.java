package Level1;

import java.util.Arrays;

public class solution04 {
	
	/*
	 * [문제설명]
	 * 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
	 * 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
	 * 
	 * [입출력 예]
	 * participant : ["leo", "kiki", "eden"]
	 * completion : ["eden", "kiki"]
	 * return : ["leo"]
	 */
	
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        String temp = "";
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        int i = 0;
        
        while(i < completion.length){
            if(!completion[i].equals(participant[i])){
                temp = participant[i];
                break;
            }else{
                i++;
            }
        }
        
        if(!temp.equals("")){
            answer = temp;
        }else{
            answer = participant[participant.length-1];
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		System.out.println(solution(new String[] {"leo", "kiki", "eden"}, new String[] {"eden", "kiki"}));
		
	}

}
