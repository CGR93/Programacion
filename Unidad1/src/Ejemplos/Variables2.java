package Ejemplos;

public class Variables2 {
	static boolean unBoolean;
	static byte unByte;
	static short unShort;
	static int unInt;
	static long unLong;
	static float unFloat;
	static double unDouble;
	static char unChar;
	static String unString;
	
	public static void main(String[] args) {
		
		unBoolean = true;
		unByte = 10;
		unShort = 10;
		unInt = 10;
		unLong = 10;
		unFloat = 3.14f;
		unDouble = 3.14f;
		unChar = 'A';
		unString = new String("Hola");
		System.out.println("El boolean vale: "+ unBoolean);
		System.out.println("El byte vale: "+ unByte);
		System.out.println("El short vale: "+ unShort);
		System.out.println("El int vale: "+ unInt);
		System.out.println("El long vale: "+ unLong);
		System.out.println("El float vale: "+ unFloat);
		System.out.println("El double vale: "+ unDouble);
		System.out.println("El char vale: "+ unChar);
		System.out.println("El String vale: "+ unString);
		
	}

}
