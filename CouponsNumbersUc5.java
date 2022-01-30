package com.bridgelabz.logicalproblems;

public class CouponsNumbersUc5 {
	public static void main(String[] args) 
	{
		char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
		int max=100000000;
		int random=(int) (Math.random()*max);	
		StringBuffer sb=new StringBuffer();
		
		while (random>0)
		{
			char ch = chars[random % chars.length];
			sb.append(ch);
			random /= chars.length;
		}

		String couponCode=sb.toString();
		System.out.println("Coupon Code: "+couponCode);	
	}

}
