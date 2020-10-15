package inheritance;


class Book{
	
	public int x = 0;
	protected int y = 0;
	private int z = 0;
	
//	public Book(int x, int y) {
//		this(x, y, 0);
//	}
//	
//	public Book(int x, int y, int z) {
//		this.x = x;
//		this.y = y;
//		this.z = z;
//	}	
//	
	public String getName() {
		return"book";
	}
}

public class Ch9 extends Book {
	
	//overrides - gets invoke
	public String getName() {
		return "ch9";
	}
	
//	private int v;
	
//	public Ch9( int v) {
//		super(0, 1, 2);
//		this.v = v;
//	}
//	

}

class TestCh9 {
	
	public static void main(String [] arg) {
		
		Book book = new Ch9(); //this is ok
//		Ch9 ch9 = new Book(); //not ok
		Ch9 ch9 = (Ch9)book; // casting to tell compiler is good
		
		System.out.println(book.getName());
	}
	
}