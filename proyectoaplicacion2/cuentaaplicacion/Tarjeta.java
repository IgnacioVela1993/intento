/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.proyectoaplicacion2.cuentaaplicacion;

/**
 *
 * @author usuario
*/
public class Tarjeta {
    private String nombre; 
    private String numero; 
    private int num_seguridad; 
    private boolean activa; 

    public Tarjeta(String nombre, String numero, int num_seguridad) {
        this.nombre = nombre;
        this.numero = numero;
        this.num_seguridad = num_seguridad;
        this.activa = false; 
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getNum_seguridad() {
        return num_seguridad;
    }

    public void setNum_seguridad(int num_seguridad) {
        this.num_seguridad = num_seguridad;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
   
    public void activarTarjeta() {
        this.activa = true; 
    }
    
    public void desactivarTarjeta(){
        this.activa = false; 
    }
    

}
