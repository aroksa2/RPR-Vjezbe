package com.example.kalkulator;

import javafx.fxml.FXML;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {
    boolean plus = false;
    boolean minus = false;
    boolean puta = false;
    boolean podijeljeno = false;
    boolean postotak = false;

    double prviBroj, drugiBroj, rezBroj;
    String rezBrojString;

    public Button jedan;
    public Button dva;
    public Button tri;
    public Button cetiri;
    public Button pet;
    public Button sest;
    public Button sedam;
    public Button osam;
    public Button devet;
    public Button posto;
    public Button dijeli;
    public Button mnozi;
    public Button nula;
    public Button decimalni;
    public Button jednako;
    public Button btnPlus;
    public Button btnMinus;
    public Label labelaDisplay;

    private String prvi = "";
    private String drugi = "";
    public SimpleStringProperty rezultat;
    public String getRezultat() {
        return rezultat.get();
    }

    public SimpleStringProperty rezultatProperty() {
        return rezultat;
    }

    public void setRezultat(String rezultat) {
        this.rezultat.set(rezultat);
    }
    public HelloController(){
        rezultat = new SimpleStringProperty("0");
    }

    void odabraniBroj(int broj){
        if(rezultat.get().equals("0") && rezultat.get().length() == 1){
            if(broj == 0) rezultat.set(nula.getText());
            else if(broj == 1) rezultat.set(jedan.getText());
            else if(broj == 2) rezultat.set(dva.getText());
            else if(broj == 3) rezultat.set(tri.getText());
            else if(broj == 4) rezultat.set(cetiri.getText());
            else if(broj == 5) rezultat.set(pet.getText());
            else if(broj == 6) rezultat.set(sest.getText());
            else if(broj == 7) rezultat.set(sedam.getText());
            else if(broj == 8) rezultat.set(osam.getText());
            else if(broj == 9) rezultat.set(devet.getText());
        }
        else{
            if(broj == 0) rezultat.set(rezultat.get() + nula.getText());
            else if(broj == 1) rezultat.set(rezultat.get() + jedan.getText());
            else if(broj == 2) rezultat.set(rezultat.get() + dva.getText());
            else if(broj == 3) rezultat.set(rezultat.get() + tri.getText());
            else if(broj == 4) rezultat.set(rezultat.get() + cetiri.getText());
            else if(broj == 5) rezultat.set(rezultat.get() + pet.getText());
            else if(broj == 6) rezultat.set(rezultat.get() + sest.getText());
            else if(broj == 7) rezultat.set(rezultat.get() + sedam.getText());
            else if(broj == 8) rezultat.set(rezultat.get() + osam.getText());
            else if(broj == 9) rezultat.set(rezultat.get() + devet.getText());
        }

    }
    public void jedanClick(ActionEvent actionEvent) {
        odabraniBroj(1);
    }
    public void dvaClick(ActionEvent actionEvent) {
        odabraniBroj(2);
    }
    public void triClick(ActionEvent actionEvent) {
        odabraniBroj(3);
    }
    public void cetiriClick(ActionEvent actionEvent) {
        odabraniBroj(4);
    }
    public void petClick(ActionEvent actionEvent) {
        odabraniBroj(5);
    }
    public void sestClick(ActionEvent actionEvent) {
        odabraniBroj(6);
    }

    public void sedamClick(ActionEvent actionEvent) {
        odabraniBroj(7);
    }

    public void osamClick(ActionEvent actionEvent) {
        odabraniBroj(8);
    }

    public void devetClick(ActionEvent actionEvent) {
        odabraniBroj(9);
    }

    public void postoClick(ActionEvent actionEvent) {
        postotak = true;
    }

    public void nulaClick(ActionEvent actionEvent) {
        odabraniBroj(0);
    }

    public void decimalniClick(ActionEvent actionEvent) {
        rezultat.set(rezultat.get() + ".");
    }

    public void jednakoClick(ActionEvent actionEvent) {
        drugi = rezultat.get();

        prviBroj =  Double.parseDouble(prvi);
        drugiBroj = Double.parseDouble(drugi);

        if(postotak)
        {
            drugiBroj = prviBroj * (drugiBroj/100);
            postotak = false;
        }

        if(plus){
            rezBroj = prviBroj + drugiBroj;
            plus = false;
        }

        if(minus){
            rezBroj = prviBroj - drugiBroj;
            minus = false;
        }

        if(puta){
            rezBroj = prviBroj * drugiBroj;
            puta = false;
        }

        if(podijeljeno){
            if(drugiBroj != 0){
                rezBroj = prviBroj / drugiBroj;
                podijeljeno = false;
            }
            else {
                System.out.println("Error");
            }
        }
        rezBrojString = Double.toString(rezBroj);
        rezultat.set(rezBrojString);
    }
    public void plusClick(ActionEvent actionEvent) {
        prvi = rezultat.get();
        rezultat.set("");
        plus = true;
    }

    public void minusClick(ActionEvent actionEvent) {
        prvi = rezultat.get();
        rezultat.set("");
        minus = true;
    }

    public void podijeljenoClick(ActionEvent actionEvent) {
        prvi = rezultat.get();
        rezultat.set("");
        podijeljeno = true;
    }

    public void mnoziClick(ActionEvent actionEvent) {
        prvi = rezultat.get();
        rezultat.set("");
        puta = true;
    }
}