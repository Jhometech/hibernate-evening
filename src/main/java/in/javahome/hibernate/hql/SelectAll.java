package in.javahome.hibernate.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import in.javahome.hibernate.crud.HibUtil;
import in.javahome.hibernate.manytomany.Author;

public class SelectAll {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Query hqlSelect = session.createQuery("from Author");
		List<Author> authors = hqlSelect.list();
		for (Author author : authors) {
			System.out.println(author.getAuthorName());
			System.out.println(author.getMail());
		}
	}
}
