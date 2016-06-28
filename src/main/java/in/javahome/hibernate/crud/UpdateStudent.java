package in.javahome.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class UpdateStudent {
	public static void main(String[] args) {
		try (Session session = HibUtil.getSession()) {
			Transaction tx = session.beginTransaction();
			Student std = session.get(Student.class, 3);
			Student std2 = new Student();
			std2.setPhone("8888888888");
			std2.setName("Kishore");
			std2.setStdId(3);
			session.merge(std2);
			tx.commit();
		}
	}
}
