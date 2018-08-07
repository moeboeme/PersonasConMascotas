package modelo;

import java.util.List;

public class Loro implements Mascota {

	private String nombre ;
	private List<Juguete> juguetes ;
	private int energia ;
	private int id ;
	

	public Loro ( String myNombre)
	{
		this.setNombre(myNombre) ;
	}
	
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
		System.out.println("Not letuce... I hope... lvl of energy augmented by 30");
		this.setEnergia(this.getEnergia() + 30);
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
