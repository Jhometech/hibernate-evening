package in.javahome.hibernate.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import in.javahome.hibernate.crud.HibUtil;
import in.javahome.hibernate.manytomany.Author;

public class SelectAllConditionOnAssociation {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		
		Criteria crit = session.createCriteria(Author.class);
		crit = crit.createCriteria("books");
		crit.add(Restrictions.ne("name", "HADOOP"));
//		Select * FROM Authors
		List<Author> authors = crit.list();
		for (Author author : authors) {
			System.out.println(author.getAuthorName());
			System.out.println(author.getMail());
			System.out.println("******************");
		}
	}
}
