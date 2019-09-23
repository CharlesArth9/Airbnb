package com.choucair.formacion.steps;

import au.com.bytecode.opencsv.CSVReader;
import com.choucair.formacion.pageobjects.AirbnbPage;
import net.thucydides.core.annotations.Step;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AirbnbSteps {
    AirbnbPage airbnbPage;
    @Step

    public void reservas(int id) throws IOException {
        airbnbPage.open();

        String CSV_file = "src/test/resources/Datadriven/data.csv";
        FileReader filereader = new FileReader(CSV_file);
        CSVReader reader;
        reader = new CSVReader(filereader);
        String[] cell = reader.readNext();
        while ((cell = reader.readNext()) != null) {
            if (id == Integer.parseInt(cell[0])) {
                airbnbPage.donde(cell[1]);
                airbnbPage.llegada(cell[2],cell[3]);
               // airbnbPage.huespedes(cell[4],cell[5],cell[6]);
            }
        }
        reader.close();
    }
}
