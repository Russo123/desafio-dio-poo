package br.com.dio.desafio.dominio;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso java");
		curso1.setDescricao("Descri��o curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso js");
		curso2.setDescricao("Descri��o curso js");
		curso2.setCargaHoraria(4);
				
		
		System.out.println(curso1);
		System.out.println(curso2);
	}

}
