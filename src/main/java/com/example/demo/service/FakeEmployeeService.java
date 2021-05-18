package com.example.demo.service;
import java.util.List;

import com.example.demo.model.FakeEmployee;

public interface FakeEmployeeService {
	// Para listar todos los fake employees
	public List<FakeEmployee> findAll(int x);
}
