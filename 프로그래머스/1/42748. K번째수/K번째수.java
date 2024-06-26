import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int k=0;
		
		for(int i=0; i<commands.length; i++) {
			
			k=0;
			
			int[] tmp = new int[commands[i][1]-commands[i][0]+1];
			for(int j=commands[i][0]-1; j<commands[i][1]; j++) {
				tmp[k++] = array[j];
			}
			
			Arrays.sort(tmp);
			answer[i] = tmp[commands[i][2]-1];
		}
        return answer;
    }
}