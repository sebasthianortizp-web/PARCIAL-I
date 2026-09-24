package uniquindio.edu.co.model;

public class Servicio {
    //Atributos de la clase ServicioAdicional
    public int codigo;
    public String nombre;
    public String descripcion;
    public double precio;
    public String disponibilidad;

    /**
     * Metodo constructor de la clasa Servicio
     * @param codigo del servicio
     * @param nombre del servicio
     * @param descripcion del servicio
     * @param precio del servicio
     * @param disponibilidad del servicio
     */
    public Servicio(int codigo, String nombre, String descripcion, double precio, String disponibilidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.disponibilidad = disponibilidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Servicio{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", disponibilidad='" + disponibilidad + '\'' +
                '}';
    }
}
