package br.com.infnet.util;

import br.com.infnet.model.People;

public class Utility {
	public static Integer returnTheNextIdValid(People[] peoples) {
		int next = -1;

		for (int i = 0; i < peoples.length; i++) {
			if (peoples[i] == null) {
				next = i;
				break;
			}
		}

		return next;
	}
}
