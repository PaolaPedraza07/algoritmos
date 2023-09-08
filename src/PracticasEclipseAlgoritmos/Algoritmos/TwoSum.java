package PracticasEclipseAlgoritmos.Algoritmos;

public class TwoSum {

	public static void main(String[] args) {
		//Devuelve los indices de la suma de los dos numeros que den el target
		/*Input: nums = [2,7,11,15], target = 9
				Output: [0,1]
				Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/
		
		int [] nums = {2,15,11,7};
		int[] result = twoSum(nums, 9);
		System.out.println(result[0]);
		System.out.println(result[1]);


	}
	public static int[] twoSum(int[] nums, int target) {
		
		int [] n1 = new int[2];
        for(int i=0; i<nums.length-1; i++) {
        	
        	for(int x=i+1; x<nums.length; x++) {
        		if(nums[i]+nums[x]==target) {
        			n1[0]=i;
            		n1[1]=x;
            		return n1;
        		}
        	}
        }
        return n1;
    }
}
