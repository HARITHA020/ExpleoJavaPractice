package arrays;
public class SingleDimension1 {
	public static void main(String[] args) {
		int[] marks=new int[3];
		marks[0]=89;
		marks[1]=90;
		//marks[3]=10;
		/*System.out.println("Element at 0th index:"+marks[0]);
		System.out.println("Element at index 1:"+marks[1]);
		System.out.println("element ar index 2:"+marks[2]);
		*/
		/*for(int i=0;i<marks.length;i++) {
			System.out.println("Element of index"+i+"is:"+marks[i]);
			*/
		for(int i:marks) {
			System.out.println("Element of index is:"+i);
			
		}
	}
}
