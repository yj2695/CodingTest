class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
		for(int l = i; l<=j; l++) {
			
			for(int m=0; m<String.valueOf(l).length(); m++) {
				
				if(String.valueOf(l).substring(m, m+1).equals(String.valueOf(k))) {
					answer++;
				}
			}
		}
        
        return answer;
    }
}