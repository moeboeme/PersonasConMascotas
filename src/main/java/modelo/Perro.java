package modelo;

import java.util.List;

public class Perro implements Mascota {
	
	public List<Juguete> getJuguetes() {
		return juguetes;
	}

	public void setJuguetes(List<Juguete> juguetes) {
		this.juguetes = juguetes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNivelDeEnergia() {
		return nivelDeEnergia;
	}

	public void setNivelDeEnergia(int nivelDeEnergia) {
		this.nivelDeEnergia = nivelDeEnergia;
	}

	private List<Juguete> juguetes ;
	private String nombre ;
	private int nivelDeEnergia ;

	@Override
	public void alimentate() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void rompeLasPelotas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void agregarJuguete(Juguete juguete) {
		// TODO Auto-generated method stub
		
	}

}
