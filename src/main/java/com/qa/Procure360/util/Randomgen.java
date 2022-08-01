package com.qa.Procure360.util;

import java.util.Random;

public class Randomgen {

	public static void main(String[] args) {

		
		for(int i =0;i<=50;i++)
		{
				Random randomGen = new Random();
				String num = "Firstname"+randomGen.nextInt(1000)+"Test";
				System.out.println(num);
		}

	}

}
