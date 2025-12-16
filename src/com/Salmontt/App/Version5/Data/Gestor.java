package com.Salmontt.App.Version5.Data;

import com.Salmontt.App.Version5.Model.*;
import com.Salmontt.App.Version5.Model.*;
import com.Salmontt.App.Version5.Model.*;

import java.util.ArrayList;

public class Gestor {

    private ArrayList <Registrable> listaCentros;

    public Gestor(){
        listaCentros= new ArrayList<>();}

    //AGREGAR CENTROS A LA LISTA
    public void agregarCentro(Registrable Centros){
        listaCentros.add(Centros);
    }
    //Mostrar los centros
    public String mostrarCentros(){
        StringBuilder sb = new StringBuilder();

        for(Registrable Centros : listaCentros){
            sb.append(Centros.mostrarResumen()).append("\n");
        }
    return sb.toString();
    }


    //SE "PROCESA" EL DATO INGRESADO SEGUN EL TIPO SELECCIONADA.

    public void procesarCentros(){
        for (Registrable Centros : listaCentros){
            if(Centros instanceof CentrosDeCrecimiento){
                System.out.println("ProcesandoCentro de Crecimiento: "+ Centros.mostrarResumen());

            } else if(Centros instanceof CentrosDeReproduccion){
                System.out.println("ProcesandoCentro de Reproducción: "+Centros.mostrarResumen());

            } else if (Centros instanceof PlantaDeProcesamiento){
                System.out.println("Procesando Planta de Procesamiento: "+Centros.mostrarResumen());

            } else if (Centros instanceof PlantaProduccionAlimentos){
                System.out.println("Procesando Planta de Producción de alimentos: "+Centros.mostrarResumen());
            }
        }
    }



}
