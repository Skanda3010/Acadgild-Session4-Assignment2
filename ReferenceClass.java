import java.util.Arrays;

public class ReferenceClass {
	
	int[] array,array1;
	int len,len1;
	public int getLen1() {
		return len1;
	}

	public void setLen1(int len1) {
		this.len1 = len1;
	}

	String someWord;

	public String getSomeWord() {
		return someWord;
	}

	public void setSomeWord(String someWord) {
		this.someWord = someWord;
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public int getLen() {
		return len;
	}

	public void setLen(int len) {
		this.len = len;
	}

	public int[] getArray1() {
		return array1;
	}

	public void setArray1(int[] array1) {
		this.array1 = array1;
	}

	public void RevOfArray(int len1, int[] arrays){

		System.out.println("The reverse of the given array is:");
		for(int i=(len1-1);i>-1;i--)
		{
			System.out.print(arrays[i]);
		}
		
	}
	
	public void RevofString(String aword){
		int StrLen = aword.length();
		System.out.println("Length of the string is "+StrLen);
		char[] ch=aword.toCharArray();
		
		System.out.println("Char array is");
		for(int i=0;i<(StrLen);i++){
			System.out.print(ch[i]);
		}
		
			
		System.out.println();
		System.out.println("Reverse of the String is");
		for(int i=(StrLen-1);i>=0;i--){
			System.out.print(ch[i]);
		}
		
	}
	
	public void SortArray(int[] arrays){
		
		Arrays.sort(arrays);
		
		System.out.println("Sorted array in Ascending order is");
		
		int len = arrays.length;
		
		for(int i=0;i<len;i++){
			System.out.print(arrays[i]);
		}
		
		System.out.println();
		
		System.out.println("Sorted Array in Descending order is");
		
		for(int i=(len-1);i>=0;i--){
			System.out.print(arrays[i]);
		}
		
		
	}
	
	public void InsertElementArray(int len, int[] array, int[] newArray){
		
		int[] ArrayInserted = new int[len];
		
		for(int i=0;i<(array.length);i++){
			ArrayInserted[i]=array[i];
		}
		int j=0;
		for(int i=(array.length);i<(len);i++){
			ArrayInserted[i]=newArray[j];
			j++;
		}
		
		System.out.println("Elemented inserted array is");
		for(int i=0;i<len;i++)
		{
			System.out.print(ArrayInserted[i]);
		}
	}

}
