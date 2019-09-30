package com.choucair.formacion.steps;

import au.com.bytecode.opencsv.CSVReader;
import com.choucair.formacion.pageobjects.AirbnbPage;
import net.thucydides.core.annotations.Step;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

public class AirbnbSteps {
    AirbnbPage airbnbPage;
    private static String[] datos;

    public static void leerCSV(String casoPrueba){
        CSVReader reader;
        try {
            reader = new CSVReader(new FileReader("src/test/resources/Datadriven/data.csv"));
            String[] fila;
            while ((fila = reader.readNext())!=null){
                Logger.getLogger(fila[0]);
                if (casoPrueba.equals(fila[0].trim())){
                   datos = fila;
                }
            }reader.close();
        } catch (IOException e){
            Logger.getLogger(""+e);
        }
    }

    @Step
    public void lectura(String idCaso) {
        leerCSV(idCaso);    }

    public void reservas(String id) throws IOException {
        airbnbPage.open();
        airbnbPage.donde(datos[1]);
        airbnbPage.fechas(datos[2],datos[3]);
        airbnbPage.huespedes(datos[4],datos[5],datos[6]);
    }

    public void escojer(String id) {
        airbnbPage.departamento(datos[7]);
    }
}