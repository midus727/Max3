package max3;

public class Max3 {

	public static int max3(int i, int j, int k) {
		/**
		 * Returns the maximum of 3 given numbers
		 * 
		 * @post The result equals one of the given numbers.
		 * 	| result == i || result == j  || result == k
		 * @post The result is not less than any of the given numbers
		 * 	| i <= result && j<= result && k<= result
		 */
		
		if (i<j)
			if (j<k)
				return k;
			else 
				return j;
		else 
			if (i<k)
				return k;
			else 
				return i;
	}

}
