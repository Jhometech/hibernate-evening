package in.javahome.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibUtil {
	private static SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
			.buildSessionFactory();

	public static Session getSession() {
		return sessionFactory.openSession();
	}

}
