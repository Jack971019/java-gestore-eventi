package org.lessons.Eventi;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("inserire titolo dell'evento");
        String titolo = scan.nextLine();
        System.out.println("inserrie la data dell'evento: yyyy-MM-dd");
        LocalDate data = LocalDate.parse(scan.nextLine());
        System.out.println("inserire numeri posti disponibili per l'evento");
        int numeroPostiTotale = Integer.parseInt(scan.nextLine());
        System.out.println("inserire il numero di posti già prenotati");
        int numeroPostiPrenotati = Integer.parseInt(scan.nextLine());

        Evento evento = new Evento(titolo, data, numeroPostiTotale, numeroPostiPrenotati);

        try {
            System.out.println(evento);
            System.out.println(numeroPostiTotale);
            System.out.println(numeroPostiPrenotati);
        } catch (RuntimeException e) {
            System.out.println("inserire dei dati validi");
        }

        System.out.println("vuoi fare una nuova prenotazione? Y/N");
        String userChoice = scan.nextLine();
        if (userChoice.equalsIgnoreCase("Y")){
            try {
                System.out.println("quanti posti vuoi prenotare?");
                int userPrenotazione = Integer.parseInt(scan.nextLine());
                evento.aggiungiPrenotazioni(userPrenotazione);
            } catch (RuntimeException e) {
                System.out.println("Inserire dei dati validi");
            }

        } else if (userChoice.equalsIgnoreCase("N")) {
            System.out.println("Grazie Arrivederci");

        }

        System.out.println("posti prenotati" + evento.getNumeroPostiPrenotati());
        System.out.println("posti ancora disponibili: " + (numeroPostiTotale - numeroPostiPrenotati - evento.getNumeroPostiPrenotati()));


    }
}
