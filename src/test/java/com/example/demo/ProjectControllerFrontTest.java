package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * Nombre Clase: ProjectControllerFrontTest.java Descripcion: Clase que recoge
 * las pruebas Mock del controlador frontoffice de proyectos Fecha: 19/05/2021
 * Version: 1.0 Autor: Francisco Rayo
 * 
 **/

@SpringBootTest
@AutoConfigureMockMvc
public class ProjectControllerFrontTest {

	@Autowired
	private MockMvc mockMvc;

	/**
	 * Prueba para comprobar que hay que llamar al proyecto por su ID y no String
	 * 
	 * @author Francisco Rayo
	 */
	@Test
	public void test_project_find_project_not_exists() throws Exception {
		final MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/proyectos/aaabbbccc");
		this.mockMvc.perform(requestBuilder).andDo(MockMvcResultHandlers.print())
				.andExpect(MockMvcResultMatchers.status().is4xxClientError());

	}

	/**
	 * Prueba para comprobar que un proyecto existe
	 * 
	 * @author Francisco Rayo
	 */
	@Test
	public void test_project_find_project() throws Exception {
		final MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/proyectos/6");
		this.mockMvc.perform(requestBuilder).andDo(MockMvcResultHandlers.print())
				.andExpect(MockMvcResultMatchers.status().is2xxSuccessful());

	}

	/**
	 * Prueba para comprobar que un proyecto existe. Falla aposta.
	 * 
	 * @author Francisco Rayo
	 */
	@Test
	public void test_project_find_project2() throws Exception {
		final MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/proyectos/6000");
		this.mockMvc.perform(requestBuilder).andDo(MockMvcResultHandlers.print())
				.andExpect(MockMvcResultMatchers.status().is2xxSuccessful());

	}

	/**
	 * Prueba para comprobar que combinación de int+String da error "type mismatch"
	 * 
	 * @author Francisco Rayo
	 */
	@Test
	public void test_project_find_project_not_exists_2() throws Exception {
		final MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/proyectos/1a");
		this.mockMvc.perform(requestBuilder).andDo(MockMvcResultHandlers.print())
				.andExpect(MockMvcResultMatchers.status().is2xxSuccessful());

	}
}
