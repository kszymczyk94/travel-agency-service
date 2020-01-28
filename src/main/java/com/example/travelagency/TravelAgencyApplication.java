package com.example.travelagency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class TravelAgencyApplication {

    public static void main(String[] args) {
        SpringApplication.run(TravelAgencyApplication.class, args);

        Country Hiszpania = new Country("Hiszpania");
        City Barcelona = new City("Barcelona", Hiszpania);
        Hotel Stark = new Hotel(3.5, "B&b", "Near to beach", Barcelona);
        DepartCity Katowice = new DepartCity("Katowice");
        Departure KTW = new Departure(Katowice, "Pyrzowice");
        LocalDate dateOfDeparture = LocalDate.parse("2020-07-11");
        LocalDate dateOfReturn = LocalDate.parse("2020-07-25");
        Trip trip1 = new Trip(Stark, dateOfDeparture, dateOfReturn, KTW, 1890);
        System.out.println(trip1.hotel);
        System.out.println(trip1.getDateOfDeparture());
        //TODO dependency do SpringBoot'a
        //TODO połączenie z bazą danych
        //TODO wysłanie tabeli z wycieczkami

    }

}
