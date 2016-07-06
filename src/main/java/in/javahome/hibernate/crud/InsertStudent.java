package in.javahome.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class InsertStudent {
	public static void main(String[] args) {

		Session session = HibUtil.getSession();

		Student s1 = new Student();
		s1.setName("Ramesh");
		s1.setPhone("99778887766");
		s1.setStdId(1);
		Transaction tx = session.beginTransaction();
		session.save(s1);
		tx.commit();
	}
}
