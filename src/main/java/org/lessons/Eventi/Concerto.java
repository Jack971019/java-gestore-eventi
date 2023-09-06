package org.lessons.Eventi;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class Concerto extends Evento{

    // ATTRIBUTI

    private LocalTime ora;

    private BigDecimal prezzo;


    // COSTRUTTORI

    public Concerto(String titolo, LocalDate data, int numeroPostiTotale, int numeroPostiPrenotati, LocalTime ora, BigDecimal prezzo) {
        super(titolo, data, numeroPostiTotale, numeroPostiPrenotati);
        this.prezzo = prezzo;
        this.ora = ora;
    }

    // GETTER AND SETTER

    public LocalTime getOra() {
        return ora;
    }

    public void setOra(LocalTime ora) {
        this.ora = ora;
    }

    public BigDecimal getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }


    // METODI


    @Override
    public String toString() {
        return super.toString() +
                "ora=" + ora +
                ", prezzo=" + prezzo + "€";
    }


}
