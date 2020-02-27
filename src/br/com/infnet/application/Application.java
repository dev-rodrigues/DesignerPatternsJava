package br.com.infnet.application;

import br.com.infnet.factory.PeopleFactory;
import br.com.infnet.model.People;
import br.com.infnet.service.MenuService;
import br.com.infnet.service.PeopleService;

public class Application {

	public static void main(String[] args) {
		PeopleService peopleService = new PeopleService();
		MenuService menuService = new MenuService();
		PeopleFactory factory = new PeopleFactory();
		People[] peoples = new People[100];

		int option = 0;

		while (option != 4) {
			option = menuService.returnTheSelectedMenu();
			menuService.performMenuSelection(option, peoples, peopleService, menuService, factory);
		}

	}
}
