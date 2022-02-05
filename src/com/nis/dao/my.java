package com.nis.dao;

import java.util.Scanner;
public class my {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		int y=0;
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		y=a[0];
		for(int i=1;i<n;i++)
		{
			System.out.println(y);
			y= y+a[i];
		}
		System.out.println(y);
	}
}
