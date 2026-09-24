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
    /**
     * Metodo constructor de la clase Habitacion
     * @param numero de la habitacion
     * @param piso de la habitacion
     * @param tipo de la habitacion
     * @param capacidad de la habitacion
     * @param precioNoche de la habitacion
     * @param estado de la habitacion
     */
    public Habitacion(int numero, int piso, String tipo, String capacidad, double precioNoche, String estado) {
        this.numero = numero;
        this.piso = piso;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.precioNoche = precioNoche;
        this.estado = estado;

        this.listHabitaciionHuespedes = new ArrayList<>();
        this.listHabitaciionServicios = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Huesped> getListHabitaciionHuespedes() {
        return listHabitaciionHuespedes;
    }

    public void setListHabitaciionHuespedes(List<Huesped> listHabitaciionHuespedes) {
        this.listHabitaciionHuespedes = listHabitaciionHuespedes;
    }

    public List<Servicio> getListHabitaciionServicios() {
        return listHabitaciionServicios;
    }

    public void setListHabitaciionServicios(List<Servicio> listHabitaciionServicios) {
        this.listHabitaciionServicios = listHabitaciionServicios;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "numero=" + numero +
                ", piso=" + piso +
                ", tipo='" + tipo + '\'' +
                ", capacidad='" + capacidad + '\'' +
                ", precioNoche=" + precioNoche +
                ", estado='" + estado + '\'' +
                ", listHabitaciionHuespedes=" + listHabitaciionHuespedes +
                ", listHabitaciionServicios=" + listHabitaciionServicios +
                '}';
    }
}
