package supercool.controller;

import supercool.model.PlayDohCircle;

public class ProcessController
{
	public ProcessController()
	{
		
	}
	
	public void start()
	{
		System.out.println("I'm a super cool project!");
		System.out.println("Wha u got to say about that?");
		
		PlayDohCircle firstCircle = new PlayDohCircle();
		PlayDohCircle secondCircle;
		secondCircle = new PlayDohCircle();
		
		System.out.println("LooK I made a circle");
		System.out.println(firstCircle);
		System.out.println(secondCircle);
	}
}
