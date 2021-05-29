package org.arpit.java2blog;
class A
{
	int a=100;
}

public class B extends A{
	int a=200;

	public static void main(String[] args)
	{
		B  b = new B();
		System.out.println(b.a);

}}