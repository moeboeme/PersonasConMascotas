package controlador;

import java.util.List;

public interface DAO<T> {
	
	public List<T> getAll() ;
	
	public T find( int id ) ;
	
	public void persistir ( T object ) ;
	
	public void add ( T object ) ;
	
	public void modificar ( T object ) ;
	
}
