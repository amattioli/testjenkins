package testjenkins;

public class HelloGenerator {
	private String name;
	
	public HelloGenerator(String name) {
		this.name = name;
	}
	
	public String generate() {
		return "Hello " + name + "!";
	}
	
}
