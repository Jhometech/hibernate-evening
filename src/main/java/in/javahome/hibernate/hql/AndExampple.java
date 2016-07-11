package in.javahome.hibernate.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import in.javahome.hibernate.crud.HibUtil;
import in.javahome.hibernate.manytomany.Author;

public class AndExampple {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Query hqlSelect = session.createQuery("from Author a where a.authorName=? and a.mail=?");
		hqlSelect.setString(0, "Kathy Sierra");
		hqlSelect.setString(1, "kathy@javahome.in");
		List<Author> authors = hqlSelect.list();
		for (Author author : authors) {
			System.out.println(author.getAuthorName());
			System.out.println(author.getMail());
		}
	}
}
