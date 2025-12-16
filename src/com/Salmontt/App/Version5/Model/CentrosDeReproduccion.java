package com.Salmontt.App.Version5.Model;

/**
 * La clase CentrosDeReproducción es "Hija" de la SuperClase UnidadesOperativas
 * Trae asi los datos ingresados desde esa clase para la información de nombre, ubicación, tipo de pez en crecimiento, capacidad de centro
 * Se agrega la especie o tipo de pez en reproducción
 */


public class CentrosDeReproduccion extends CentrosOperativos {

    private final String atributo;//SOBRECARGA

    public CentrosDeReproduccion(String nombreCentros, String ubicacionCentros,  String atributo, double cantidadActualCentro, double cantidadPermitidaCentro) {
        super(nombreCentros, ubicacionCentros, cantidadActualCentro, cantidadPermitidaCentro);
        this.atributo = atributo;
    }
    public String getAtributo() {
        return atributo;
    }

    //SE DEFINE DIRECTAMENTE EL TIPO
    @Override
    public String getTipos(){return "Centro de Reproducción";}


    /**
     * El Override trae la información de la herencia que entrega la clase padre y el
     * @return trae el metodo caracteristico de cada subclase.
     */

    @Override
    public String mostrarInformacionEspecifica(){
        return "\nEspecie: " + atributo;
    }


    @Override
    public String mostrarResumen() {
        return this.toString();
    }


}