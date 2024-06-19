package csen703.main.assignment1;

public class TheBadBatch {

	public static boolean haveZero(int[] fuel) {
		for(int i=0; i< fuel.length ; i++){
            if (fuel[i] == 0){
                return true;
            }
        }
        return false;
	}

	public static boolean TatooineToNabooDivideAndConquer(int[] fuel) {
        if(fuel.length< 5){
            if(fuel.length == 0)
                return false;
            if(fuel.length == 1){
                if(fuel[0] > 3){
                    return true;
                }else{
                    return false;
                }
            }
        }
		if(!haveZero(fuel)) {
			return true;
		}
        if (fuel[0]==0) {
            return false;
        }

        return willFinish(0, fuel[0] , fuel); //recursive call
	}

    public static boolean willFinish(int currentIndex , int currentFuel , int[] fuel){ //recursive function

        boolean output = false;
        if(currentIndex == fuel.length-1) {
            return true;
        }
        if(currentFuel == 0){
            return false;
        }
        for(int i = 1 ; i<= currentFuel; i++ ){
            output = output || willFinish(currentIndex + i  , fuel[currentIndex + i] , fuel);
        }

        return output;
    }

    public static boolean TatooineToNabooGreedy(int[] fuel) {
        int currentIndex = 0;
        if(fuel.length < 5){
            if(fuel.length == 0)
                return false;
            if (fuel.length == 1)
                return fuel[fuel.length-1] > 3;
        }
        for (int i = 0; i <= currentIndex && i < fuel.length; i++) {
            currentIndex = Math.max(currentIndex, i + fuel[i]);
            if (currentIndex >= fuel.length-1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] fuel1 = {2, 3, 1, 1, 4};
        System.out.println(TatooineToNabooGreedy(fuel1)); // Output: true  *

        int[] fuel2 = {3, 2, 1, 0, 4};
        System.out.println(TatooineToNabooGreedy(fuel2)); // Output: false *

        int[] fuel3 = {5};
        System.out.println(TatooineToNabooGreedy(fuel3)); // Output: true *

        int[] fuel4 = {0, 3, 1, 1, 4};
        System.out.println(TatooineToNabooGreedy(fuel4)); // Output: false *

        int[] fuel5 = {1, 1, 1, 1, 1};
        System.out.println(TatooineToNabooGreedy(fuel5)); // Output: true *

        int[] fuel6 = {0, 0, 0, 0, 0};
        System.out.println(TatooineToNabooGreedy(fuel6)); // Output: false *

        int[] fuel7 = {};
        System.out.println(TatooineToNabooGreedy(fuel7)); // Output: false *

        int[] fuel8 = {3};
        System.out.println(TatooineToNabooGreedy(fuel8)); // Output: false *

        int[] fuel9 = {4};
        System.out.println(TatooineToNabooGreedy(fuel9)); // Output: true *

        int[] fuel10 = {2, 4};
        System.out.println(TatooineToNabooGreedy(fuel10)); // Output: true *

        int[] fuel11 = {1, 0};
        System.out.println(TatooineToNabooGreedy(fuel11)); // Output: false *

        int[] fuel12 = {2, 1, 3};
        System.out.println(TatooineToNabooGreedy(fuel12)); // Output: true *

        int[] fuel13 = {3, 2, 0, 1, 4};
        System.out.println(TatooineToNabooGreedy(fuel13)); // Output: true *
    }
}


