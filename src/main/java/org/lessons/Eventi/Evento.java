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
            throw new RuntimeException();
        }
        this.data = data;
        if(numeroPostiTotale < 0){
            throw new RuntimeException();
        }
        this.numeroPostiTotale = numeroPostiTotale;
        this.numeroPostiPrenotati = 0;
    }

    // GETTER AND SETTER


    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getData() {
        if (data.isBefore(LocalDate.now())){
            throw new RuntimeException();
        }
        return data;
    }

    public void setData(LocalDate data) {
        if (data.isBefore(LocalDate.now())){
            throw new RuntimeException();
        }
        this.data = data;
    }

    public void setNumeroPostiTotale(int numeroPostiTotale) {
        if(numeroPostiTotale < 0){
            throw new RuntimeException();
        }
        this.numeroPostiTotale = numeroPostiTotale;
    }

    public void setNumeroPostiPrenotati(int numeroPostiPrenotati) {
        this.numeroPostiPrenotati = numeroPostiPrenotati;
    }

    // METODI


}
