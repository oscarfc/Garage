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
public class Motocicletta extends Veicolo {
    private int tempiMotore;

    public Motocicletta(String marca, String modello, String targa, int cilindrata, Alimentazione alimentazione, int tempiMotore) {
        super(marca, modello, targa, cilindrata, TipoVeicolo.MOTOCICLETTA, alimentazione);
        this.tempiMotore = tempiMotore;
    }

    @Override
    public String toString() {
        return "Motocicletta{" + "tempiMotore=" + tempiMotore + super.toString() + '}';
    }
    
}
