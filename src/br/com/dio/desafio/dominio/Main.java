package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso java");
		curso1.setDescricao("Descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso js");
		curso2.setDescricao("Descrição curso js");  
		curso2.setCargaHoraria(4);
		
		Conteudo conteudo = new Curso();
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de java");
		mentoria.setDescricao("Descrição mentoria java");
		mentoria.setData(LocalDate.now());
				
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devFabiana = new Dev();
		devFabiana.setNome("Fabiana");
		devFabiana.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Fabiana" + devFabiana.getConteudosInscritos());
		devFabiana.progredir();
		devFabiana.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Concluídos Fabiana" + devFabiana.getConteudosConcluidos());
		System.out.println("Conteúdos Concluídos Fabiana" + devFabiana.getConteudosConcluidos());
		System.out.println("XP:" + devFabiana.calcularTotalXp());
		
		
		System.out.println("--------------");
		
		
		Dev devWagner = new Dev();
		devWagner.setNome("Wagner");
		devWagner.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Wagner" + devWagner.getConteudosInscritos());
		devWagner.progredir();
		devWagner.progredir();
		devWagner.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Concluídos Wagner" + devWagner.getConteudosConcluidos());
		System.out.println("Conteúdos Concluídos Wagner" + devWagner.getConteudosConcluidos());
		System.out.println("XP" + devWagner.calcularTotalXp());
	}

}
