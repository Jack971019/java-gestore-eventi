package org.lessons.Eventi;

import java.time.LocalDate;

public class Evento {

    private String titolo;
    private LocalDate data;
    private int numeroPostiTotale;
    private int numeroPostiPrenotati;

    // COSTRUTTORI


    public Evento(String titolo, LocalDate data, int numeroPostiTotale, int numeroPostiPrenotati) {
        this.titolo = titolo;
        if (data.isBefore(LocalDate.now())){
            throw new RuntimeException("inserire una data valida");
        }
        this.data = data;
        if(numeroPostiTotale < 0){
            throw new RuntimeException("inserire un numero valido");
        }
        this.numeroPostiTotale = numeroPostiTotale;
        this.numeroPostiPrenotati = 0;
    }

    // GETTER AND SETTER


    public String getTitolo() {
        return titolo;
    }

    public void setTitolo() {
        this.titolo = titolo;
    }

    public LocalDate getData() {
        if (data.isBefore(LocalDate.now())){
            throw new RuntimeException("inserire una data valida");
        }
        return data;
    }

    public void setData(LocalDate data) {
        if (data.isBefore(LocalDate.now())){
            throw new RuntimeException("inserire una data valida");
        }
        this.data = data;
    }

    public int getNumeroPostiTotale() {
        if(numeroPostiTotale < 0){
            throw new RuntimeException("inserire un numero valido");
        }
        this.numeroPostiTotale = numeroPostiTotale;
        return numeroPostiTotale;
    }

    public int getNumeroPostiPrenotati() {
        this.numeroPostiPrenotati = numeroPostiPrenotati;
        return numeroPostiPrenotati;
    }

    // METODI


    @Override
    public String toString() {
        return "Evento{" +
                "titolo='" + titolo + '\'' +
                ", data=" + data +
                '}';
    }

    // Aggiungere prenotazione posti

    public int aggiungiPrenotazioni(int postiDaPrenotare){
        if(data.isBefore(LocalDate.now()) || numeroPostiPrenotati >= numeroPostiTotale){
            throw new RuntimeException("inserire una data valida o un numero di posti valido");
        } else {
           numeroPostiPrenotati += postiDaPrenotare;
           numeroPostiTotale -= postiDaPrenotare;
        }

        return postiDaPrenotare;
    }

    // Disdire prenotazione posti

    public int disdiciPrenotazioni(int postiDaDisdire){
        if(data.isBefore(LocalDate.now()) || numeroPostiPrenotati <= 0){
            throw new RuntimeException("inserire una data valida o un numero di posti valido");
        } else {
            numeroPostiPrenotati -= postiDaDisdire;
            numeroPostiTotale += postiDaDisdire;
        }

        return postiDaDisdire;
    }
}
