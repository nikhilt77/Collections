public class GarbageCollector {
	public String toString() {
		return "Hello";
	}
	public void finalize() {
		System.out.println("Garbage Collected");
	}
}
