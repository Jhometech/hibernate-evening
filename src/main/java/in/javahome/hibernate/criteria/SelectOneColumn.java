package in.javahome.hibernate.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import in.javahome.hibernate.crud.HibUtil;
import in.javahome.hibernate.manytomany.Book;

public class SelectOneColumn {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		
		Criteria crit = session.createCriteria(Book.class);
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(Projections.property("name"));
		projectionList.add(Projections.property("cost"));
		crit.setProjection(projectionList);
//		Select name, cost FROM BOOK
		List<Object[]> books = crit.list();
		for (Object[] book : books) {
			System.out.println(book[0]);
			System.out.println(book[1]);
		}
	}
}
