package coding;

public class example {

	int bookId;
	String bookname;
	String bookAuthor;
	int cost;
	
	public example(int bookId,String bookname,String bookAuthor,int cost) {
		this.bookId=bookId;
		this.bookname=bookname;
		this.bookAuthor=bookAuthor;
		this.cost=cost;
		
	}
	

	public void getBookId() {
		System.out.println("BookId is:" + bookId);
	}

	public void getbookName() {
		System.out.println("Book Name is:" + bookname);
	}

	public void getbookAuthor() {
		System.out.println("Book author is:" + bookAuthor);
	}

	public void getCost() {
		System.out.println("Book cost is:" + cost);
	}

}
