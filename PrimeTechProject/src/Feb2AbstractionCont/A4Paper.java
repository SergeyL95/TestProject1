package Feb2AbstractionCont;

public class A4Paper implements Printable, Showable {

	@Override
	public void show() {
		System.out.println("showing");
		
	}

	@Override
	public void print() {
		System.out.println("printing");
		
	}
	
}
