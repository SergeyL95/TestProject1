package Feb2AbstractionCont;

public class PaperDemo {
	public static void main(String[] args) {
		
		A4Paper a4 = new A4Paper();
		
		Printable print = a4;
		print.print();
		
		Showable show = a4;
		show.show();
		
		
	}
}
