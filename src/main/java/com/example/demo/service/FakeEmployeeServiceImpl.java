package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;
import com.example.demo.model.FakeEmployee;

@Service
public class FakeEmployeeServiceImpl implements FakeEmployeeService {
	private static final Logger log = LoggerFactory.getLogger(FakeEmployeeServiceImpl.class);
	@Override
	public List<FakeEmployee> findAll(int x) {
		log.info("----- Inside FakeEmployeeServiceImpl findAll ----------------------");
		Faker faker = new Faker(new Locale("es")); 
		List<FakeEmployee> empl = new ArrayList<>();
		/*empl.add(new FakeEmployee(1, faker.name().firstName(), faker.name().lastName(),
				faker.job().keySkills(), faker.internet().avatar(), faker.name().title()));*/
		for (int i = 0; i < x; i++) {
			empl.add(new FakeEmployee(i + 1, faker.name().firstName(), faker.name().lastName(),
					faker.job().keySkills(), faker.internet().avatar(), faker.name().title()));
		}

		//log.info("----- Contenido de empl ----------------------" + empl);
		return empl;
	}
}
