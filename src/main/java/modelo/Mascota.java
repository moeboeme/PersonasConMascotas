package modelo;

import java.util.List;

public interface Mascota {
	
	public int getId() ;
	
	public void setId ( int myId ) ;
	
	public void alimentate() ;
	
	public void rompeLasPelotas() ;

	public void agregarJuguete(Juguete juguete) ;
	
	public String getNombre () ;
	
	public int getEnergia() ;
	
	public void setEnergia (int myEnergia);
	
	public void setNombre (String myNombre) ;
	
	public void addJuguete(Juguete juguete) ;
	
	public void setJuguetes(List<Juguete> juguetes) ;
	
	public List<Juguete> getJuguetes();
	
}
