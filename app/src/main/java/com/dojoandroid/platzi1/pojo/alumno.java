package com.dojoandroid.platzi1.pojo;

import java.util.Date;

/**
 * Created by fabi on 16/06/2017.
 */

public class alumno {
    private  String nombre;
    private long numero_cuenta;
    private Date fechaNAcimiento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(long numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public Date getFechaNAcimiento() {
        return fechaNAcimiento;
    }

    public void setFechaNAcimiento(Date fechaNAcimiento) {
        this.fechaNAcimiento = fechaNAcimiento;
    }
}
