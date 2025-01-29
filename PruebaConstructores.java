
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

class Temperatura{
	double tempRegistrada;
	String horaRegistrada;
	String fechaRegistro;
	byte sensor;
	
	public Temperatura() {
		
	}
	
	public Temperatura(double tempRegistrada, String horaRegistrada, String fechaRegistro, byte sensor) {
		
		this.tempRegistrada = tempRegistrada;
		this.horaRegistrada = horaRegistrada;
		this.fechaRegistro = fechaRegistro;
		this.sensor = sensor;
		
	}
	
	public double[] conversorTemp() {
		
		double[] temperaturas = new double[3];
		
		temperaturas[0] = tempRegistrada * 9/5 + 32;
		temperaturas[1] = tempRegistrada * 9/5 + 491.67;
		temperaturas[2] = tempRegistrada + 273.15;
		
		
		
		return temperaturas;
	}
	
	public void imprimir() {
		
		System.out.println("FARENHEIT: " + conversorTemp()[0]);
		
		System.out.println("RANKINE: " + conversorTemp()[1]);
		
		System.out.println("KELVIN: " + conversorTemp()[2]);
		
		System.out.println("Hora de registro: " + horaRegistrada);
		System.out.println("Fecha de registro: " + fechaRegistro);
		System.out.println("Se activo el sensor: " + sensor);
	}
	
}



class Automovil{
	String linea;
	String color;
	String numSerie;
	String tipo;
	int añoFabricacion;
	String modSeguro;

	
	
	public Automovil() {
		
	}
	
	public Automovil(String linea, String color, String numSerie, String tipo, int añoFabricacion, String modSeguro) {
		
		this.linea = linea;
		this.color = color;
		this.numSerie = numSerie;
		this.tipo = tipo;
		this.añoFabricacion = añoFabricacion;
		this.modSeguro = modSeguro;
		
		
	}
	
	public void imprimirDatos() {
		System.out.println("LINEA: " + linea);
		System.out.println("COLOR: " + color);
		System.out.println("NUMERO SERIE: " + numSerie);
		System.out.println("TIPO: " + tipo);
		System.out.println("AÑO DE FABRICACION: " + añoFabricacion);
		System.out.println("MODALIDAD DE SEGURO: " + modSeguro);
		
		
	}
	
	public int Kilometraje(int kilometros) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		if(añoFabricacion >= 2015) {
			if(kilometros >= 0 && kilometros < 15000) {
				return 1233;
			}
			if(kilometros >= 15000 && kilometros < 30000) {
				return 1233;
			}
			else if(kilometros >= 30000 && kilometros < 45000) {
				return 2270;
			}
			else if(kilometros >= 45000 && kilometros < 60000) {
				return 1233;
			}
			else if(kilometros >= 60000 && kilometros < 75000) {
				return 4103;
			}
			else if(kilometros >= 75000 && kilometros < 90000) {
				return 1185;
			}
			else if(kilometros >= 90000 && kilometros < 105000) {
				return 3978;
			}
			else if(kilometros >= 105000 && kilometros < 120000) {
				return 1233;
			}
			else if(kilometros >= 120000 && kilometros < 135000) {
				return 4103;
			}
			else if(kilometros >= 135000 && kilometros < 150000) {
				return 1233;
			}
			else if(kilometros >= 150000) {
				return 2485;
			}
				
		}
		
		if(añoFabricacion >= 2012 && añoFabricacion <= 2014) {
			if(kilometros >= 0 && kilometros < 15000) {
				return 1624;
			}
			if(kilometros >= 15000 && kilometros < 30000) {
				return 1624;
			}
			else if(kilometros >= 30000 && kilometros < 45000) {
				return 1278;
			}
			else if(kilometros >= 45000 && kilometros < 60000) {
				return 3509;
			}
			else if(kilometros >= 60000 && kilometros < 75000) {
				return 1936;
			}
			else if(kilometros >= 75000 && kilometros < 90000) {
				return 2203;
			}
			else if(kilometros >= 90000 && kilometros < 105000) {
				return 3114;
			}
			else if(kilometros >= 105000 && kilometros < 120000) {
				return 2547;
			}
			else if(kilometros >= 120000 && kilometros < 135000) {
				return 1936;
			}
			else if(kilometros >= 135000 && kilometros < 150000) {
				return 3460;
			}
			else if(kilometros >= 150000) {
				return 1808;
			}
		}
		
