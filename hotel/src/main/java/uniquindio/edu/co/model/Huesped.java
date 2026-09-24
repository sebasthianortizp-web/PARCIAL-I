package uniquindio.edu.co.model;

public class Huesped {.
  //Atributos de la clase huesped
  private String nombreCompleto;
  private int numIdentificacion;
  private int telefono;
  private String correoElectronico;
  private String paisProcedencia;
  private String frecuente;
  //Relaciones de la clase Huespeted
  private Reserva reserva;

  /**
  * Metodo constructor de la clase Huesped
  * @param nombreCompleto del huesped
  * @param numIdentificacion del huesped
  * @param telefono del huesped
  * @param correoElectronico del huesped
  * @param paisProcedencia del huesped
  * @param frecuente del huesped
  */
   public Huesped(String  nombreCompleto, int numIdentificacion, int telefono, String correoElectronico, String paisProcedencia, String frecuente) {
      this.nombreCompleto = nombreCompleto;
      this.numIdentificacion = numIdentificacion;
      this.telefono = telefono;
      this.correoElectronico = correoElectronico;
      this.paisProcedencia = paisProcedencia;
      this.frecuente = frecuente;
    }

  public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getNumIdentificacion() {
        return numIdentificacion;
    }

    public void setNumIdentificacion(int numIdentificacion) {
        this.numIdentificacion = numIdentificacion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getPaisProcedencia() {
        return paisProcedencia;
    }

    public void setPaisProcedencia(String paisProcedencia) {
        this.paisProcedencia = paisProcedencia;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public String getFrecuente() {
        return frecuente;
    }

    public void setFrecuente(String frecuente) {
        this.frecuente = frecuente;
    }

  @Override
    public String toString() {
        return "Huesped{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", numIdentificacion=" + numIdentificacion +
                ", telefono=" + telefono +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", paisProcedencia='" + paisProcedencia + '\'' +
                ", frecuente='" + frecuente + '\'' +
                ", reserva=" + reserva +
                '}';
    }
}
