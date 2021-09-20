package ejbs;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class SaludoEjb
 */
@Stateless
public class SaludoEjb implements SaludoEjbLocal {

	@Override
	public String getSaludo(String nombre) {
		System.out.println(" esto es solo una prueba");
		return "Bienvenido a mi EJB "+nombre;
	}

   

}