		if(añoFabricacion <= 2011) {
			if(kilometros >= 0 && kilometros < 10000) {
				return 1747;
			}
			if(kilometros >= 10000 && kilometros < 20000) {
				return 1747;
			}
			else if(kilometros >= 20000 && kilometros < 30000) {
				return 1286;
			}
			else if(kilometros >= 30000 && kilometros< 40000) {
				return 3045;
			}
			else if(kilometros >= 40000 && kilometros < 50000) {
				return 1945;
			}
			else if(kilometros >= 50000 && kilometros < 60000) {
				return 2326;
			}
			else if(kilometros >= 60000 && kilometros < 70000) {
				return 3536;
			}
			else if(kilometros >= 70000 && kilometros < 80000) {
				return 3650;
			}
			else if(kilometros >= 80000 && kilometros < 90000) {
				return 1945;
			}
			else if(kilometros >= 90000 && kilometros < 100000) {
				return 2997;
			}
			else if(kilometros >= 100000) {
				return 1817;
			}
			
		
		
		}
		return kilometros;
	}
	
}


class Paciente{
	String nombre;
	String apePat;
	String apeMat;
	double peso;
	byte edad;
	String visitMedica;
	String alergias[];
	
	public Paciente() {
		
	}
	
	public Paciente(String nombre, String apePat, String apeMat, double peso, byte edad, String visitMedica, String alergias[]) {
		this.nombre = nombre;
		this.apePat = apePat;
		this.apeMat = apeMat;
		this.peso = peso;
		this.edad = edad;
		this.visitMedica = visitMedica;
		this.alergias = alergias;
	}
	
	
	public void imprimirAtributos() {
		System.out.println("Datos del Paciente");
		System.out.println("NOMBRE: " + nombre);
		System.out.println("APELLIDO PATERNO: " + apePat);
		System.out.println("APELLIDO MATERNO: " + apeMat);
		System.out.println("PESO: " + peso);
		System.out.println("EDAD: " + edad);
		System.out.println("VISITA MEDICA: " + visitMedica);
	}
}


class Materia{
	String claveMateria;
	String nombreMateria;
	String credSatca;  //(en formato   HorasTeoria-HorasPractica-HorasTotales)
	String semestre;
	
	public Materia() {
		
	}
	
	public Materia(String claveMateria, String nombreMateria, String credSatca, String semestre) {
		this.claveMateria = claveMateria;
		this.nombreMateria = nombreMateria;
		this.credSatca = credSatca;
		this.semestre = semestre;
	}
	
	public void imprimirCredSatca(int teoria, int practica, int total) {
		System.out.println("Tus horas de teoria son: " + teoria);
		System.out.println("Tus horas de practica son: " + practica);
		System.out.println("Tus horas totales son: " + total);
		
		
	}
	
	public void imprimirAtributos() {
		System.out.println("Clave de la materia: " + claveMateria);
		System.out.println("Nombre de la materia: " + nombreMateria);
		System.out.println("Creditos Satca: " + credSatca);
		System.out.println("Semestre: " + semestre);
	}
}


class CuentaCredito{
	String numCuenta;
	String nombreTarjetaHab;
	double saldoAct;
	double limiteCred;
	String movimientos[];
	
	
	CuentaCredito(){
		
	}
	
	CuentaCredito(String numCuenta, String nombreTarjetaHab, double saldoAct, double limiteCred){
		
		this.numCuenta = numCuenta;
		this.nombreTarjetaHab = nombreTarjetaHab;
		this.saldoAct = saldoAct;
		this.limiteCred = limiteCred;
		this.movimientos = new String[100];
	}
	
	
	public void registrarMovimiento(String fecha, String hora, String tipoMov) {
		
		for(int i = 0; i < movimientos.length; i++) {
			if (movimientos[i] == null) {
                movimientos[i] = "F-" + fecha + ", H-" + hora + ", " + tipoMov;
                break;
            }
		}
		
	}
	
	
	public String retirarEfectivo(double cantRetirar) {
		
		 Scanner entrada = new Scanner(System.in);

	        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
	        Date horaSis = new Date();

	        LocalDateTime now = LocalDateTime.now();
	        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        String formatoFecha = now.format(formato);

	        System.out.println("Ingrese que movimiento desea hacer (retiro, compra, pago, saldo)");
	        String movCuenta = entrada.next().toUpperCase();
	        if (cantRetirar <= saldoAct) {
	            registrarMovimiento(formatoFecha, dateFormat.format(horaSis), movCuenta);
	        } else {
	            System.out.println("Lo siento :( No tienes cantidad disponible para retirar");
	        }
	        return "H-" + dateFormat.format(horaSis) + ", F-" + formatoFecha + ", " + movCuenta;
	}
	
	
	public void ultimoMovimientoRealizado() {
		 if (movimientos[0] == null) {
	            System.out.println("No hay movimientos registrados aún.");
	        } else {
	            System.out.println("Último movimiento realizado: " + movimientos[0]);
	        }
	}
	
	
	public void mostrarSaldo() {
		System.out.println("SALDO CUENTA: $" + saldoAct);
	}
	
	
	public void realizarPago() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Monto a pagar ");
		double pago = entrada.nextDouble();
		
