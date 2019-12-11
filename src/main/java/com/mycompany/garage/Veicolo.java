/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.garage;

import java.util.Objects;

/**
 *
 * @author tss
 */
public class Veicolo {
    public enum TipoVeicolo {
        MOTOCICLETTA, SPIDER, BERLINA, SUV, FURGONE, AUTOCARRO
    };

    public enum Alimentazione {
        BENZINA, DIESEL, GPL, METANO, IBRIDA, ELETTRICA
    };
    private String marca;
    private String modello;
    private String targa;
    private int cilindrata;
    private TipoVeicolo tipoVeicolo;
    private Alimentazione alimentazione;

    public Veicolo(String marca, String modello, String targa, int cilindrata, TipoVeicolo tipoVeicolo, Alimentazione alimentazione) {
        this.marca = marca;
        this.modello = modello;
        this.targa = targa;
        this.cilindrata = cilindrata;
        this.tipoVeicolo = tipoVeicolo;
        this.alimentazione = alimentazione;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.marca);
        hash = 41 * hash + Objects.hashCode(this.modello);
        hash = 41 * hash + Objects.hashCode(this.targa);
        hash = 41 * hash + this.cilindrata;
        hash = 41 * hash + Objects.hashCode(this.tipoVeicolo);
        hash = 41 * hash + Objects.hashCode(this.alimentazione);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Veicolo other = (Veicolo) obj;
        if (this.cilindrata != other.cilindrata) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.modello, other.modello)) {
            return false;
        }
        if (!Objects.equals(this.targa, other.targa)) {
            return false;
        }
        if (this.tipoVeicolo != other.tipoVeicolo) {
            return false;
        }
        return this.alimentazione == other.alimentazione;
    }

    @Override
    public String toString() {
        return "Veicolo{" + "marca=" + marca + ", modello=" + modello + ", targa=" + targa + ", cilindrata=" + cilindrata + ", tipoVeicolo=" + tipoVeicolo + ", alimentazione=" + alimentazione + '}';
    }

}
