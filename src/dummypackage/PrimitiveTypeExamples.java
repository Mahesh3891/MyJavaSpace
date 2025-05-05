package dummypackage;

public class PrimitiveTypeExamples {

	static byte defaultbyte;										// Initiating all default datatypes
	static short defaultshort;										// All variables are outside Main method, so made them static so it can be used in Static Main Method
	static int defaultint;
	static long defaultlong;
	static float defaultfloat;
	static double defaultdouble;
	static boolean defaultboolean;
	static char defaultchar;
	
	public static void main(String[] args) {
		
		// DataTypes in Java - Primitive Data Types
		
		byte myByte = 99;											// All varaibles are within Main Method, so no need of make them Static 
		short myShort = 999;
		int	myInt = 9999;
		long myLong = 99999;
		float myFloat = 99.99f;
		double myDouble = 45.3456789876543212345678f;
		double myDouble1 = 45.3456789876543212345678;
		boolean myBoolean = true;									// Do not use Capital "T" as it accepts  case sensitive character 
		char myChar = 'A';											// Use single quotes '' for char data type 
		
		System.out.println ("Default Byte: " + defaultbyte);		// Printing all default values first
		System.out.println ("Default short: " + defaultshort);		// All variables are local, so can be used without static 
		System.out.println ("Default int: " + defaultint);	
		System.out.println ("Default long: " + defaultlong);
		System.out.println ("Default Float: " + defaultfloat);
		System.out.println ("Default Double: " + defaultdouble);
		System.out.println ("Default Boolean: " +defaultboolean);
		System.out.println ("Default Char: " + defaultchar);
		
		System.out.println ("--------------------------------------------------------------");
		
		System.out.println ("Byte: " + myByte);						// Printing all initialed values to the variables - 1 Byte - 8 Bits ; Range -128 to 127
		System.out.println ("Short: " + myShort);					// 2 Bytes - 16 bits; Range -32,768 to 32,767
		System.out.println ("Int: " + myInt);						// 4 Bytes - 32 bits; Range 2,147,483,648 to 2,147,483,647
		System.out.println ("Long: " + myLong);						// 8 Bytes - 64 Bits; Range 9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		System.out.println ("Float: " + myFloat);					// 4 Bytes			; Range 
		System.out.println ("Double: " + myDouble);					// 8 Bytes			; Range 
		System.out.println ("Double1: " + myDouble1);					
		System.out.println ("Double2: " + 45.3456789876543212345678);
		System.out.println ("Booelan: " + myBoolean);				// 1 or 2 Bytes		; Range 0 or 1
		System.out.println ("Char: " + myChar);						// Uses ASCII: Stores single character/letter or ASCII value.

	}

}
