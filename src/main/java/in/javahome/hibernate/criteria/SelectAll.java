package in.javahome.hibernate.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import in.javahome.hibernate.crud.HibUtil;
import in.javahome.hibernate.manytomany.Book;

public class SelectAll {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();

		Criteria crit = session.createCriteria(Book.class);
		crit.setFirstResult(0);
		crit.setMaxResults(50);
		// SELECT * FROM BOOK
		// SELECT * FROM AUTHOR WHERE AUTHOR_ID in (SELECT AUTH_ID FROM BOOK);
		// Select * FROM BOOK
		List<Book> books = crit.list();
		for (Book book : books) {
			System.out.println(book.getName());
			System.out.println(book.getCost());
			System.out.println("******************");
		}
	}
}
