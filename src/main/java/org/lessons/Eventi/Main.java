package org.lessons.Eventi;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Evento evento = null;

        boolean datiValidi = false;


        while (!datiValidi) {
            try {
                System.out.println("inserire titolo dell'evento");
                String titolo = scan.nextLine();
                System.out.println("inserrie la data dell'evento: yyyy-MM-dd");
                LocalDate data = LocalDate.parse(scan.nextLine());
                System.out.println("inserire numeri posti disponibili per l'evento");
                int numeroPostiTotale = Integer.parseInt(scan.nextLine());
                System.out.println("inserire il numero di posti già prenotati");
                int numeroPostiPrenotati = Integer.parseInt(scan.nextLine());


                evento = new Evento(titolo, data, numeroPostiTotale, numeroPostiPrenotati);
                System.out.println(evento);
                System.out.println(numeroPostiTotale);
                System.out.println(numeroPostiPrenotati);


                System.out.println("vuoi fare una nuova prenotazione? Y/N");

                String userChoice = scan.nextLine();
                if (userChoice.equalsIgnoreCase("Y")) {

                    System.out.println("quanti posti vuoi prenotare?");
                    int userPrenotazione = Integer.parseInt(scan.nextLine());
                    evento.aggiungiPrenotazioni(userPrenotazione);
                    System.out.println(" hai prenotato" + evento.getNumeroPostiPrenotati() + "posti");
                    System.out.println(evento);

                } else if (userChoice.equalsIgnoreCase("N")) {
                    System.out.println("Grazie Arrivederci");

                }


                System.out.println("vuoi disdire una prenotazione? Y/N");

                String userChoice1 = scan.nextLine();
                if (userChoice1.equalsIgnoreCase("Y")) {

                    System.out.println("quanti posti vuoi disdire?");
                    int userPrenotazione = Integer.parseInt(scan.nextLine());
                    evento.disdiciPrenotazioni(userPrenotazione);
                    System.out.println(" hai disdetto" + userPrenotazione + "posti");
                    System.out.println(evento);


                } else if (userChoice.equalsIgnoreCase("N")) {
                    System.out.println("Grazie Arrivederci");

                }


                System.out.println("L'evento è un concerto? Y/N");
                String userchoice = scan.nextLine();

                Concerto concerto = null;
                if (userchoice.equalsIgnoreCase("Y")) {
                    System.out.println("inserisci l'orario dell'evento");
                    LocalTime orario = LocalTime.parse(scan.nextLine());
                    System.out.println("inserisci il prezzo del biglietto");
                    BigDecimal prezzo = BigDecimal.valueOf(Long.parseLong(scan.nextLine()));
                    concerto = new Concerto(evento.getTitolo(), evento.getData(), evento.getNumeroPostiPrenotati(), evento.getNumeroPostiTotale(), orario, prezzo);

                    System.out.println(concerto);
                }

                datiValidi = true;

            } catch (RuntimeException e) {
                System.out.println("inserire dei dati validi");
            }

            System.out.println("GRAZIE ARRIVEDERCI!!!");
        }
    }
}
