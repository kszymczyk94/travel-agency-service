package com.example.travelagency;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Trip {
    Hotel hotel;
    private LocalDate dateOfDeparture = LocalDate.parse("2020-07-11");
    private LocalDate dateOfReturn = LocalDate.parse("2020-07-25");
    private Departure palceOfDeparture;
    private HolidayDuration holiday;
    private int price;


    public Trip(Hotel hotel, LocalDate dateOfDeparture, LocalDate dateOfReturn, Departure palceOfDeparture, int price) {
        this.hotel = hotel;
        this.dateOfDeparture = dateOfDeparture;
        this.dateOfReturn = dateOfReturn;
        this.palceOfDeparture = palceOfDeparture;
        /*     this.holiday = holiday;*/
        this.price = price;
    }

    public Trip(Hotel stark, int i, int i1, Departure ktw, int price) {
    }/*
    public Period holidayDuration(int dateOfDeparture, int dateOfReturn){
        Period holidayDuration=Period.between(dateOfDeparture, dateOfReturn);
        return holidayDuration;

    }*/
}

