package Demos;

public class StringBuilderAndBuffer {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		builder.append("marshmellow");
		//builder.reverse();
		System.out.println(builder.toString());
		builder.delete(0, 4);
		System.out.println(builder.toString());
		builder.delete(builder.indexOf("hm"), builder.indexOf("l"));
		System.out.println(builder.toString());
		builder.insert(2, "-INSERTED-");
		System.out.println(builder.toString());	
		
	}
	
}
