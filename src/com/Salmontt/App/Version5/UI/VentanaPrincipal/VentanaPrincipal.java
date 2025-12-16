package com.Salmontt.App.Version5.UI.VentanaPrincipal;

import com.Salmontt.App.Version5.Data.Gestor;
import com.Salmontt.App.Version5.Model.*;
import com.Salmontt.App.Version5.Model.*;
import com.Salmontt.App.Version5.Model.*;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {

    private JTextField txtNombre, txtUbicacion, txtAtributo, txtCantidadActual, txtCantidadPermitida;
    private JComboBox<String> cbTipoCentro;
    private JTextArea txtArea;
    private JButton botonIngresar;
    private Gestor gestor;


    //private List<CentrosOperativos> centrosOperativos;

    public VentanaPrincipal(/*List<CentrosOperativos>centrosOperativos*/) {
        //this.centrosOperativos=centrosOperativos;

        gestor = new Gestor();

        //TITULO
        setTitle("Sistema de Gestión Centros Operativos");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        initComponentes();
    }

    private void initComponentes() {

        JLabel lblTipo = new JLabel("Tipo Centro");
        lblTipo.setBounds(230, 20, 80, 25);
        add(lblTipo);

        JLabel lblNombre = new JLabel("Nombre");
        lblNombre.setBounds(20, 20, 80, 25);
        add(lblNombre);

        JLabel lblUbicacion = new JLabel("Ubicación");
        lblUbicacion.setBounds(20, 60, 80, 25);
        add(lblUbicacion);

        JLabel lblAtributo = new JLabel("Atributo");
        lblAtributo.setBounds(20, 100, 80, 25);
        add(lblAtributo);

        JLabel lblCantidadActual = new JLabel("Cantidad Actual");
        lblCantidadActual.setBounds(230, 60, 120, 25);
        add(lblCantidadActual);

        JLabel lblCantidadPermitida = new JLabel("Cantidad Permitida");
        lblCantidadPermitida.setBounds(230, 100, 120, 25);
        add(lblCantidadPermitida);

        //COMBOBOX TIPO "cb"
        String[] tiposCentros = {"Reproducción", "Crecimiento", "Procesamiento", "Producción"};
        cbTipoCentro = new JComboBox<>(tiposCentros);
        cbTipoCentro.setBounds(310, 20, 120, 25);
        add(cbTipoCentro);

        //CAMPOS DE TEXTO
        txtNombre = new JTextField();
        txtNombre.setBounds(80, 20, 120, 25);
        add(txtNombre);

        txtUbicacion = new JTextField();
        txtUbicacion.setBounds(80, 60, 120, 25);
        add(txtUbicacion);

        txtAtributo = new JTextField();
        txtAtributo.setBounds(80, 100, 120, 25);
        add(txtAtributo);

        //CANTIDADES
        txtCantidadActual = new JTextField();
        txtCantidadActual.setBounds(345, 60, 120, 25);
        add(txtCantidadActual);

        txtCantidadPermitida = new JTextField();
        txtCantidadPermitida.setBounds(345, 100, 120, 25);
        add(txtCantidadPermitida);

        // BOTON PARA INGRESAR DATOS
        botonIngresar = new JButton("Ingresar Centro");
        botonIngresar.setBounds(20, 150, 440, 30);
        add(botonIngresar);

        //AREA PARA MOSTRAR INFORMACIÓN
        txtArea = new JTextArea();
        txtArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(txtArea);
        scrollPane.setBounds(20, 200, 440, 230);
        add(scrollPane);

        //ACCION
        botonIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarCentro();
            }
        });
    }

    private void guardarCentro() {

        try {
            String nombre = txtNombre.getText();
            String ubicacion = txtUbicacion.getText();
            String atributo = txtAtributo.getText();
            double cantidadActual = Double.parseDouble(txtCantidadActual.getText());
            double cantidadPermitida = Double.parseDouble(txtCantidadPermitida.getText());
            String tipoCentro = (String) cbTipoCentro.getSelectedItem();


            //CREAR EL CENTRO SEGUN EL TIPO
            Registrable centroOperativo = null;

            switch (tipoCentro) {

                case "Reproducción":
                    centroOperativo = new CentrosDeReproduccion(nombre, ubicacion, atributo, cantidadActual, cantidadPermitida);
                    break;

                case "Crecimiento":
                    centroOperativo = new CentrosDeCrecimiento(nombre, ubicacion, atributo, cantidadActual, cantidadPermitida);
                    break;

                case "Procesamiento":
                    centroOperativo = new PlantaDeProcesamiento(nombre, ubicacion, atributo, cantidadActual, cantidadPermitida);
                    break;

                case "Producción":
                    centroOperativo = new PlantaProduccionAlimentos(nombre, ubicacion, atributo, cantidadActual, cantidadPermitida);
                    break;
            }

            //AGREGAR EL CENTRO EN LA LISTA

            if (centroOperativo != null) {
                gestor.agregarCentro(centroOperativo);
            }

            //SET PARA "LIMPIAR EL DATO ANTERIOR"
            txtNombre.setText("");
            txtUbicacion.setText("");
            txtAtributo.setText("");
            txtCantidadActual.setText("");
            txtCantidadPermitida.setText("");


            actualizar();

            JOptionPane.showMessageDialog(this, "Centro Operativo ingresado de manera correcta.");
        } catch (NumberFormatException exception) {
            JOptionPane.showMessageDialog(this, "Por favor ingresar información valida en los campos CANTIDAD", "error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void actualizar() {
        txtArea.setText("..::CENTROS OPERATIVOS::..\n" + gestor.mostrarCentros());
    }

    public void datosPrueba(Gestor gestorPruebas){
        this.gestor = gestorPruebas;
        actualizar();
    }


}



