package br.com.infnet.factory;

import br.com.infnet.model.InputData;

public interface AbstractFactory<T> {
	T create(String peopleType, Integer id, InputData input, PeopleFactory factory);
}
