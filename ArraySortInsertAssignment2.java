import java.util.Scanner;

public class ArraySortInsertAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating an object of the class
		ReferenceClass refClass = new ReferenceClass();
		
		//getting the number of elements of the array
		System.out.println("Enter the number of elements in the array");
		Scanner sc = new Scanner(System.in);
		refClass.setLen(sc.nextInt());
		
		//defining a new array
		int[] arr= new int[refClass.getLen()];
				
		//initializing the elements of the array
		System.out.println("Enter the "+refClass.getLen()+" elements of the array");
		for(int i=0;i<(refClass.getLen());i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//updating array in the reference class.
		refClass.setArray(arr);
		
		System.out.println();
		
		//getting the number of elements to be inserted to the array
		System.out.println("Enter the number of elements that are to be inserted to the array");
		refClass.setLen1(sc.nextInt());
		
		//defining the new array length
		int[] arr1=new int[refClass.getLen1()];
		
		//get the elements that are to inserted
		System.out.println("Enter the additional "+refClass.getLen1()+" elements to be added");
		for(int i=0;i<refClass.getLen1();i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		sc.close();
		
		//setting the new array in the reference class
		refClass.setArray1(arr1);
		
		//calling the procedure in reference class to insert the elements to the array
		refClass.InsertElementArray((refClass.getLen()+refClass.getLen1()), refClass.getArray(),refClass.getArray1());
	}
	

}
