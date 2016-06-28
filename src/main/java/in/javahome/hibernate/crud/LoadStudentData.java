package in.javahome.hibernate.crud;

import org.hibernate.Session;

public class LoadStudentData {
	public static void main(String[] args) {
		try (Session session = HibUtil.getSession()) {
			Student std = session.load(Student.class, 3);
			System.out.println(std.getStdId());
			/*System.out.println(std.getName());
			System.out.println(std.getPhone());*/
		}
	}
}
