package in.javahome.hibernate.criteria;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;

import in.javahome.hibernate.crud.HibUtil;
import in.javahome.hibernate.manytomany.Book;

public class CountExample {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		
		Criteria crit = session.createCriteria(Book.class);
		crit.setProjection(Projections.count("name"));
//		Select count(*) FROM BOOK
		System.out.println("Count "+crit.uniqueResult());
	}
}
