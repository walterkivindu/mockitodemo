package com.walter.mockitodemo;

import java.util.ArrayList;
import java.util.List;

public class ToDoServiceImpl implements TotoService {

	@Override
	public List<String> receiveTodos(String user) {
		return new ArrayList<>(List.of("Walter", "Mulwa"));
	}

}
