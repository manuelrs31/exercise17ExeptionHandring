package com.exercise17ExeptionHandring.app;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MyExeption {

	public static void main(String[] args) 
	{
		
		int[] number = {1,2,3,4,5,6,7,8,9,10};
		int number1 = 0;
		Scanner input = new Scanner(System.in);
		try
		{
			System.out.println("element  1 is "+number[0]);
			System.out.println("element  2 is "+number[1]);
			System.out.println("element  3 is "+number[2]);
			System.out.println("element  4 is "+number[3]);
			System.out.println("element  5 is "+number[4]);
			System.out.println("element  6 is "+number[5]);
			System.out.println("element  7 is "+number[6]);
			System.out.println("element  8 is "+number[7]);
			System.out.println("element  9 is "+number[8]);
			System.out.println("element  10 is "+number[9]);
			System.out.println("element  11 is "+number[10]); //exeption 
			System.out.println("element  1 is "+number[0]);
			System.out.println("element  2 is "+number[1]);
			System.out.println("element  3 is "+number[2]);
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("hey be careful.you are not directing to a valid index");
		}
		finally
		{
			System.out.println("this finally statement will be executed");
		}
		for (int i=0; i<10; i++)
		{
			try
			{
				System.out.println("input a number between 0-10:");
				number[i] = input.nextInt();
				
			}
			catch(NumberFormatException e)
			{
				System.out.println("hey number your input is wrong do it again ");
				input.next();
				i--;
			}
			catch(InputMismatchException e )
			{
				System.out.println("hey number your input is wrong do it again");
				input.next();
				
			i--;
			}
			finally
			{
				// input.next();
			}
			for (i=0;i<number.length;i++)
			{
				System.out.println("element"+i+":"+number[i]);
			}
		}
		
		// TODO Auto-generated method stu

	}

}
