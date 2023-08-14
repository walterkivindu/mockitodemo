package com.walter.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.walter.mockitodemo.TodoBusinessImpl;
import com.walter.mockitodemo.TotoService;



public class TodoBusinessStubTest {
	
	@Test
	public void usingStub() {
		TotoService doService = new ToDoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(doService);
		List<String> todos = todoBusinessImpl.retreiveTodosRelatedSpring("Spring");
		assertEquals(2, todos.size());
	}

}
