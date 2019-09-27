/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appviajes;

import java.util.Date;

/**
 *
 * @author INGESIS
 */
public class ViajeTodoIncluido extends Viaje {

    ViajeTodoIncluido(String origen, String destino, int costo, Date salida, Date llegada) {
        
        this.origen=origen;
        this.destino=destino;
        this.costo=costo;
        this.fechaSalida=salida;
        this.fechaLlegada=llegada;
            }

    
 // Constructores
 @Override
 public String descripcion() {
 return "Disfruta tu viaje todo incluido";
 }
 //No se sobreescribe cualquierMetodo2()
}
