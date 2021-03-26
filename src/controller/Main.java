package controller;

import java.util.concurrent.Semaphore;

public class Main {

	public static void main(String[] args) {
		
		int permissoes = 4;
		Semaphore semaforo = new Semaphore (permissoes);
		
		for (int idPessoa = 0; idPessoa < 4; idPessoa++) {
			Thread tCarro = new ThreadCorredor(idPessoa,semaforo);
			tCarro.start();
			
			
			
			
		    }
	   }

	}


