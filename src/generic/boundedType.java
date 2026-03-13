package generic;

public class boundedType {

	static<T extends Number> T genricDispaly(T one, T two) {
		return (T)(Integer)(one.intValue()+two.intValue());
	}
	public static void main(String[] args) {
		System.out.println(genricDispaly(11,5));
		System.out.println(genricDisplay("generic","Test"));

	}

}
