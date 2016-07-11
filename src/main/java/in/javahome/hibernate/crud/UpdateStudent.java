package in.javahome.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class UpdateStudent {
	public static void main(String[] args) {
		try (Session session = HibUtil.getSession()) {
			Transaction tx = session.beginTransaction();
			Student std = session.get(Student.class, 1);
			std.setPhone("8888888888");
			std.setName("Kishore");
			session.update(std);
			tx.commit();
		}
	}
}
