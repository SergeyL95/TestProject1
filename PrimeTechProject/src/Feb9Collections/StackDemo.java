package Feb9Collections;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		
		Stack<String> colors = new Stack<String>();
		
		colors.push("red");
		colors.push("yellow");
		colors.push("blue");
		colors.push("pink");
		
		System.out.println(colors);
		
		colors.pop();
		
		System.out.println(colors);
		
		
	}
}
