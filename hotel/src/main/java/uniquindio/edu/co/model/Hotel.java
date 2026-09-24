package uniquindio.edu.co.model;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Hotel {
  //Atributos de la clase Hotel
    public String nombreComercial;
    public int nit;
    public String direccion;
    public int telefono;
    public String paginaWeb;
    public int registroHuespedes;
    public int numHabitaciones;
    private int reservas;
    public int serviciosAdicionales;
    //Relaciones de la clase Hotel
    private List<Huesped> listHotelHuespedes;
    private List<Reserva> listHotelReservas;
    private List<Servicio> listHotelServicios;
    private List<Habitacion> listHotelHabitaciones;

    /**
     * Metodo constructor de la clase Hotel
     * @param nombreComercial del hotel
     * @param nit del hotel
     * @param direccion del hotel
     * @param telefono del hotel
     * @param paginaWeb del hotel
     * @param registroHuespedes del hotel
     * @param numHabitaciones del hotel
     * @param reservas del hotel
     * @param serviciosAdicionales del hotel
     */
    public Hotel(String nombreComercial, int nit, String direccion, int telefono, String paginaWeb, int registroHuespedes, int numHabitaciones ,int reservas, int serviciosAdicionales){
        this.nombreComercial = nombreComercial;
        this.nit = nit;
        this.direccion = direccion;
        this.telefono = telefono;
        this.paginaWeb = paginaWeb;
        this.registroHuespedes = registroHuespedes;
        this.numHabitaciones = numHabitaciones;
        this.reservas = reservas;
        this.serviciosAdicionales = serviciosAdicionales;

        this.listHotelHuespedes = new ArrayList<>();
        this.listHotelReservas = new ArrayList<>();
        this.listHotelServicios = new ArrayList<>();
        this.listHotelHabitaciones = new ArrayList<>();
    }

  /**
     * Metodo que me permite registrar a un huesped
     * @param nombreCompleto del huesped
     * @param numIdentificacion del huesped
     * @param telefono del huesped
     * @param correoElectronico del huesped
     * @param paisProcedencia del huesped
     * @param frecuente del huesped
     * @return
     */
    public boolean registrarHuesped(String  nombreCompleto, int numIdentificacion, int telefono, String correoElectronico, String paisProcedencia, String frecuente){
        boolean existe = false;
        Huesped huesped = buscarHuesped(numIdentificacion);
        if ( huesped == null){
            Huesped hues = new Huesped(nombreCompleto, numIdentificacion, telefono, correoElectronico, paisProcedencia, frecuente);
            listHotelHuespedes.add(hues);
        }
        return existe;
    }

    /**
     * Metodo que permit buscar a un huesped
     * @param numIdentificacion del huesped
     * @return
     */
    public Huesped buscarHuesped(int numIdentificacion){
        Huesped encontrar = null;
        for( int i = 0; i<listHotelHuespedes.size(); i++){
            Huesped huesped = listHotelHuespedes.get(i);
            if(huesped.getNumIdentificacion() == numIdentificacion){
                encontrar = huesped;
                break;
            }
        }
        return encontrar;
    }

  /**
     * Metodo para registrar una habitacion de hotel
     * @param numero de la habitacion
     * @param piso de la habitacion
     * @param tipo de la habitacion
     * @param capacidad de la habitacion
     * @param precioNoche de la habitacion
     * @param estado de la habitacion
     * @return
     */
    public boolean registrarHabitacion(int numero, int piso, String tipo, String capacidad, double precioNoche, String estado){
        boolean existe = false;
        Habitacion habitacion = buscarHabitacion(numero);
        if(habitacion == null){
            Habitacion habi = new Habitacion(numero, piso, tipo, capacidad, precioNoche, estado);
            listHotelHabitaciones.add(habi);
        }
        return existe;
    }

    /**
     * Metodo que permite determinar el estado de una habitacion
     * @param numero de habitacion
     * @return
     */
    public int determinarEstadoHabitacion(int numero){
        int mensaje = 0;
        Habitacion habitacion = buscarHabitacion(numero);
        if(habitacion.getEstado().equalsIgnoreCase("Disponible")){
            mensaje = 1;
        }
        if(habitacion.getEstado().equalsIgnoreCase("Ocupado")){
            mensaje = 2;
        }
        if(habitacion.getEstado().equalsIgnoreCase("Reservado")){
            mensaje = 3;
        }
        if(habitacion.getEstado().equalsIgnoreCase("Mantenimiento")){
            mensaje = 4;
        }
        return mensaje;
    }

    /**
     * Metodo que permite encontrar una habitacion
     * @param numero de la habitacion
     * @return
     */
    public Habitacion buscarHabitacion(int numero){
        Habitacion encontrar = null;
        for(int i = 0; i<listHotelHabitaciones.size(); i++){
            Habitacion habitacion = listHotelHabitaciones.get(i);
            if(habitacion.getNumero()==numero){
                encontrar = habitacion;
                break;
            }
        }
        return encontrar;
    }

  /**
     * Metodo que permite el registro de una reserva
     * @param codReserva de la reserva
     * @param fechaRealizacion de la reserva
     * @param fechaEntrada de la reserva
     * @param fechaSalida de la reserva
     * @param estado de la reserva
     * @param metodoPago de la reserva
     * @param valorTotal de la reserva
     * @param numHabitacion de la reserva
     * @param tipo de la reserva
     * @return
     */
    public boolean registrarReserva(int codReserva, String fechaRealizacion, String fechaEntrada, String fechaSalida, String estado, String metodoPago, int numHabitacion, String tipo, double valorTotal){
        boolean existe = false;
        Reserva reserva = buscarReserva(codReserva);
        if(reserva == null){
            Reserva reser = new Reserva(codReserva, fechaRealizacion, fechaEntrada, fechaSalida, estado, metodoPago, numHabitacion, tipo, valorTotal);
            listHotelReservas.add(reser);
        }
        return existe;
    }

    /**
     * Metodo que permite saber el estado de una reserva
     * @param codReserva de la reserva
     * @return
     */
    public int determinarEstadoReserva(int codReserva){
        int mensaje = 0;
        Reserva reserva = buscarReserva(codReserva);
        if(reserva != null){
            mensaje = 1;
        }else if(reserva == null){
            mensaje = 2;
        }
        return mensaje;
    }

    /**
     * Metodo que permite buscar una reserva
     * @param codReserva de la reserva
     * @return
     */
    public Reserva buscarReserva(int codReserva){
        Reserva encontrar = null;
        for(int i = 0; i<listHotelReservas.size(); i++){
            Reserva reserva = listHotelReservas.get(i);
            if(reserva.getCodReserva()==codReserva){
                encontrar = reserva;
                break;
            }
        }
        return encontrar;
    }

    /**
     * Metodo que me permite registrar mas de una habitacion a una reserva
     * @param codReserva de la reserva
     * @param numHabtacion de la reserva
     * @return
     */
    public String adicionarHabitacionReserva(int codReserva, int numHabtacion){
        Reserva reserva = buscarReserva(codReserva);
        if (reserva == null) {
            return "La reserva con el codigo: " + codReserva + " no existe";
        }
        Habitacion habi = buscarHabitacion(numHabtacion);
        if (habi == null){
            return "La habitacion "+numHabtacion+" esta disponible";
        }
        if (habi.getEstado().equalsIgnoreCase("Disponible")) {
            reserva.getListReservaHabitaciones().add(habi);
            habi.setEstado("Reservado");
            double nuevoTotal = reserva.getValorTotal() + habi.getPrecioNoche();
            reserva.setValorTotal(nuevoTotal);
            return "La habitacion " + numHabtacion + " ha sido agregada con exito a la reserva";
        }else{
            return "La habitacion "+numHabtacion+" no esta disponible";
        }
    }

  /**
     * Metodo que permite registrar un servicio adicional
     * @param codigo del servicio
     * @param nombre del servicio
     * @param descripcion del servicio
     * @param precio del servicio
     * @param disponibilidad del servicio
     * @return
     */
    public boolean registrarServicio(int codigo, String nombre, String descripcion, double precio, String disponibilidad){
        boolean existe = false;
        Servicio servicio = buscarServicio(codigo);
        if(servicio==null){
            Servicio servi = new Servicio(codigo, nombre, descripcion, precio, disponibilidad);
            listHotelServicios.add(servi);
        }
        return existe;
    }

    /**
     * Metodo para buscar un servicio
     * @param codigo del servicio
     * @return
     */
    public Servicio buscarServicio(int codigo){
        Servicio encontrar = null;
        for(int i = 0; i<listHotelServicios.size(); i++){
            Servicio servicio = listHotelServicios.get(i);
            if(servicio.getCodigo()==codigo){
                encontrar = servicio;
                break;
            }
        }
        return encontrar;
    }

    /**
     * Metodo que me permite conocer el valor total de una reserva
     * @param codReserva de la reserva
     * @param cantidadNoches de la reserva
     * @return
     */
    public double calcularValorTotalReserva(int codReserva, int cantidadNoches){
        Reserva reserva = buscarReserva(codReserva);
        if (reserva == null){
            return 0.0;
        }
        double sumarPrecioHabitaciones = 0.0;
        for(int i = 0; i<reserva.getListReservaHabitaciones().size(); i++){
            Habitacion had= reserva.getListReservaHabitaciones().get(i);
            sumarPrecioHabitaciones += had.getPrecioNoche();
        }
        double totalHabitaciones = sumarPrecioHabitaciones * cantidadNoches;
        double sumaPrecioServicios = 0.0;
        for(int i = 0; i<reserva.getListReservaServicios().size(); i++){
            Servicio servicio = reserva.getListReservaServicios().get(i);
            sumaPrecioServicios += servicio.getPrecio();
        }
        double subtotal = totalHabitaciones + sumaPrecioServicios;
        double descuento = 0.0;
        Huesped huesped = reserva.getHuesped();
        if (huesped != null){
            if ( huesped.getFrecuente().equalsIgnoreCase("SI")){
                descuento = subtotal * 0.10;
            }
        }
        double valorTotal = subtotal - descuento;
        reserva.setValorTotal(valorTotal);
        return valorTotal;
    }

    /**
     * Metodo que permite detenrminar si un numero es perfecto
     * @param numero numero
     * @return
     */
    public boolean esNumeroPerfecto(int numero){
        if (numero<=0){
            return false;
        }
        int sumaDivisores= 0;
        for(int i = 1; i<numero; i++){
            if (numero% i == 0){
                sumaDivisores += i;
            }
        }
        return sumaDivisores==numero;
    }

  /**
     * Metodo que me perimite determinar si el numero de teledono de un huesped es perfecto
     * @param telefono del huesped
     * @return
     */
    public String consultarHuespedTelefonoPerfecto(int telefono){
        String mensaje = "";
        Huesped huespedEncontrado = null;
        for(int i = 0; i<listHotelHuespedes.size(); i++){
            Huesped hues= listHotelHuespedes.get(i);
            if (hues.getTelefono() == telefono){
                huespedEncontrado = hues;
                break;
            }
        }
        if (huespedEncontrado == null){
            mensaje = "No se encontro ningun huesped con el telefono: "+telefono;
        }
        boolean esPerfecto = esNumeroPerfecto(huespedEncontrado.getTelefono());
        if (esPerfecto){
            mensaje = "EL huesped "+huespedEncontrado.getNombreCompleto()+" fue encontrado. \n"+"Su numero de telefono ("+telefono+") Si es un numero perfecto";
        }else{
            mensaje = "EL huesped "+huespedEncontrado.getNombreCompleto()+" fue encontrado. \n"+"Su numero de telefono ("+telefono+") No es un numero perfecto";
        }
        return mensaje;
    }

    /**
     * Metodod que me ermite saber el total de ingresos de las reservas en una fecha deternminada
     * @param fechaBusqueda de las reservas
     * @return
     */
    public double calcularIngresosFechaRealizacion(String fechaBusqueda){
        double totalIngresos = 0.0;
        for( int i = 0; i<listHotelReservas.size(); i++){
            Reserva reser= listHotelReservas.get(i);
            if( reser.getFechaRealizacion() != null && reser.getFechaRealizacion().equalsIgnoreCase(fechaBusqueda)){
                totalIngresos += reser.getValorTotal();
            }
        }
        return totalIngresos;
    }

  public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public int getRegistroHuespedes() {
        return registroHuespedes;
    }

    public void setRegistroHuespedes(int registroHuespedes) {
        this.registroHuespedes = registroHuespedes;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public int getReservas() {
        return reservas;
    }

    public void setReservas(int reservas) {
        this.reservas = reservas;
    }

    public int getServiciosAdicionales() {
        return serviciosAdicionales;
    }

    public void setServiciosAdicionales(int serviciosAdicionales) {
        this.serviciosAdicionales = serviciosAdicionales;
    }

    public List<Huesped> getListHotelHuespedes() {
        return listHotelHuespedes;
    }

    public void setListHotelHuespedes(List<Huesped> listHotelHuespedes) {
        this.listHotelHuespedes = listHotelHuespedes;
    }

    public List<Reserva> getListHotelreservas() {
        return listHotelReservas;
    }

    public void setListHotelreservas(List<Reserva> listHotelreservas) {
        this.listHotelReservas = listHotelreservas;
    }

    public List<Servicio> getListHotelServicios() {
        return listHotelServicios;
    }

    public void setListHotelServicios(List<Servicio> listHotelServicios) {
        this.listHotelServicios = listHotelServicios;
    }

    public List<Habitacion> getListHotelHabitaciones() {
        return listHotelHabitaciones;
    }

    public void setListHotelHabitaciones(List<Habitacion> listHotelHabitaciones) {
        this.listHotelHabitaciones = listHotelHabitaciones;
    }

  @Override
    public String toString() {
        return "Hotel{" +
                "nombreComercial='" + nombreComercial + '\'' +
                ", nit=" + nit +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                ", paginaWeb='" + paginaWeb + '\'' +
                ", registroHuespedes=" + registroHuespedes +
                ", numHabitaciones=" + numHabitaciones +
                ", reservas=" + reservas +
                ", serviciosAdicionales=" + serviciosAdicionales +
                ", listHotelHuespedes=" + listHotelHuespedes +
                ", listHotelReservas=" + listHotelReservas +
                ", listHotelServicios=" + listHotelServicios +
                ", listHotelHabitaciones=" + listHotelHabitaciones +
                '}';
    }
}
