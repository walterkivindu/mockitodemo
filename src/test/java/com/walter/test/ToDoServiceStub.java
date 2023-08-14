package com.walter.test;

import java.util.Arrays;
import java.util.List;

import com.walter.mockitodemo.TotoService;

public class ToDoServiceStub implements TotoService {

	@Override
	public List<String> receiveTodos(String user) {
		return Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
	}

}
