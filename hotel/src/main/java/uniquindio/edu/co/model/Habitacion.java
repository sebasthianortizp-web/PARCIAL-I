package uniquindio.edu.co.model;

public class Habitacion {
  //Atributos de la clase Habitaciones
    public int numero;
    public int piso;
    public String tipo;
    public String capacidad;
    public double precioNoche;
    public String estado;
    //Relaciones de la clase Habitacion
    private List<Huesped> listHabitaciionHuespedes;
    private List<Servicio> listHabitaciionServicios;
}
