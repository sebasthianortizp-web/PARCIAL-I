package uniquindio.edu.co.model;

import java.util.ArrayList;
import java.util.List;

public class Reserva {
    //Atributos de la clase Reserva
    private int codReserva;
    private String fechaRealizacion;
    private String fechaEntrada;
    private String fechaSalida;
    private String estado;
    private String metodoPago;
    private int numHabitacion;
    private String tipo;
    private double valorTotal;
    //Relaciones de la clase Reserva
    private Huesped huesped;
    private List<Servicio> listReservaServicios;
    private List<Habitacion> listReservaHabitaciones;

    /**
     * Metodo constructor de la clase Reserva
     * @param codReserva de la reserva
     * @param fechaRealizacion de la reserva
     * @param fechaEntrada de la reserva
     * @param fechaSalida de la reserva
     * @param estado de la reserva
     * @param metodoPago de la reserva
     * @param valorTotal de la reserva
     * @param numHabitacion de la reserva
     * @param tipo de la reserva
     */
    public Reserva(int codReserva, String fechaRealizacion, String fechaEntrada, String fechaSalida, String estado, String metodoPago, int numHabitacion, String tipo, double valorTotal) {
        this.codReserva = codReserva;
        this.fechaRealizacion = fechaRealizacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.estado = estado;
        this.metodoPago = metodoPago;
        this.valorTotal = valorTotal;
        this.numHabitacion = numHabitacion;
        this.tipo = tipo;

        this.listReservaServicios = new ArrayList<>();
        this.listReservaHabitaciones = new ArrayList<>();
    }

    public int getCodReserva() {
        return codReserva;
    }

    public void setCodReserva(int codReserva) {
        this.codReserva = codReserva;
    }

    public String getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(String fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(int numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public List<Servicio> getListReservaServicios() {
        return listReservaServicios;
    }

    public void setListReservaServicios(List<Servicio> listReservaServicios) {
        this.listReservaServicios = listReservaServicios;
    }

    public List<Habitacion> getListReservaHabitaciones() {
        return listReservaHabitaciones;
    }

    public void setListReservaHabitaciones(List<Habitacion> listReservaHabitaciones) {
        this.listReservaHabitaciones = listReservaHabitaciones;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "codReserva=" + codReserva +
                ", fechaRealizacion='" + fechaRealizacion + '\'' +
                ", fechaEntrada='" + fechaEntrada + '\'' +
                ", fechaSalida='" + fechaSalida + '\'' +
                ", estado='" + estado + '\'' +
                ", metodoPago='" + metodoPago + '\'' +
                ", valorTotal=" + valorTotal +
                ", numHabitacion=" + numHabitacion +
                ", tipo='" + tipo + '\'' +
                ", huesped=" + huesped +
                ", listReservaServicios=" + listReservaServicios +
                ", listReservaHabitaciones=" + listReservaHabitaciones +
                '}';
    }
}
