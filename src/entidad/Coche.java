package entidad;
//java bean o pojo, atributos privados y g y s publicos
//tmb tienen que tener el cons por defecto o cons vacio
public class Coche {

	private int id;
	private String matricula;
	private String modelo;
	private String marca;
	
	private int km;
	private Motor motor;
	
	private String color;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	//constructor por defecto
	public Coche() {
		super();
	}


	public Coche(int id, String matricula, String modelo, String marca, Motor motor, int km, String color) {

		super();
		this.id = id;
		this.matricula = matricula;
		this.modelo = modelo;
		this.marca = marca;
		this.km = km;
		this.motor = motor;
		this.color = color;;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	
	
	
}
