package modelo;

import java.util.List;

public class Hamster implements Mascota {

	private String nombre ;
	private List<Juguete> juguetes ;
	private int energia ;
	

	@Override
	public void alimentate() {
		// TODO Auto-generated method stub
	}
	public int getEnergia() {
		return energia;
	}
	
	public void setEnergia(int energia) {
		this.energia = energia;
	}

	@Override
	public void rompeLasPelotas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void agregarJuguete(Juguete juguete) {
		this.juguetes.add(juguete) ;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Juguete> getJuguetes() {
		return juguetes;
	}

	public void setJuguetes(List<Juguete> juguetes) {
		this.juguetes = juguetes;
	}

}
