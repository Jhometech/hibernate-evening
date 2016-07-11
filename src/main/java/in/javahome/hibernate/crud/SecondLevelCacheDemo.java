package in.javahome.hibernate.crud;

import org.hibernate.Session;

public class SecondLevelCacheDemo {
	public static void main(String[] args) {
		Session session1 = HibUtil.getSession();
		Session session2 = HibUtil.getSession();
		session1.get(Student.class, 1);
		session2.get(Student.class, 1);
	}
}