		saldoAct = saldoAct - pago;
		
		System.out.println("Tu saldo actual es: " + saldoAct);
	}
	
	public void imprimirAtributos() {
		System.out.println("NO. CUENTA: " + numCuenta);
		System.out.println("NOMBRE TARJETA: " + nombreTarjetaHab);
		System.out.println("LIMITE CREDITO: $" + limiteCred);
	}
	

}


public class PruebaConstructores {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		/*
		System.out.println("Ingresa una temperatura en °C: ");
		double temp = entrada.nextDouble();
		
		System.out.println("Ingresa la hora de registro: ");
		String hora = entrada.next();
		
		System.out.println("Ingresa la fecha de registro: ");
		String fecha = entrada.next();
		
		System.out.println("Ingresa el numero de sensor donde se registro: ");
		byte sen = entrada.nextByte();
		
		Temperatura t1 = new Temperatura(temp, hora, fecha, sen);
		
		t1.imprimir();
		
		System.out.println("Ingresa una temperatura en °C: ");
		temp = entrada.nextDouble();
		
		System.out.println("Ingresa la hora de registro: ");
		hora = entrada.next();
		
		System.out.println("Ingresa la fecha de registro: ");
		fecha = entrada.next();
		
		System.out.println("Ingresa el numero de sensor donde se registro: ");
		sen = entrada.nextByte();

		Temperatura t2 = new Temperatura(temp, hora, fecha, sen);
		
		t2.imprimir();
		
		
		System.out.println("Ingresa una temperatura en °C: ");
		temp = entrada.nextDouble();
		
		System.out.println("Ingresa la hora de registro: ");
		hora = entrada.next();
		
		System.out.println("Ingresa la fecha de registro: ");
		fecha = entrada.next();
		
		System.out.println("Ingresa el numero de sensor donde se registro: ");
		sen = entrada.nextByte();

		Temperatura t3 = new Temperatura(temp, hora, fecha, sen);
		
		t3.imprimir();
		
		
		
		System.out.println("----DATOS AUTOMOVIL----");
		
		System.out.println("Ingresa su linea (Tsuru, Platina, Chevy, Jetta");
		String modelo = entrada.next();
		
		System.out.println("Ingresa el color ");
		String pintura = entrada.next();
		
		System.out.println("Ingresa el numero de serie ");
		String noSerie = entrada.next();
		
		System.out.println("Ingresa el tipo (sedan, utilitario o deportivo)");
		String tipoAuto = entrada.next();
		
		System.out.println("Ingresa el año de fabricacion ");
		int fechaFab = entrada.nextInt();
		
		entrada.nextLine();
		
		System.out.println("Ingresa la modalidad de seguro (cobertura amplia o Responsabilidad Civil)");
		String tipoMod = entrada.nextLine();
		
		System.out.println("Ingresa el kilometraje del auto ");
		int km = entrada.nextInt();
		
		
		Automovil auto1 = new Automovil(modelo, pintura, noSerie, tipoAuto, fechaFab ,tipoMod);
		
		auto1.imprimirDatos();
		System.out.println("Kilometros: " + km + " COSTO: " + "$" + auto1.Kilometraje(km));
		
		
		
		System.out.println("----DATOS AUTOMOVIL 2----");
		
		System.out.println("Ingresa su linea (Tsuru, Platina, Chevy, Jetta");
		modelo = entrada.next();
		
		System.out.println("Ingresa el color ");
		pintura = entrada.next();
		
		System.out.println("Ingresa el numero de serie ");
		noSerie = entrada.next();
		
		System.out.println("Ingresa el tipo (sedan, utilitario o deportivo)");
		tipoAuto = entrada.next();
		
		System.out.println("Ingresa el año de fabricacion ");
		fechaFab = entrada.nextInt();
		
		entrada.nextLine();
		
		System.out.println("Ingresa la modalidad de seguro (cobertura amplia o Responsabilidad Civil)");
		tipoMod = entrada.nextLine();
		
		System.out.println("Ingresa el kilometraje del auto ");
		km = entrada.nextInt();
		
		
		Automovil auto2 = new Automovil(modelo, pintura, noSerie, tipoAuto, fechaFab ,tipoMod);
		
		auto2.imprimirDatos();
		System.out.println("Kilometros: " + km + " COSTO: " + "$" + auto2.Kilometraje(km));
		

		
		System.out.println("----DATOS AUTOMOVIL 3----");
		
		System.out.println("Ingresa su linea (Tsuru, Platina, Chevy, Jetta");
		modelo = entrada.next();
		
		System.out.println("Ingresa el color ");
		pintura = entrada.next();
		
		System.out.println("Ingresa el numero de serie ");
		noSerie = entrada.next();
		
		System.out.println("Ingresa el tipo (sedan, utilitario o deportivo)");
		tipoAuto = entrada.next();
		
		System.out.println("Ingresa el año de fabricacion ");
		fechaFab = entrada.nextInt();
		
		entrada.nextLine();
		
		System.out.println("Ingresa la modalidad de seguro (cobertura amplia o Responsabilidad Civil)");
		tipoMod = entrada.nextLine();
		
		System.out.println("Ingresa el kilometraje del auto ");
		km = entrada.nextInt();
		
		
		Automovil auto3 = new Automovil(modelo, pintura, noSerie, tipoAuto, fechaFab ,tipoMod);
		
		auto3.imprimirDatos();
		System.out.println("Kilometros: " + km + " COSTO: " + "$" + auto3.Kilometraje(km));
		
		
		
		
		System.out.println("Ingresa tu nombre ");
		String nom = entrada.next();
		
		entrada.nextLine();
		
		System.out.println("Ingresa tu apellido paterno ");
		String pat = entrada.next();
		
		entrada.nextLine();
		
		System.out.println("Ingresa tu apellido ");
		String mat = entrada.next();
		
		System.out.println("Ingresa tu peso ");
		double masaCorp = entrada.nextDouble();
		
		System.out.println("Ingresa tu edad ");
		byte años = entrada.nextByte();
		
		System.out.println("Ingresa tu ultima visita medica ");
		String visita = entrada.next();
		
		
		System.out.println("Ingresa a cuantos medicamentos eres alergico: ");
		byte medicamentos = entrada.nextByte();
		
		String[] alergia = new String[medicamentos];
		
		for(int i = 0; i < alergia.length; i++) {
			System.out.println("Ingresa el medicamento " + (i+1) + ":");
			alergia[i] = entrada.next();
			
			
		}
		
		
		
		Paciente p1 = new Paciente(nom, pat, mat, masaCorp, años, visita, alergia);
		p1.imprimirAtributos();
		
		for(int i = 0; i < alergia.length; i++) {
			System.out.println("Eres alergico a: " + alergia[i]);
		}
		
		
		
		
		System.out.println("----Datos Materia----");

		System.out.println("Ingresa la clave de la materia ");
		String clave = entrada.next();

		entrada.nextLine(); 

		System.out.println("Ingresa el nombre de la materia ");
		String materia = entrada.nextLine();

		System.out.println("Ingresa tus horas en teoría: ");
		int hrsTeoria = entrada.nextInt();

		System.out.println("Ingresa tus horas en práctica: ");
		int hrsPractica = entrada.nextInt();

		int hrsTotales = hrsTeoria + hrsPractica;

		String satca = "HorasTeoria-" + hrsTeoria + "-HorasPractica-" + hrsPractica + "-HorasTotales-" + hrsTotales;

		System.out.println("Ingresa el semestre en el que se imparte");
		String semMateria = entrada.next();
		
		Materia m1 = new Materia(clave, materia, satca, semMateria);
		m1.imprimirAtributos();
		m1.imprimirCredSatca(hrsTeoria, hrsPractica, hrsTotales);
		
		*/
		
		
		System.out.println("Ingrese su número de cuenta ");
		String cuenta = entrada.next();
		
