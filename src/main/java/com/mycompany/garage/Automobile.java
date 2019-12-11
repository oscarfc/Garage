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
public class Automobile extends Veicolo {

    private int numPorte;

    public Automobile(int numPorte, String marca, String modello, String targa, int cilindrata, TipoVeicolo tipoVeicolo, Alimentazione alimentazione) {
        super(marca, modello, targa, cilindrata, tipoVeicolo, alimentazione);
        this.numPorte = numPorte;
    }

    @Override
    public String toString() {
        return "Automobile{" + "numPorte=" + numPorte + super.toString() + '}';
    }

}
