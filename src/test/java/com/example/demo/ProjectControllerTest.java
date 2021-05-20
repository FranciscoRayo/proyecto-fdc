package com.example.demo;

/**
 * Nombre Clase: ProjectControllerTest.java 
 * Descripcion: Clase que recoge las pruebas Mock del controlador backoffic de proyectos 
 * Fecha: 19/05/2021
 * Version: 1.0 
 * Autor: Francisco Rayo
 * 
 **/

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class ProjectControllerTest {

	@Autowired
	private MockMvc mockMvc;

	/**
	 * Pruebas para comprobar que no encuentra una página por fallo en parámetro de
	 * entrada de la URL. Probado con int y String.
	 * 
	 * @author Francisco Rayo
	 */
	@Test
	public void test_project_fail_400() throws Exception {
		final MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/proyectos/edit/1");
		this.mockMvc.perform(requestBuilder).andDo(MockMvcResultHandlers.print())
				.andExpect(MockMvcResultMatchers.status().is4xxClientError());
	}

	@Test
	public void test_project_fail_400_v2() throws Exception {
		final MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/proyectos/edit/aaaa");
		this.mockMvc.perform(requestBuilder).andDo(MockMvcResultHandlers.print())
				.andExpect(MockMvcResultMatchers.status().is4xxClientError());
	}

	/**
	 * Pruebas para comprobar lanza un error por debido al parámetro de entrada en
	 * la URL.
	 * 
	 * @author Francisco Rayo
	 */
	@Test
	public void test_project_fail_expecting_200() throws Exception {
		final MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/proyectos/edit/aaaa");
		this.mockMvc.perform(requestBuilder).andDo(MockMvcResultHandlers.print())
				.andExpect(MockMvcResultMatchers.status().is2xxSuccessful());
	}

}
