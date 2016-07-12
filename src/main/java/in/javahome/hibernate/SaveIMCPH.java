package in.javahome.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.javahome.hibernate.crud.HibUtil;
import in.javahome.hibernate.inheritance.CardPayment;
import in.javahome.hibernate.inheritance.CashPayment;

public class SaveIMCPH {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		CashPayment p1 = new CashPayment();
		p1.setAmount(10000.0);
		
		CardPayment p2 = new CardPayment();
		p2.setAmount(25000.0);
		p2.setCardNo("9999-0000-9876-3456");
		
		session.save(p1);
		session.save(p2);
		tx.commit();
		session.close();
		
	}
}
