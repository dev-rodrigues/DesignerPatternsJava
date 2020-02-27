package br.com.infnet.model;

public class Teacher implements People {
	protected Integer id;
	protected String name;
	protected String lastName;
	
	public Teacher(Integer id, String name, String lastName) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
	}

	@Override
	public void consultarSituacao() {
		System.out.println("Teacher: " + this.id + " - "+ this.lastName + ", "  + this.name);
	}

	@Override
	public String getPeople() {
		return "Teacher";
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
