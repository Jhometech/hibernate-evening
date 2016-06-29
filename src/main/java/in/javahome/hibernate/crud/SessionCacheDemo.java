package in.javahome.hibernate.crud;

import org.hibernate.Session;

public class SessionCacheDemo {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Student std1 = session.get(Student.class, 1);
		Student std2 = session.get(Student.class, 1);
	}
}
