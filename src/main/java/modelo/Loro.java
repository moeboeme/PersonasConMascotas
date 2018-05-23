package modelo;

import java.util.List;

public class Loro implements Mascota {

	private String nombre ;
	private List<Juguete> juguetes ;
	private int energia ;
	
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

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	@Override
	public void alimentate() {
		
	}

	@Override
	public void rompeLasPelotas() {
		this.energia -= 2 ;
	}

	@Override
	public void agregarJuguete(Juguete juguete) {
		this.juguetes.add(juguete) ;
	}

}
