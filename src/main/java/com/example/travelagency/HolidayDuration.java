package com.example.travelagency;

import lombok.*;

import java.time.LocalDate;
import java.time.Period;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class HolidayDuration {
    LocalDate dateOfDeparture; /*= LocalDate.parse("2020-06-27");*/
    LocalDate dateOfReturn;/* = LocalDate.parse("2020-07-11");*/


    public Period holidayDuration(LocalDate dateOfDeparture, LocalDate dateOfReturn) {
        Period holidayDuration = Period.between(dateOfDeparture, dateOfReturn);
        return holidayDuration;
    }
}

