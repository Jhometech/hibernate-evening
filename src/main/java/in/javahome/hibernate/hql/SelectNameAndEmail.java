package in.javahome.hibernate.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import in.javahome.hibernate.crud.HibUtil;

public class SelectNameAndEmail {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Query hqlSelect = session.createQuery("select authorName,mail from Author");
		List<Object[]> authors = hqlSelect.list();
		for (Object[] row : authors) {
			System.out.println(row[0]);
			System.out.println(row[1]);
		}
	}
}
