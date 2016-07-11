package in.javahome.hibernate.hql;

import org.hibernate.Query;
import org.hibernate.Session;

import in.javahome.hibernate.crud.HibUtil;

public class DeleteExample {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Query hqlSelect = session.createQuery("delete from Author where authorId=?");
		hqlSelect.setInteger(0, 11);
		int count = hqlSelect.executeUpdate();
		System.out.println("No of Records deleted " + count);
	}
}
