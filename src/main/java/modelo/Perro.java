package modelo;

import java.util.List;

public class Perro implements Mascota {
	
	private int id ;
	private List<Juguete> juguetes ;
	private String nombre ;
	private int energia ;
	
	@Override
	public int getId() {
		return this.id;
	}
	
	@Override
	public void setId(int myId) {
		this.id = myId ;
	}
	
	@Override
	public void alimentate() {
		System.out.println("Barf... rrrr, aumento lvl of enrgy by 20");
		this.setEnergia(this.getEnergia() + 20);
	}
	
	@Override
	public void rompeLasPelotas() {
		System.out.println("me muerdo la cola");
		this.energia -= 2 ;
	}
	
	@Override
	public void agregarJuguete(Juguete juguete) {
		this.juguetes.add(juguete) ;
	}
	
	@Override
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public int getEnergia() {
		return energia;
	}
	
	@Override
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	
	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public void addJuguete(Juguete juguete)
	{
		this.juguetes.add(juguete) ;
	}
	
	@Override
	public void setJuguetes(List<Juguete> juguetes) {
		this.juguetes = juguetes;
	}
	
	@Override
	public List<Juguete> getJuguetes() {
		return this.juguetes;
	}


}
