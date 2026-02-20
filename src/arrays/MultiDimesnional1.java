package arrays;

/** the arrayDemo class implements an application that illustrate the access of multi-dimensenional array element
 */
public class MultiDimesnional1 {
	public static void main(String[] args) {
		int[][] arr=new int[][]{{1,2},{2,3},{3,4}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
