package es.studium.Aleatorio;

import java.util.Random;

public class Aleatorio2 
{
	public static void main(String[] args)
	{
		Random rnd=new Random();
		int i,x;
		for(i=0;i<5;i++)
		{
			x=rnd.nextInt(10);
			System.out.println(x);
		}
	}
}
