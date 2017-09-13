package supercool.controller;

import java.util.Scanner;
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
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("How many click do you want?");
		int circleSize = myScanner.nextInt();
		
		
		System.out.println("Oh man.. I can hook you up with some good clicks..");
		System.out.println(firstClick);
		
		System.out.println("How many clicks should we change it to?");
		int updated = myScanner.nextInt();
		thirdCircle.setSize(updated);
		System.out.println(thirdCircle);
		
	//	Scanner sc = new Scanner(System.in);
	//	int i = sc.nextInt (yes);
		
		}
}
