package in.javahome.hibernate.nativesql;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import in.javahome.hibernate.crud.HibUtil;
import in.javahome.hibernate.manytomany.Author;

public class SelectAll {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		SQLQuery sqlQuery = session.createSQLQuery("SELECT * FROM AUTHOR");
		sqlQuery.addEntity(Author.class);
		
		List<Author> authors =  sqlQuery.list();
		for (Author author : authors) {
			System.out.println(author.getAuthorName());
		}
		
		
	}
}
