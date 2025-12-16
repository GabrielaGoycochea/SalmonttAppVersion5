package com.Salmontt.App.Version5.Model;

/**
 * La clase PlantaDeProcesamiento es "Hija" de la SuperClase CentrosOperativos
 * Trae asi los datos ingresados desde esa clase para la información de nombre, ubicación, cantidad de peces, capacidad de centros.
 * Se agrega el tipo de procesamiento que se hace al producto.
 */

public class PlantaDeProcesamiento extends CentrosOperativos {

    private final String atributo;//SOBRECARGA

    public PlantaDeProcesamiento(String nombreCentros ,String ubicacionCentros,String atributo, double cantidadActualCentro, double cantidadPermitidaCentro){
        super(nombreCentros,ubicacionCentros, cantidadActualCentro,cantidadPermitidaCentro);
        this.atributo=atributo;
    }

    public String getAtributo(){return atributo;}


    //SE DEFINE DIRECTAMENTE EL TIPO
    @Override
    public String getTipos(){return "Planta de Procesamiento de Alimentos";}


    /**
     * El Override trae la información de la herencia que entrega la clase padre y el
     * @return trae el metodo caracteristico de cada subclase.
     */

    @Override
    public String mostrarInformacionEspecifica(){return "\nTipo de Proceso: "+atributo;
    }

    @Override
    public String mostrarResumen() {
        return this.toString();
    }
}
