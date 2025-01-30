import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

interface InterfazEmpleado{
	
	public double calcularSalario();
	
	public int calcularAntiguedad();
	
	
}

class Persona{
	
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String fechaNac;
	
	public Persona() {}
	
	public Persona(String nombre, String primerApellido, String segundoApellido, String fechaNac) {
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.fechaNac = fechaNac;
	}
	
	public byte calcularEdad() {
		LocalDateTime fecha = LocalDateTime.now();
		
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    
	    LocalDate fechaNacimiento = null;

	    fechaNacimiento = LocalDate.parse(fechaNac, formatoFecha);
	    
	    byte edad = (byte)(fecha.getYear() - fechaNacimiento.getYear()); 
		
		return edad;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	
	public String getPrimerApellido() {
		return this.primerApellido;
	}
	
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	
	public String getSegundoApellido() {
		return this.segundoApellido;
	}
	
	public void setFechaNacimiento(String fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	public String getFechaNacimiento() {
		return fechaNac;
	}
}

class Empleado extends Persona implements InterfazEmpleado{
	
	
	private String codigo;
	private int diasTrabajados;
	private int añoIngreso;
	
	public Empleado(){}
	
	public Empleado(String nombre, String primerApellido, String segundoApellido, String fechaNac, String codigo, int diasTrabajados, int añoIngreso) {
		super(nombre, primerApellido, segundoApellido, fechaNac);
		
		this.codigo = codigo;
		this.diasTrabajados = diasTrabajados;
		this.añoIngreso = añoIngreso;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	public void setDiasTrabajados(int diasTrabajados) {
		this.diasTrabajados = diasTrabajados;
	}
	
	public int getDiasTrabajados() {
		return this.diasTrabajados;
	}
	
	public void setAñoIngreso(int añoIngreso) {
		this.añoIngreso = añoIngreso;
	}
	
	public int getAñoIngreso() {
		return this.añoIngreso;
	}
	
	@Override
	public double calcularSalario() {
		
		return 0.0;
	}
	
	
	@Override
	public int calcularAntiguedad() {
		
		Calendar Calendario = Calendar.getInstance();
		
		int año = Calendario.get(Calendar.YEAR);
		
		return año - añoIngreso;
		
	}

	
	
}


class EmpleadoTiempoCompleto extends Empleado {
	
	private double pagoPorHora;
	
	public EmpleadoTiempoCompleto() {}
	
	public EmpleadoTiempoCompleto(String nombre, String primerApellido, String segundoApellido, String fechaNac, String codigo, int diasTrabajados, int añoIngreso, double pagoPorHora) {
		super(nombre, primerApellido, segundoApellido, fechaNac, codigo, diasTrabajados, añoIngreso);
		
		this.pagoPorHora = pagoPorHora;
	}
	
	public void setPagoPorHora(double pagoPorHora) {
		this.pagoPorHora = pagoPorHora;
	}
	
	public double getPagoPorHora() {
		return this.pagoPorHora;
	}
	
	public double calcularSalario() {
		double horas = getDiasTrabajados() * 8;
		
		double salarioNeto = horas * pagoPorHora;
		
		return salarioNeto;
	}
	
	

	public int calcularAntiguedad() {
		
		
		Calendar Calendario = Calendar.getInstance();
		
		int año = Calendario.get(Calendar.YEAR);
		
		return año - getAñoIngreso();
	}
	
	
	
	public String toString() {
		return "NOMBRE: " + getNombre() + "\nPRIMER APELLIDO: " + getPrimerApellido() + "\nSEGUNDO APELLIDO: " + getSegundoApellido() 
		+ "\nFECHA DE NACIMIENTO: " + getFechaNacimiento() + "\nCODIGO: " + getCodigo() + "\nDIAS TRABAJADOS: " + getDiasTrabajados() + "\nAÑO INGRESO: " + getAñoIngreso() + "\nPAGO POR HORA: " + getPagoPorHora(); 
	}
}


class EmpleadoHonorario extends Empleado{
	
	private int horasTrabajadas;
	private double pagoPorHora;
	
	public EmpleadoHonorario() {}
	
	public EmpleadoHonorario(String nombre, String primerApellido, String segundoApellido, String fechaNac, String codigo, int diasTrabajados, int añoIngreso, double pagoPorHora, int horasTrabajadas) {
		super(nombre, primerApellido, segundoApellido, fechaNac, codigo, diasTrabajados, añoIngreso);
		this.horasTrabajadas = horasTrabajadas;
		this.pagoPorHora = pagoPorHora;
	}
	
	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	public double calcularSalario() {
		
		double salario = horasTrabajadas * pagoPorHora;
		
		return salario;
	}
	
	
	
	public int calcularAntiguedad() {
		
		Calendar Calendario = Calendar.getInstance();
		
		int año = Calendario.get(Calendar.YEAR);
		
		return año - getAñoIngreso();
	}
	

	public void setPagoPorHora(double pagoPorHora) {
		this.pagoPorHora = pagoPorHora;
	}
	
	
	
	public String toString() {
		return "NOMBRE: " + getNombre() + "\nPRIMER APELLIDO: " + getPrimerApellido() + "\nSEGUNDO APELLIDO: " + getSegundoApellido() 
		+ "\nFECHA DE NACIMIENTO: " + getFechaNacimiento() + "\nCODIGO: " + getCodigo() + "\nAÑO INGRESO: " + getAñoIngreso() + "\nPAGO POR HORA: " + pagoPorHora + "\nHORAS TRABAJADAS: " + horasTrabajadas; 
	}
	
	
}

class CalculadoraImpuesto{
	
	InterfazEmpleado empleado;
	
	
	public void calcular(InterfazEmpleado empleado) {
		this.empleado = empleado;
		
		double salNeto = 0;
		if(empleado instanceof EmpleadoTiempoCompleto) {
			System.out.println("Tu impuesto es del 10%");
			
			salNeto = empleado.calcularSalario() - empleado.calcularSalario() * 0.10;
			
			
		}
		else if(empleado instanceof EmpleadoHonorario) {
			System.out.println("Tu impuesto es del 5%");
			
			salNeto = empleado.calcularSalario() - empleado.calcularSalario() * 0.05;
			
			
		}
		System.out.println("Tu salario despues de aplicar impuestos es: $" + salNeto);
		
	}
		
}
public class PruebaPolimorfismo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		EmpleadoTiempoCompleto etc1 = new EmpleadoTiempoCompleto();
		
		System.out.println("------EMPLEADO TIEMPO COMPLETO------");
		System.out.println("Ingresa tu nombre: ");
		etc1.setNombre(entrada.nextLine());
		
		
		System.out.println("Ingresa tu primer apellido: ");
		etc1.setPrimerApellido(entrada.nextLine());
		
		System.out.println("Ingresa tu segundo apellido: ");
		etc1.setSegundoApellido(entrada.nextLine());
	
		System.out.println("Ingresa tu fecha de nacimiento (DD/MM/YYYY): ");
		etc1.setFechaNacimiento(entrada.next());
		
		System.out.println("Ingresa tu codigo: ");
		etc1.setCodigo(entrada.next());
		
		System.out.println("Ingresa tus dias trabajados: ");
		etc1.setDiasTrabajados(entrada.nextInt());
		
		System.out.println("Ingresa tu año de ingreso a la empresa: ");
		etc1.setAñoIngreso(entrada.nextInt());
		
		System.out.println("Ingresa tu pago por hora: ");
		etc1.setPagoPorHora(entrada.nextDouble());
		
		System.out.println(etc1.toString());
		
		System.out.println("EDAD: " + etc1.calcularEdad() + " años");
		System.out.println("SALARIO: $" + etc1.calcularSalario());
		System.out.println("Antiguedad en la empresa: " + etc1.calcularAntiguedad() + " años");
		
		
	
		CalculadoraImpuesto ci1 = new CalculadoraImpuesto();
		
		ci1.calcular(etc1);
		
		EmpleadoHonorario eh1 = new EmpleadoHonorario();
		
		System.out.println("------EMPLEADO HONORARIO------");
		System.out.println("Ingresa tu nombre: ");
		eh1.setNombre(entrada.nextLine());
		eh1.setNombre(entrada.nextLine());
		
		System.out.println("Ingresa tu primer apellido: ");
		eh1.setPrimerApellido(entrada.nextLine());
		
		System.out.println("Ingresa tu segundo apellido: ");
		eh1.setSegundoApellido(entrada.nextLine());
		
		System.out.println("Ingresa tu fecha de nacimiento (DD/MM/YYYY): ");
		eh1.setFechaNacimiento(entrada.next());
		
		System.out.println("Ingresa tu codigo: ");
		eh1.setCodigo(entrada.next());
		
		System.out.println("Ingresa tus horas trabajadas: ");
		eh1.setHorasTrabajadas(entrada.nextInt());
		
		System.out.println("Ingresa tu año de ingreso a la empresa: ");
		eh1.setAñoIngreso(entrada.nextInt());
		
		System.out.println("Ingresa tu pago por hora: ");
		eh1.setPagoPorHora(entrada.nextDouble());
		
		System.out.println(eh1.toString());
		
		System.out.println("EDAD: " + eh1.calcularEdad() + " años");
		System.out.println("SALARIO: $" + eh1.calcularSalario());
		System.out.println("Antiguedad en la empresa: " + eh1.calcularAntiguedad() + " años");
		
		ci1.calcular(eh1);
		
	}

}