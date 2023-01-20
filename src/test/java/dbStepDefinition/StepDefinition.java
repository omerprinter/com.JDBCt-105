package dbStepDefinition;

import io.cucumber.java.en.Given;
import org.junit.Assert;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static utilities.DBUtils1.*;

public class StepDefinition {

    List<Object> staffTablosundakiIdler =new ArrayList<>();


    @Given("Database baglantisi kurulur.")
    public void database_baglantisi_kurulur() {
        createConnection();

    }
    @Given("Staff tablosundaki {string} leri listeler.")
    public void staff_tablosundaki_leri_listeler(String Id) {
    staffTablosundakiIdler= getColumnData("SELECT * FROM u480337000_tlb_training.staff",Id);
        System.out.println(staffTablosundakiIdler);

    }
    @Given("verilen {string} dogrulanir.")
    public void verilen_dogrulanir(String id) {
        assertTrue(staffTablosundakiIdler.toString().contains(id));


    }
    @Given("Database baglantisi kapatilir.")
    public void database_baglantisi_kapatilir() {
        closeConnection();

    }
}
