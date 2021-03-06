package modelo;

import java.util.List;

public class Gato implements Mascota {
	
	private String nombre ;
	private List<Juguete> juguetes ;
	private int energia ;
	private int id ;
	
	public Gato ( String myNombre)
	{
		this.setNombre(myNombre) ;
	}
	
	@Override
	public int getId() {
		return this.id ;
	}

	@Override
	public void setId(int myId) {
		this.id = myId ;
	}
	
	@Override
	public void alimentate() {
		System.out.println("Milky! lvl of gnergy augmented by 10");
		this.setEnergia(this.getEnergia() + 10 );
	}
	
	@Override
	public void rompeLasPelotas()
	{
		System.out.println("miau, miau... me llamo Macri");
		setEnergia(getEnergia() - 5) ;
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
	public void setNombre(String myNombre) {
		this.nombre = myNombre;
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
