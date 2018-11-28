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
	public final static String[] ROLES = {
			"INVITADO",
			"NORMAL",
			"ADMINSTRADOR"
			};

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
		
		setNif(nif);
		setNombre(nombre);
		setApellidos(apellidos);
		setDomicilio(domicilio);
		setCorreo(correo);
		setFechaNacimiento(fechaNacimiento);
		setFechaAlta(fechaAlta);
		setClaveAcceso(claveAcceso);
		setRol(rol);
	}

	public Usuario() {
		this.nif = "00000000T";
		this.nombre = "Nombre";
		this.apellidos = "Apellidos";
		this.domicilio = "Domicilio";
		this.correo = "corre@cooreo.es";
		this.fechaNacimiento = new GregorianCalendar();
		this.fechaAlta = new GregorianCalendar();
		this.claveAcceso = "Miau#0";
		this.rol = ROLES[1];
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		assert nif != null;
		if (nifValido(nif)) {	
			this.nif = nif;
		}	
	}

	private boolean nifValido(String nif) {
		return !nif.matches("[ ]+");
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
		assert apellidos != null;
		if (apellidosValido(apellidos)) {	
			this.apellidos = apellidos;
		}
		
	}

	private boolean apellidosValido(String apellidos) {
		return !apellidos.matches("[ ]+");
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		assert domicilio != null;
		if (domicilioValido(domicilio)) {	
			this.domicilio = domicilio;
		}
	}

	private boolean domicilioValido(String domicilio) {
		return !domicilio.matches("[ ]+");
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		assert correo != null;
		if (correoValido(correo)) {	
			this.correo = correo;
		}
	}

	private boolean correoValido(String correo) {
		return !correo.matches("[ ]+");
	}

	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Calendar fechaNacimiento) {
		assert fechaNacimiento != null;
		if (fechaNacimientoValida(fechaNacimiento)) {	
			this.fechaNacimiento = fechaNacimiento;
		}	
	}

	private boolean fechaNacimientoValida(Calendar fechaNacimiento) {
		return fechaNacimiento.before(new GregorianCalendar());
	}

	public Calendar getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Calendar fechaAlta) {
		assert fechaAlta != null;
		if (fechaAltaValida(fechaAlta)) {	
			this.fechaAlta = fechaAlta;
		}	
	}

	private boolean fechaAltaValida(Calendar fechaAlta) {
		return !fechaAlta.after(new GregorianCalendar());
	}

	public String getClaveAcceso() {
		return claveAcceso;
	}

	public void setClaveAcceso(String claveAcceso) {
		assert claveAcceso != null;
		if (claveAccesoValida(claveAcceso)) {	
			this.claveAcceso = claveAcceso;
		}	
	}

	private boolean claveAccesoValida(String claveAcceso) {
		return !claveAcceso.matches("[ ]+");
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		assert rol != null;
		if (rolValida(rol)) {	
			this.rol = rol;
		}
	}

	private boolean rolValida(String rol) {
		return !rol.matches("[ ]+");
	}

	
} // class

