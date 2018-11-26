/** Proyecto: Juego de la vida.
 *  Implementa el concepto de Usuario según el modelo1.
 *  En esta versión sólo se ha aplicado un diseño OO básico.
 *  Se pueden detectar varios defectos y antipatrones de diseño:
 *  	- Obsesión por los tipos primitivos.
 *  	- Clase demasiado grande.
 *  	- Clase acaparadora, que delega poca responsabilidad.  
 *  @since: prototipo1.0
 *  @source: Usuario.java 
 *  @version: 1.0 - 2018/11/21 
 *  @author: ajp
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Usuario {

	private String nif;
	private String nombre;
	private String apellidos;
	private String domicilio;
	private String correo;
	private Calendar fechaNacimiento;
	private Calendar fechaAlta;
	private String claveAcceso;
	private String rol;
	public final static String[] ROLES = {"INVITADO", 
			"NORMAL",
	"ADMINSTRADOR"};



	/**
	 * Constructor convencional
	 * @param nif
	 * @param nombre
	 * @param apellidos
	 * @param domicilio
	 * @param correo
	 * @param fechaNacimiento
	 * @param fechaAlta
	 * @param claveAcceso
	 * @param rol
	 */
	public Usuario(String nif, String nombre, String apellidos, String domicilio, String correo,
			Calendar fechaNacimiento, Calendar fechaAlta, String claveAcceso, String rol) {
		this.nif = nif;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.domicilio = domicilio;
		this.correo = correo;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaAlta = fechaAlta;
		this.claveAcceso = claveAcceso;
		this.rol = rol;
	}




	public Usuario() {
		this.nif = "00000000T";
		this.nombre = "Nombre";
		this.apellidos = "Apellidos";
		this.domicilio = "Domicilio";
		this.correo = "corre@cooreo.es";
		this.fechaNacimiento = new GregorianCalendar(); // Hoy
		this.fechaAlta = new GregorianCalendar();
		this.claveAcceso = "Miau#0";
		this.rol = ROLES[1];
	}




	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		assert nombre != null;
		if (nombreValido(nombre)) {	
			this.nombre = nombre;
		}
	}

	private boolean nombreValido(String nombre) {
		return !nombre.matches("[ ]+");
	}




	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Calendar getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Calendar fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public String getClaveAcceso() {
		return claveAcceso;
	}

	public void setClaveAcceso(String claveAcceso) {
		this.claveAcceso = claveAcceso;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}





} // class

