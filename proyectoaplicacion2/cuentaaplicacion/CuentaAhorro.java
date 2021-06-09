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

public class Cliente {
    private String nombre; 
    private String DNI; 
    private Date fe_nacimiento; 

    public Cliente(String nombre, String DNI, Date fe_nacimiento) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fe_nacimiento = fe_nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Date getFe_nacimiento() {
        return fe_nacimiento;
    }

    public void setFe_nacimiento(Date fe_nacimiento) {
        this.fe_nacimiento = fe_nacimiento;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    
    
    
}
