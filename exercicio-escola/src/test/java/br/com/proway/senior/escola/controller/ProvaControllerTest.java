package br.com.proway.senior.escola.controller;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.proway.senior.escola.model.Aluno;
import br.com.proway.senior.escola.model.Materia;
import br.com.proway.senior.escola.model.Prova;


public class ProvaControllerTest {




		static Integer periodoPadrao = 202105;
		static ProvaController provaController;
		static Prova prova;

		@BeforeClass
		public static void setUpBeforeClass() throws Exception {
			Aluno aluno = new Aluno();
			Materia materia = new Materia();
			prova = new Prova(periodoPadrao, aluno, materia);
			provaController = new ProvaController(prova);

		}

		@Test
		public void testProvaControllerProva() {
			assertNotNull(provaController);
		}

		@Test
		public void testAddProva() throws Exception {
			prova.setNota(7.0);
			provaController.addProva();
			assertEquals(0, (int) provaController.get(0).getId());
		}

		@Test
		public void testRemoveProva() throws Exception {
			prova.setNota(8.0);
			ProvaController prova2 = new ProvaController(prova);
			prova2.addProva();
			prova2.removeProva();
			assertNull(prova2.get(0));
		}

		@Test
		public void testGet() {
			provaController.addProva();
			assertEquals(0, (int) provaController.get(0).getId());
		}

	}

