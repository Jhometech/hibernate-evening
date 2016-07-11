package in.javahome.hibernate.hql;

import org.hibernate.Query;
import org.hibernate.Session;

import in.javahome.hibernate.crud.HibUtil;

public class SelectCount {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Query hqlSelect = session.createQuery("select count(authorName) from Author");
		hqlSelect.setFirstResult(0);
		hqlSelect.setMaxResults(50);
		System.out.println(hqlSelect.uniqueResult());
	}
}
