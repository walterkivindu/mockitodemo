package com.walter.mockitodemo;

import java.util.ArrayList;
import java.util.List;

public class TodoBusinessImpl {

	private TotoService service;

	public TodoBusinessImpl(TotoService service) {
		this.service = service;
	}

	public List<String> retreiveTodosRelatedSpring(String user) {
		List<String> filteredTodos = new ArrayList<>();
		List<String> allTodos = service.receiveTodos(user);
		for (String todo : allTodos) {
			if (todo.contains(user)) {
				filteredTodos.add(todo);
			}
		}
		return filteredTodos;
	}

}
