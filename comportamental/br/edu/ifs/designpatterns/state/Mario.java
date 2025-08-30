package br.edu.ifs.designpatterns.state;

public class Mario {
	
	private Estado estado;
	
	public Mario() {
		this.estado = new MarioPequeno();
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public String atacar() {
		return estado.atacar(this);
	}
	
	public void pegarCogumelo() {
		estado.pegarCogumelo(this);
	}
	
	public void pegarFlor() {
		estado.pegarFlor(this);
	}
	
	public void pegarPena() {
		estado.pegarPena(this);
	}
	
	public void sofreDano() {
		estado.sofreDano(this);
	}
	
	public String obterEstado() {
		return estado.getNome();
	}
}

interface Estado {
	String atacar(Mario mario);
	void pegarCogumelo(Mario mario);
	void pegarFlor(Mario mario);
	void pegarPena(Mario mario);
	void sofreDano(Mario mario);
	String getNome();
}

class MarioPequeno implements Estado {
	@Override
	public String atacar(Mario mario) {
		return "Salto";
	}
	
	@Override
	public void pegarCogumelo(Mario mario) {
		mario.setEstado(new SuperMario());
	}
	
	@Override
	public void pegarFlor(Mario mario) {
		mario.setEstado(new MarioFogo());
	}
	
	@Override
	public void pegarPena(Mario mario) {
		mario.setEstado(new MarioVoador());
	}
	
	@Override
	public void sofreDano(Mario mario) {
		mario.setEstado(new MarioMorto());
	}
	
	@Override
	public String getNome() {
		return "Mario pequeno";
	}
}

class SuperMario implements Estado {
	@Override
	public String atacar(Mario mario) {
		return "Super salto";
	}
	
	@Override
	public void pegarCogumelo(Mario mario) {
	}
	
	@Override
	public void pegarFlor(Mario mario) {
		mario.setEstado(new MarioFogo());
	}
	
	@Override
	public void pegarPena(Mario mario) {
		mario.setEstado(new MarioVoador());
	}
	
	@Override
	public void sofreDano(Mario mario) {
		mario.setEstado(new MarioPequeno());
	}
	
	@Override
	public String getNome() {
		return "Super Mario";
	}
}

class MarioFogo implements Estado {
	@Override
	public String atacar(Mario mario) {
		return "Bola de fogo";
	}
	
	@Override
	public void pegarCogumelo(Mario mario) {
	}
	
	@Override
	public void pegarFlor(Mario mario) {
	}
	
	@Override
	public void pegarPena(Mario mario) {
		mario.setEstado(new MarioVoador());
	}
	
	@Override
	public void sofreDano(Mario mario) {
		mario.setEstado(new SuperMario());
	}
	
	@Override
	public String getNome() {
		return "Mario de fogo";
	}
}

class MarioVoador implements Estado {
	@Override
	public String atacar(Mario mario) {
		return "Capa giratória";
	}
	
	@Override
	public void pegarCogumelo(Mario mario) {
	}
	
	@Override
	public void pegarFlor(Mario mario) {
	}
	
	@Override
	public void pegarPena(Mario mario) {
	}
	
	@Override
	public void sofreDano(Mario mario) {
		mario.setEstado(new SuperMario());
	}
	
	@Override
	public String getNome() {
		return "Mario voador";
	}
}

class MarioMorto implements Estado {
	@Override
	public String atacar(Mario mario) {
		throw new IllegalStateException("Mario está sem vida!");
	}
	
	@Override
	public void pegarCogumelo(Mario mario) {
		throw new IllegalStateException("Mario está sem vida!");
	}
	
	@Override
	public void pegarFlor(Mario mario) {
		throw new IllegalStateException("Mario está sem vida!");
	}
	
	@Override
	public void pegarPena(Mario mario) {
		throw new IllegalStateException("Mario está sem vida!");
	}
	
	@Override
	public void sofreDano(Mario mario) {
		throw new IllegalStateException("Mario está sem vida!");
	}
	
	@Override
	public String getNome() {
		return "Mario morto";
	}
}