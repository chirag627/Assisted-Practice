
public class stringToPremitiveData {
	public static void main(String[] args) {
		// String to int using Integer.parseInt()
		String a = "123";
		int a1 = Integer.parseInt(a);
		System.out.println(a1);

		// String to float
		String b = "123.324f";
		float b1 = Float.parseFloat(b);
		System.out.println(b1);

		// String to double
		String c = "123.324";
		double c1 = Double.parseDouble(c);
		System.out.println(c1);

		// String to short
		String d = "123";
		short d1 = Short.parseShort(d);
		System.out.println(d1);

		// String to Byte
		String e = "123";
		byte e1 = Byte.parseByte(e);
		System.out.println(e1);

	}
}
