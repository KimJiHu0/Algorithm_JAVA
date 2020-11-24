package Level1;

import java.util.HashMap;

public class solution04_1 {
	
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        
        // HashMap 선언!
        HashMap<String, Integer> hm = new HashMap<>();
        
        // [ 경기에 참여한 선수들 ]
        // player에 participant 안에 있는 값 하나하나를 대입
        // ex ] player : "leo", "kiki", "eden" / player : "marina", "josipa", "nikola", "vinko", "filipa" / player : "mislav", "stanko", "mislav", "ana"
        for (String player : participant) {
        	// getOrDefault : 찾는 키가 존재하면 찾는 키의 값을 반환하고, 없으면 기본값을 반환한다.
        	// hm에 put을 해주는데 hm에 player가 있다면 0을 반환하고 없다면 1을 반환한다.
        	// 현재 hm에는 값이 없기 떄문에 {"leo" : 1, "kiki" : 1, "eden" : 1} 식으로 들어가있을 것이다.
        	hm.put(player, hm.getOrDefault(player, 0) + 1);
        }
        System.out.println("participant의 값을을 map에 담은 결과값 : " + hm);
        
        // [ 완주한 선수들 ]
        // player에 completion의 값 하나한 대입
        // ex ] player : "eden", "kiki" / player : "josipa", "filipa", "marina", "nikola" / player : "stanko", "ana", "mislav"
        for (String player : completion) {
        	// hm에 put을 해주는데 player가 hm에 존재한다면 그것의 value값을 -1해준다.
        	hm.put(player, hm.get(player) - 1);
        }
        System.out.println("completion의 값들을 map에 담은 결과값 : " + hm);

        
        // hm에 들어있는 key값들만큼 for문돌려서
        for (String key : hm.keySet()) {
        	// hm value값이 0이 아닌애를 = 완주하지 못한 선수
            if (hm.get(key) != 0){
            	// answer에 key를 담아준다.
                answer = key;
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println("정답 : " + solution(new String[] {"leo", "kiki", "eden"}, new String[] {"eden", "kiki"}));
		System.out.println("정답 : " + solution(new String[] {"marina", "josipa", "nikola", "vinko", "filipa"}, new String[] {"josipa", "filipa", "marina", "nikola"}));
		System.out.println("정답 : " + solution(new String[] {"mislav", "stanko", "mislav", "ana"}, new String[] {"stanko", "ana", "mislav"}));
		
	}

}
