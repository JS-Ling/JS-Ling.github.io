import service.BookService;
import service.impl.BookServiceImpl;

public class run{
	public static void main(String[] args) {
		BookService bookService=new BookServiceImpl();
		bookService.save();
	}
} 