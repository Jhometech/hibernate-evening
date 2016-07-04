package in.javahome.hibernate.manytomany;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.javahome.hibernate.crud.HibUtil;

public class SaveManyToMany {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		Author a1 = new Author();
		a1.setAuthorName("Kathy Sierra");
		a1.setMail("kathy@javahome.in");
		
		
		Book b1 = new Book();
		b1.setName("OCJP");
		b1.setCost(750.0);
		
		Book b2 = new Book();
		b2.setName("Coudera");
		b2.setCost(1050.0);
		
		a1.getBooks().add(b1);
		a1.getBooks().add(b2);
		
		session.save(a1);
		session.save(b1);
		session.save(b2);
		tx.commit();
		session.close();
		
	}
}
