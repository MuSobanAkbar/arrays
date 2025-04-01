public class ArrayMDriver
{
	public static void main(String [] args)
	{
		int[] test = {2,5,6}; //test values, you can set it to whatever (will add feature to ask user for input)
		ArrayM testA = new ArrayM(test);
		System.out.print(testA.showArray());
		System.out.println("The sum of the array: " + testA.addArray());
		System.out.println(testA.createTemporary());
	}
}