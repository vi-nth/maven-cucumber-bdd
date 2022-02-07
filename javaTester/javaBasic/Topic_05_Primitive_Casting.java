package javaBasic;

public class Topic_05_Primitive_Casting {

	public static void main(String[] args) {
		
		// Ép kiểu ngầm định = không mất dữ liệu
		//		byte bNumber = 126;
		//		System.out.println(bNumber);
		//		
		//		short sNumber= bNumber;
		//		System.out.println(sNumber);
		//		
		//		int iNumber = sNumber;
		//		System.out.println(iNumber);
		//		
		//		long lNumber = iNumber;
		//		System.out.println(lNumber);
		//		
		//		float fNumber = lNumber; // f<l
		//		System.out.println(fNumber);
		//		
		//		double dNumber = fNumber;
		//		System.out.println(dNumber);
		
		// Tường minh = Casting type
		double dNumber = 6546546983543543454d;
		System.out.println(dNumber);
		
		float fNumber = (float) dNumber;
		System.out.println(fNumber);
		
		long lNumber = (long) fNumber;
		System.out.println(lNumber);
		
		int iNumber = (int) lNumber;
		System.out.println(iNumber);

	}

}
