/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.garage;

/**
 *
 * @author tss
 */
public class Furgone extends Veicolo {
    private int capacitaCM3;

    public Furgone(int capacitaCM3, String marca, String modello, String targa, int cilindrata, Alimentazione alimentazione) {
        super(marca, modello, targa, cilindrata, TipoVeicolo.FURGONE, alimentazione);
        this.capacitaCM3 = capacitaCM3;
    }

    @Override
    public String toString() {
        return "Furgone{" + "capacitaCM3=" + capacitaCM3 + super.toString() + '}';
    }
    
}
