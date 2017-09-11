package supercool.controller;

import supercool.model.PlayDohCircle;

import supercool.model.CookieClicker;

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
		
		PlayDohCircle thirdCircle = new PlayDohCircle(10);
		System.out.println(thirdCircle);
		
		
		CookieClicker firstClick = new CookieClicker();
		CookieClicker secondClick;
		secondClick = new CookieClicker();
		
		System.out.println("I got lots of clicks");
		System.out.println(firstClick);
		System.out.println(secondClick);
		}
}
