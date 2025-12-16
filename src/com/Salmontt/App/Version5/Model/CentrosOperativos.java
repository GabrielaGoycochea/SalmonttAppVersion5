package com.Salmontt.App.Version5.Model;

/**
 * Se genera una superclase como CentrosOperativos.
 * Se crea con atributo en protected para que la utilicen las subclases
 * Los datos heredados corresponden a:
 * Nombre de Centros, ubicación Centros, Capacidad Actual, Capacidad Permitida.
 */

public abstract class CentrosOperativos implements Registrable {


    protected String nombreCentros;
    protected String ubicacionCentros;
    protected double cantidadActualCentro;
    protected double cantidadPermitidaCentro;

    public CentrosOperativos(String nombreCentros, String ubicacionCentros, double cantidadActualCentro, double cantidadPermitidaCentro){
        this.nombreCentros=nombreCentros;
        this.ubicacionCentros=ubicacionCentros;
        this.cantidadActualCentro=cantidadActualCentro;
        this.cantidadPermitidaCentro=cantidadPermitidaCentro;
    }

    //Booleano para capacidad
    public boolean CapacidadCentro(){return cantidadActualCentro>cantidadPermitidaCentro;}

    //NO SET NO ES MODIFICABLE
    public String getNombreCentros(){return nombreCentros;}
    public String getUbicacionCentros(){return ubicacionCentros;}
    public double getCantidadActualCentro(){return cantidadActualCentro;}
    public double getCantidadPermitidaCentro(){return cantidadPermitidaCentro;}

    /**
     * Al ser metodos abstractos indica que las subclases deben implementarlas dentro de su clase
     * Se genera un metodo abstracto que pide que cada subclase tenga un atributo específico
     * Y se genera un metodo de información heredada para mostrar en cada subclase apoyandose en el toString
     * Las subclases se utiliza la palabra "atributo" como sobrecarga.
     */
    @Override
    public String toString() {
        return "\nTipo: " + getTipos() +
                "\nNombre: " + nombreCentros +
                "\nUbicacion: " + ubicacionCentros +
                "\nCantidad Actual: " + (int) cantidadActualCentro +
                "\nCantidad Pemitida: " + (int) cantidadPermitidaCentro +
                "\nSobre Capacidad: " + (CapacidadCentro() ? "Sí" : "No")
                + mostrarInformacionEspecifica() +
                "\n--------------------------------------------";
    }

    public abstract String getTipos();
    public abstract String mostrarInformacionEspecifica();


    public void mostrarInformacionHerencia(){
        System.out.println(this.toString());
    }

    @Override
    public String mostrarResumen(){
        return this.toString() + mostrarInformacionEspecifica();
    }

}
