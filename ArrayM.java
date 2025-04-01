public class ArrayM
{
	private int[] a;
	public ArrayM(int[] a)
	{
		this.a = a;
	}

	public String showArray()
	{
		String output = "[";
		for(int i=0; i<a.length; i++)
		{
			output+=a[i];
			output+="|";
		}
		output+="]";
		return output;
	}
	public int addArray()
	{
		int sum = 0;
		for(int i =0; i<a.length; i++)
		{
			sum+=a[i];
		}
		return sum;

	}
	public boolean createTemporary()
	{
		boolean doneTemp = false;
		int[] temp = new int[a.length];
		for(int i =0; i<a.length; i++)
		{
			temp[i] = a[i];
			doneTemp=true;
		}
		return doneTemp;
	}
}