public class ArrayM
{
	private int[] Array;
	public ArrayM(int[] Array)
	{
		this.Array = Array;
	}

	public String showArray()
	{
		String output = "[";
		for(int i=0; i<Array.length; i++)
		{
			output+=Array[i];
			output+="|";
		}
		output+="]";
		return output;
	}
}