package controller;

import java.util.concurrent.Semaphore;

public class ThreadCorredor extends Thread {

	private int corredores = 4;
	private static int posChegada;
	private static int posSaida;
	private int idPessoa;
	private Semaphore semaforo;
	
	public ThreadCorredor (int idPessoa, Semaphore semaforo) {
		this.idPessoa = idPessoa;
		this.semaforo = semaforo;
	}

	@Override
	public void run() {
		
		PessoaAndando();
		
		try {
			semaforo.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
		
			pessoaParada ();
			
		
	}

	
	
	
	private void pessoaParada() {
		System.out.println("#" + idPessoa + "parou");
		int tempo = (int) ((Math.random()*2001) + 1000);
		try {
			sleep (tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	
	private void pessoaSaindo() {
		posSaida++;
		System.out.println("#" + idPessoa+" foi o  "+posSaida+" o.sair");
		
	}
	
	private void PessoaAndando() {
	int distanciaCorredor = 200;
	int deslocamento =  (int) ((Math.random()*4000) + 6000);
	int tempo =  (int) ((Math.random()*1000) + 2000);
	
	while (distanciaCorredor < deslocamento) {
		distanciaCorredor +=deslocamento;
		
		try {
			sleep (tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("#" +idPessoa+ "caminhou" + distanciaCorredor + "s");
	}
		posChegada++;
		System.out.println("#" + idPessoa +" foi o  "+posChegada+" o. a entrar");
	}
	
	}
	
	


