package in.javahome.hibernate.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import in.javahome.hibernate.crud.HibUtil;

public class SelectName {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Query hqlSelect = session.createQuery("select authorName from Author");
		List<String> authors = hqlSelect.list();
		for (String name : authors) {
			System.out.println(name);
		}
	}
}
