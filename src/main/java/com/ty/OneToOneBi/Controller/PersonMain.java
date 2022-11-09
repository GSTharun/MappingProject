package com.ty.OneToOneBi.Controller;

import com.ty.OneToOneBi.dao.PersonDao;
import com.ty.OneToOneBi.dto.Adhaar;
import com.ty.OneToOneBi.dto.Person;

public class PersonMain {

	public static void main(String[] args) {

		Person person = new Person();
		person.setName("Pooja");
		person.setAge(22);
		person.setAddress("JPTS");

		Adhaar adhaar = new Adhaar();
		adhaar.setName("Pooja Gowda");
		adhaar.setAnum(25789664);

		person.setAdhaar(adhaar);
		adhaar.setPerson(person);

		PersonDao dao = new PersonDao();
		dao.savePerson(person);

	}

}
