package in.javahome.hibernate.onetoone;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.javahome.hibernate.crud.HibUtil;

public class InsertEmployeeAndPassport {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Transaction tx = session.beginTransaction();
		Employee e1 = new Employee();
		e1.setEmpId(1);
		e1.setName("Chandra");

		Passport p1 = new Passport();
		p1.setPassportNo("501AGF888");
		p1.setPoi("Banglore");
		e1.setPassport(p1);

		session.save(e1);
		session.save(p1);
		tx.commit();
		session.close();
	}
}
