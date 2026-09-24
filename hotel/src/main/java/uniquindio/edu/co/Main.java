package uniquindio.edu.co;

import uniquindio.edu.co.model.*;

import javax.swing.JOptionPane;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("StayPlus", 159753, "2N", 3157550, "www.StayPlus.com", 850, 15000, 650, 4);
        int opcion = 0;
        while (opcion != 16){
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null , """
                Menu
                1. Registrar Huesped.
                2. Buscar Huesped.
                3. Registrar Habitacion.
                4. Buscar Habitacion.
                5. Buscar el estado de la Habitacion
                6. Registrar Reserva.
                7. Buscar Reserva.
                8. Buscar el estado de la Reserva.
                9. Agregar habitciones a una Reserva.
                10. Registrar Servicio.
                11. Buscar servicio.
                12. Saber el valor total de la Reserva.
                13. Determinar si el numero de un huesped es Perfecto.
                14. Determinar el ingresos de las reservas en una fecha determinada
                15. Motrar informacion del Hotel
                16. Salir del Programa.
                Seleccione una opcion:
                """));
            if(opcion == 1){
                String nombreCompleto = JOptionPane.showInputDialog(null, "Ingrese el nombre completo del huesped: ");
                int numIdentificacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de identificación del huesped: "));
                int telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de telefono del huesped: "));
                String correoElectronico = JOptionPane.showInputDialog(null, "Ingrese el correo del huesped: ");
                String paisProcedencia = JOptionPane.showInputDialog(null, "Ingrese el pais de procedencia del huesped: ");
                String frecuente = JOptionPane.showInputDialog(null, "Es el huesped frecuente en el hotel: (SI/NO) ");
                hotel.registrarHuesped(nombreCompleto,numIdentificacion,telefono,correoElectronico,paisProcedencia,frecuente);
                JOptionPane.showMessageDialog(null, "Huesped registrado exitosamente");
            }else if(opcion == 2){
                int numIdentificacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de identificación del huesped: "));
                Huesped huesped = hotel.buscarHuesped(numIdentificacion);
                if(huesped != null){
                    JOptionPane.showMessageDialog(null, "Huesped encontrado.\n"+huesped.toString());
                }else{
                    JOptionPane.showMessageDialog(null, "Huesped no encontrado.");
                }
            } else if (opcion == 3){
                int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de la habtacion"));
                int piso = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el piso en el que se encuentra la habitacion"));
                String tipo = JOptionPane.showInputDialog(null, "Ingrese el tipo de la habitacion: (Individual, Doble, Suit).");
                String capacidad = JOptionPane.showInputDialog(null, "Ingrese el capacidad de la habitacion: ");
                double precioNoche = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio de la habitacion: "));
                String estado = JOptionPane.showInputDialog(null, "Ingrese el estado de la habitacion: (Disponible, Reservada, Ocupada, Mantenimiento) ");
                hotel.registrarHabitacion(numero, piso, tipo,capacidad, precioNoche, estado);
                JOptionPane.showMessageDialog(null, "Habitacion registrado correctamente");
            }else if (opcion == 4){
                int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de la habitacion"));
                Habitacion habitacion  = hotel.buscarHabitacion(numero);
                if(habitacion != null){
                    JOptionPane.showMessageDialog(null, "Habitacion encontrada.\n"+habitacion.toString());
                }else{
                    JOptionPane.showMessageDialog(null, "Habitacion no encontrada.");
                }
            }else if (opcion == 5){
                int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de la habitacion"));
                hotel.determinarEstadoHabitacion(numero);
                JOptionPane.showMessageDialog(null, "El estado de la habitacion es: "+hotel.determinarEstadoHabitacion(numero)+ """
                        \n
                        1. Disponible.
                        2. Ocupada.
                        3. Reservada.
                        4. Mantenimiento.""");
            }else if (opcion == 6){
                int codReserva = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el codigo de la reservacion: "));
                String fechaRealizacion = JOptionPane.showInputDialog(null, "Ingrese el fecha de la reservacion: ");
                String fechaEntrada =  JOptionPane.showInputDialog(null, "Ingrese el fecha de entrada: ");
                String fechaSalida = JOptionPane.showInputDialog(null, "Ingrese el fecha de salida: ");
                String estado = JOptionPane.showInputDialog(null, "Ingrese el estado de la reservacion: (Pendiente, Confirmada, En curso, Finalizada, Cancelada)");
                String metodoPago = JOptionPane.showInputDialog(null, "Ingrese el metodo de pago de la reservacion: (tarjeta de crédito, transferencia bancaria, efectivo)");
                int numHabitacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de la habitacion: "));
                String tipo =  JOptionPane.showInputDialog(null, "Ingrese el tipo de la habitacion: (Individual, Doble, Suit).");
                double valorTotal = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor total: "));
                hotel.registrarReserva(codReserva,fechaRealizacion,fechaEntrada,fechaSalida,estado,metodoPago,numHabitacion,tipo,valorTotal);
                JOptionPane.showMessageDialog(null, "Reserva registrado correctamente");
            }else if (opcion == 7){
                int codReserva =  Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el codigo de la reservacion: "));
                Reserva reserva = hotel.buscarReserva(codReserva);
                if(reserva != null){
                    JOptionPane.showMessageDialog(null, "Reserva encontrada.\n"+reserva.toString());
                }else{
                    JOptionPane.showMessageDialog(null, "Reserva no encontrada.");
                }
            }else if (opcion == 8){
                int codReserva = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el codigo de la reservacion: "));
                hotel.determinarEstadoReserva(codReserva);
                JOptionPane.showMessageDialog(null, "El estado de la reservacion es: "+hotel.determinarEstadoReserva(codReserva)+ """
                        \n
                        1. ocupada.
                        2. Disponible.
                        3. Reservada.
                        4. Mantenimiento.""");
            }else if (opcion == 9){
                int cpdReserva = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el codigo de la reservacion: "));
                int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuantas habitaciones desea agregar?: "));
                for(int i = 0; i<cantidad; i++){
                    int numHab = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de la habitacion "+(i+1)+":"));
                    String resultado = hotel.adicionarHabitacionReserva(cpdReserva, numHab);
                    JOptionPane.showMessageDialog(null, resultado);
                }
            }else if (opcion == 10){
                int codigo =  Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el codigo del servicio: "));
                String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del servicio: ");
                String descripcion = JOptionPane.showInputDialog(null, "Ingrese el descripcion del servicio: ");
                double precio =  Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio del servicio: "));
                String disponibilidad = JOptionPane.showInputDialog(null, "Ingrese el disponibilidad del servicio: ");
                hotel.registrarServicio(codigo, nombre, descripcion, precio, disponibilidad);
                JOptionPane.showMessageDialog(null, "Servicio registrado correctamente");
            }else if (opcion == 11){
                int codigo =  Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el codigo del servicio: "));
                Servicio servicio = hotel.buscarServicio(codigo);
                if(servicio != null){
                    JOptionPane.showMessageDialog(null, "Servicio encontrado.\n"+servicio.toString());
                }else{
                    JOptionPane.showMessageDialog(null, "Servicio no encontrado.");
                }
            }else if (opcion == 12){
                int codReserva = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el codigo de la reservacion: "));
                int cantidadNoches = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese las noches que se quedo en la reserva: "));
                hotel.calcularValorTotalReserva(codReserva,cantidadNoches);
                JOptionPane.showMessageDialog(null, "La cantidad total de la reserva es $:"+hotel.calcularValorTotalReserva(codReserva,cantidadNoches));
            }else if (opcion == 13){
             int telefono =  Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el telefono del huesped: "));
             hotel.consultarHuespedTelefonoPerfecto(telefono);
             JOptionPane.showMessageDialog(null, hotel.consultarHuespedTelefonoPerfecto(telefono));
            }else if (opcion == 14){
                String fechaBusqueda =  JOptionPane.showInputDialog(null, "Ingrese el fecha de busqueda de las reservas: " );
                hotel.calcularIngresosFechaRealizacion(fechaBusqueda);
                JOptionPane.showMessageDialog(null, "El total de ingresos de las reservas en las fecha: "+fechaBusqueda+" es de $:"+hotel.calcularIngresosFechaRealizacion(fechaBusqueda));
            }else if (opcion == 15){
                JOptionPane.showMessageDialog(null, hotel.toString() );
            }else if (opcion == 16){
                JOptionPane.showMessageDialog(null, "Salir del Programa.");
            }
        }
    }
}
