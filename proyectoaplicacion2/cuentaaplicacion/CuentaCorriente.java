/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.proyectoaplicacion2.cuentaaplicacion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nachovelagomez
 */
public class CuentaCorriente {
    
    private Cliente cliente;
    private double saldo; 
    private double limiteRojos;
    private List<Tarjeta> tarjetas;

    public CuentaCorriente(Cliente cliente) {
        this.cliente = cliente; 
        this.saldo = 0; 
        this.limiteRojos = -50; 
        this.tarjetas = new ArrayList<Tarjeta>();
    }

    public CuentaCorriente(double saldo) {
        this.saldo = saldo;
        this.limiteRojos = 0;
    }

    public CuentaCorriente(Cliente cliente,double saldo, double limiteRojos) {
        this.saldo = saldo;
        this.cliente = cliente; 
        this.limiteRojos = limiteRojos;
    }
    
   
    public boolean sacarDinero(int dineroaretirar){
        if (this.saldo - dineroaretirar > this.limiteRojos){
            this.saldo = this.saldo - dineroaretirar; 
            return true; 
        }
        return false; 
    }
    
    public void ingresarDinero(int dineroaingresar){
        this.saldo = this.saldo + dineroaingresar; 
    }
    
    public boolean nuevaTarjeta(){
        if (this.saldo >= 0 ){
            Tarjeta tarjeta = new Tarjeta(this.cliente.getNombre(), "2847", 7362);
            this.tarjetas.add(tarjeta);
            return true; 
        }
        return false;
        
    }
}


}
