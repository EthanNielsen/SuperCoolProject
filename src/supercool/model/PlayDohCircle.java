package supercool.model;

public class PlayDohCircle
{
	//Declaration Section
	//Data member section
	private int size;
	
	public PlayDohCircle()
	{
		this.size = 5;
		
	}
	
	public PlayDohCircle(int size)
	{
		this.size = size;
	}
	
	public void setSize(int newSize)
	{
		this.size = newSize;
	}
	
	
	public String toString()
	{
		String description = "Ohh yess.. I got this many clicks... " + size;
		return description;
	}
}
