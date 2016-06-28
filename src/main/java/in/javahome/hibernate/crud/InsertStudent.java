package in.javahome.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class InsertStudent {
	public static void main(String[] args) {

		Session session = HibUtil.getSession();

		Student s1 = new Student();
		s1.setName("Ramesh");
		s1.setPhone("99778887766");
		s1.setStdId(3);
		Transaction tx = session.beginTransaction();
		session.persist(s1);// internally it executes insert query
		tx.commit();
	}
}
