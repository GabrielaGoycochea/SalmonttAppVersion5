package com.Salmontt.App.Version5.Model;

/**
 * La clase CentrosDeCrecimiento es "Hija" de la SuperClase UnidadesOperativas
 * Trae asi los datos ingresados desde esa clase para la información de nombre, ubicación, cantidad de peces, capacidad de centros.
 * Se agrega la especie o tipo de pez en crecimiento
 */

public class CentrosDeCrecimiento extends CentrosOperativos {

    private final String atributo;//SOBRECARGA

    public CentrosDeCrecimiento(String nombreCentros, String ubicacionCentros, String atributo, double cantidadActualCentro, double cantidadPermitidaCentro) {
        super(nombreCentros, ubicacionCentros, cantidadActualCentro, cantidadPermitidaCentro);
        this.atributo = atributo;
    }

    public String getAtributo() {
        return atributo;
    }

    //SE DEFINE DIRECTAMENTE EL TIPO
    @Override
    public String getTipos() {
        return "Estanque de Crecimiento";
    }

    /**
     * El Override trae la información de la herencia que entrega la clase padre y el
     *
     * @return trae el metodo caracteristico de cada subclase.
     */
    @Override
    public String mostrarInformacionEspecifica() {
        return "\nEspecie: " + atributo;
    }


    @Override
    public String mostrarResumen() {
        return this.toString();
    }
}