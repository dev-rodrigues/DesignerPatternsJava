package br.com.infnet.application;

import br.com.infnet.model.People;
import br.com.infnet.service.MenuService;

public class Application {

	public static void main(String[] args) {
		// PeopleService peopleService = new PeopleService();
		MenuService menuService = new MenuService();

		People[] peoples = new People[100];

		int option = 0;

		while (option != 5) {
			option = menuService.returnTheSelectedMenu();
			menuService.performMenuSelection(option, peoples);
		}

	}
}