		System.out.println("Ingresa el nombre de la tarjeta ");
		String nomTarjeta = entrada.next();
		
		System.out.println("Ingresa tu saldo actual ");
		double saldo = entrada.nextDouble();
		
		System.out.println("Ingresa tu limite de credito ");
		double credito = entrada.nextDouble();
		
		CuentaCredito c1 = new CuentaCredito(cuenta, nomTarjeta, saldo, credito);
		
		
		byte opc;
		do {
		System.out.println("--------MENU--------");
		System.out.println("1) Consultar Saldo");
		System.out.println("2) Retirar Efectivo");
		System.out.println("3) Mostrar Ultimo Movimiento");
		System.out.println("4) Realizar Pago");
		System.out.println("-----------------------------");
		System.out.println("5) SALIR");
		
		
		opc = entrada.nextByte();
		
		if(opc == 1) {
			c1.mostrarSaldo();
		}
		else if(opc == 2) {
			
			System.out.println("Ingrese la cantidad a retirar: ");
			double retiro = entrada.nextDouble();
		
			System.out.println(c1.retirarEfectivo(retiro));
			
		}
		else if(opc == 3) {
			c1.ultimoMovimientoRealizado();
		}
		else if(opc == 4) {
			c1.realizarPago();
		}
		else if(opc == 5) {
			System.out.println("Ha salido del menu...");
			
		}
		
		c1.imprimirAtributos();
		}while(opc !=5);
	}

}

