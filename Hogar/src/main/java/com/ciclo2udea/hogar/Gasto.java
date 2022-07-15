package com.ciclo2udea.hogar;

public class Gasto {
    private String nombreMiembro;
    private double totalGasto;
    private String fechaGasto;

    public Gasto(String nombreMiembro, double totalGasto, String fechaGasto) {
        this.nombreMiembro = nombreMiembro;
        this.totalGasto = totalGasto;
        this.fechaGasto = fechaGasto;
    }

    public String getNombreMiembro() {
        return nombreMiembro;
    }

    public void setNombreMiembro(String nombreMiembro) {
        this.nombreMiembro = nombreMiembro;
    }

    public double getTotalGasto() {
        return totalGasto;
    }

    public void setTotalGasto(double totalGasto) {
        this.totalGasto = totalGasto;
    }

    public String getFechaGasto() {
        return fechaGasto;
    }

    public void setFechaGasto(String fechaGasto) {
        this.fechaGasto = fechaGasto;
    }
}
