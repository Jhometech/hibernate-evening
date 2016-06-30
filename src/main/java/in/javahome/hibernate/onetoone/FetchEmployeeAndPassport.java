package in.javahome.hibernate.onetoone;

import org.hibernate.Session;

import in.javahome.hibernate.crud.HibUtil;

public class FetchEmployeeAndPassport {
	public static void main(String[] args) {
		Session session = HibUtil.getSession();
		Employee emp = session.get(Employee.class, 1);
		System.out.println(emp.getName());
		System.out.println(emp.getEmpId());
		
		Passport passport = emp.getPassport();
		System.out.println(passport.getPassportNo());
		System.out.println(passport.getPoi());
	}
}
