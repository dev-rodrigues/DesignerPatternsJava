package br.com.infnet.factory;

import br.com.infnet.model.InputData;
import br.com.infnet.model.People;
import br.com.infnet.model.Student;
import br.com.infnet.model.Teacher;

public class PeopleFactory implements AbstractFactory<People> {

	@Override
	public People create(String peopleType, Integer id, InputData input, PeopleFactory factory) {
		if ("Student".equalsIgnoreCase(peopleType)) {
			return new Student(id, input.getName(), input.getLastName());
			
		} else if ("Teacher".equalsIgnoreCase(peopleType)) {
			return new Teacher(id, input.getName(), input.getLastName());
		}
		
		return null;
	}
}
