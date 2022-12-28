import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the values ");
		//int num = sc.nextInt();
		int[]nums =new int[5];
		for(int k=0; k<5;k++) {
			nums[k] = sc.nextInt();
		}
			
	     System.out.print("enter the target ");
			int target = sc.nextInt();
		     sc.close();
	     //int res;
	     for(int i=0; i<nums.length; i++ ) {
	    	 for(int j=i+1;j<nums.length-1;j++) {
	    		 if(nums[i]+nums[j] == target) {
	    			 System.out.print(i+" "+j);
	    			 
	    			 
	    		 }
	    	 }
	     }
	

	}

}
