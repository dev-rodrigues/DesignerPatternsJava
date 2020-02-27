package br.com.infnet.service;

import br.com.infnet.factory.PeopleFactory;
import br.com.infnet.model.InputData;
import br.com.infnet.model.People;
import br.com.infnet.model.Student;
import br.com.infnet.model.Teacher;
import br.com.infnet.util.Utility;

public class PeopleService {
	
	public Student createStudent(InputData input, People[] peoples, PeopleFactory factory) {
		return (Student) factory.create("Student", Utility.returnTheNextIdValid(peoples), input, factory);
	}

	public Teacher createTeacher(InputData input, People[] peoples, PeopleFactory factory) {
		return (Teacher) factory.create("Teacher", Utility.returnTheNextIdValid(peoples), input, factory);
	}

	public void writePeoples(People[] peoples) {
		if (peoples[0] == null) {
			System.out.println("Não existe pessoas cadastradas");
		} else {
			for (People people : peoples) {
				if (people != null) {
					people.consultarSituacao();
				}
			}
		}
	}
	
	public People findById(People[] peoples, int id) {
		if (peoples[id] == null) {
			return null;
		}
		return peoples[id];
	}
}
