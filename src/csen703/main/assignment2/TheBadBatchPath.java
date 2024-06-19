package csen703.main.assignment2;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



public class TheBadBatchPath {



	    public static int minLandings(int[] fuel) {

	        int[] minLandings = new int[fuel.length];

	        Arrays.fill(minLandings, Integer.MAX_VALUE);

	        if (fuel.length == 0) {

	            return -1;

	        }

	        if (fuel.length == 1) {

	            return fuel[0] > fuel.length ? 0 : -1;

	        }

	        minLandings[0] = 0;
	        int i = 0;
	       
	        while(i < fuel.length) {

	            if (minLandings[i] != Integer.MAX_VALUE) {
	            	int j = 1;
	                while( j <= fuel[i]) {

	                    if (i + j < fuel.length) {

	                        minLandings[i + j] = Math.min(minLandings[i + j], minLandings[i] + 1);

	                    }
	                    j++;

	                }

	            }
	            i++;

	        }

	        return minLandings[fuel.length - 1] != Integer.MAX_VALUE ? minLandings[fuel.length - 1] : -1;

	    }



		public static Integer TatooineToNabooDP(int[] fuel) {
			// TODO Auto-generated method stub
			return minLandings(fuel);
		}

	    public static ArrayList<Integer> TatooineToNabooPath(int[] fuel) {


	        int[] dp = new int[fuel.length];
	        int[] prev = new int[fuel.length];
	        int i = 0;
	        while(i < fuel.length) {
	            dp[i] = Integer.MAX_VALUE;
	            prev[i] = -1;
	            i++;
	        }

	        dp[0] = 0;
	        i=0;
	        while( i < fuel.length) {
	        	int j = i+1;
	            while(j < fuel.length && j <= i + fuel[i]) {
	                if (dp[i] + 1 < dp[j]) {
	                    dp[j] = dp[i] + 1;
	                    prev[j] = i;
	                }
	                j++;
	            }
	            i++;
	        }
	        ArrayList<Integer> path = new ArrayList<>();
	        int current = fuel.length - 1;
	        while (current != -1) {
	            path.add(current);
	            current = prev[current];
	        }

	        Collections.reverse(path); // Reverse the path to get the correct order

	        return path;
	    }
}