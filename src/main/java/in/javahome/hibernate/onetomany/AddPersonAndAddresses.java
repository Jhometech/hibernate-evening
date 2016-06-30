package in.javahome.hibernate.onetomany;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.javahome.hibernate.crud.HibUtil;

public class AddPersonAndAddresses {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Transaction tx = session.beginTransaction();
		Person p1 = new Person();
		p1.setName("Ram");
		p1.setMail("ram@javahome.in");

		Address a1 = new Address();
		a1.setState("KA");
		a1.setCity("Banglore");

		Address a2 = new Address();
		a2.setState("Maharastra");
		a2.setCity("Pune");

		a1.setPerson(p1);
		a2.setPerson(p1);

		session.save(a1);
		session.save(a2);
		session.save(p1);
		tx.commit();
		session.close();
	}
}
