package in.javahome.hibernate.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

import in.javahome.hibernate.crud.HibUtil;
import in.javahome.hibernate.manytomany.Book;

public class OrderBy {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		
		Criteria crit = session.createCriteria(Book.class);
		crit.addOrder(Order.desc("name"));
//		Select * FROM BOOK Order by name asc
		List<Book> books = crit.list();
		for (Book book : books) {
			System.out.println(book.getName());
			System.out.println(book.getCost());
			System.out.println("******************");
		}
	}
}
