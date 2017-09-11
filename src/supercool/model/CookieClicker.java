package supercool.model;

public class CookieClicker
{

	//Declaration Section
	//Data member Section
	private int size;
	
	public CookieClicker()
	{
		this.size = 7;
	}
	
	public CookieClicker(int size)
	{
		this.size = size;
	}
	
	public String toString()
	{
		String description = "Mhhhhhh... Cookie Clicks.. want " + size + "?";
		return description;
	}
}