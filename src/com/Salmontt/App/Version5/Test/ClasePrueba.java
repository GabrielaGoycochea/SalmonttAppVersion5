package com.Salmontt.App.Version5.Test;

import com.Salmontt.App.Version5.Data.Gestor;
import com.Salmontt.App.Version5.Model.CentrosDeCrecimiento;
import com.Salmontt.App.Version5.Model.CentrosDeReproduccion;
import com.Salmontt.App.Version5.Model.PlantaDeProcesamiento;
import com.Salmontt.App.Version5.Model.PlantaProduccionAlimentos;
import com.Salmontt.App.Version5.UI.VentanaPrincipal.VentanaPrincipal;

public class ClasePrueba {

    public static void main(String[] args) {
        Gestor gestor = new Gestor();

        gestor.agregarCentro(new CentrosDeReproduccion("Estanque de Salmones", "Acuario Coyhaique", "Huevos de Salmón", 100, 200));
        gestor.agregarCentro(new CentrosDeCrecimiento("Rio artificial", "Zona Austral", "Truchas", 400, 300));
        gestor.agregarCentro(new PlantaDeProcesamiento("Planta de Procesos de Atún", "Valparaíso", "Fileteado y limpieza de atún", 1000, 3000));
        gestor.agregarCentro(new PlantaProduccionAlimentos("Enlatados de Atún", "Valparaíso", "Atún al agua", 3000, 3000));


        //generar la ventana para reflejar la prueba.
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        ventanaPrincipal.datosPrueba(gestor);
        ventanaPrincipal.setVisible(true);
    }
}
