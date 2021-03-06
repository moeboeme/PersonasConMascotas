package modelo;

import java.util.List;

public class Raton implements Mascota {

	private String nombre ;
	private List<Juguete> juguetes ;
	private int energia ;
	private int id ;
	
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
		System.out.println("Cheesus! lvl of enrgy augmented in 4");
		energia += 4 ;
	}
		
	@Override
	public void rompeLasPelotas() {
		System.out.println("Estamosfritosestamosfritos");
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
