package in.javahome.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class DeleteStudent {
	public static void main(String[] args) {
		try (Session session = HibUtil.getSession()) {
			Transaction tx = session.beginTransaction();
			Student std = session.get(Student.class, 1);
			session.delete(std);
			tx.commit();
		}
	}
}
