package com.FirstJava;

public class TypeCasting 
{
 public static void main(String[] args) 
  {
	int i1 =12340;
	long l1 = i1;
	System.out.println("Implicit is ... "+l1);
	
	int i2 = (int)l1;
	System.out.println("Expicit is ...  "+i2);
	
	byte b = (byte)i2;
	System.out.println("Byte Casting is ... "+b);
	
 }
}
