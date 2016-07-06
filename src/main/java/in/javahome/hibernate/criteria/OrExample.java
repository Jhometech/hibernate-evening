package in.javahome.hibernate.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;

import in.javahome.hibernate.crud.HibUtil;
import in.javahome.hibernate.manytomany.Book;

public class OrExample {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		
		Criteria crit = session.createCriteria(Book.class);
		SimpleExpression r1 = Restrictions.eq("name", "OCJP");
		SimpleExpression r2 = Restrictions.eq("cost", 750.0);
		
		crit.add(Restrictions.or(r1,r2));
//		Select * FROM BOOK where name='OCJP' OR cost=750.0
		List<Book> books = crit.list();
		for (Book book : books) {
			System.out.println(book.getName());
			System.out.println(book.getCost());
			System.out.println("******************");
		}
	}
}
