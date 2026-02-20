package arrays;
/** The jagged array class implements an application that 
 * illustrate the jagged array
 */
public class jaggedArray {
	public static void main(String[] args) {
		int book[][] =new int[2][];
		book[0]=new int[] {1,2,3};
		book[1]= new int[]{3,4,5,6};
		System.out.println("--Jagged array---");
		
		for(int i=0;i<book.length;i++) {
			for(int j=0;j<book[i].length;j++) {
				System.out.print(book[i][j]+" ");
			}
			System.out.println();
		}
	}
}
