package in.javahome.hibernate.crud;

import org.hibernate.Session;

public class GetStudentData {
	public static void main(String[] args) {
		try(Session session = HibUtil.getSession()){
			Student std = session.get(Student.class, 1);// executes select query
			/*System.out.println(std.getStdId());
			System.out.println(std.getName());
			System.out.println(std.getPhone());*/
		}
	}
}
