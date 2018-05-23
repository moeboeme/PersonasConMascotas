package modelo;

import java.util.List;

public class Gato implements Mascota {
	
	private String nombre ;
	private List<Juguete> juguetes ;
	private int energia ;
	
	public Gato ( String myNombre)
	{
		nombre=myNombre ;
	}
	
	public void rompeLasPelotas()
	{
		System.out.println("miau, miau... me llamo Macri");
		setEnergia(getEnergia() - 5) ;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void alimentate() {
		
	}

	@Override
	public void agregarJuguete(Juguete juguete) {
		this.juguetes.add(juguete) ;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}
	
}
