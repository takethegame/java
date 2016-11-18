public class Foo {
	static {
		System.load("/home/zzhy/project/java/native/foo/TestNative.so");
	}

	public static void main(String[] args) {
		TestNative testNative = new TestNative();
		testNative.foo();
	}
}
