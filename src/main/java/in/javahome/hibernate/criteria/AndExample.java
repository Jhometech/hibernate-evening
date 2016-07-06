package in.javahome.hibernate.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import in.javahome.hibernate.crud.HibUtil;
import in.javahome.hibernate.manytomany.Book;

public class AndExample {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		
		Criteria crit = session.createCriteria(Book.class);
		crit.add(Restrictions.eq("name", "OCJP"));
		crit.add(Restrictions.eq("cost", 750.0));
//		Select * FROM BOOK where name='OCJP' AND cost=750.0
		List<Book> books = crit.list();
		for (Book book : books) {
			System.out.println(book.getName());
			System.out.println(book.getCost());
			System.out.println("******************");
		}
	}
}
