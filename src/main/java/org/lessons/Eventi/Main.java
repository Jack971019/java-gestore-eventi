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

        System.out.println(evento);
        System.out.println(numeroPostiTotale);
        System.out.println(numeroPostiPrenotati);

        System.out.println("vuoi fare una nuova prenotazione?");
        String userChoice = scan.nextLine();

    }
}
