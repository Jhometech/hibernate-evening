package in.javahome.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class SaveOrUpdate {
	public static void main(String[] args) {
		try (Session session = HibUtil.getSession()) {
			Transaction tx = session.beginTransaction();
			Student std = new Student();// executes select query
			std.setStdId(5);
			std.setName("Balu");
			std.setPhone("9988776655");
			session.saveOrUpdate(std);
			tx.commit();
		}
	}
}
