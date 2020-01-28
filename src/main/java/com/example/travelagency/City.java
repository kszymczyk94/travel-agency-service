package com.example.travelagency;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class City {

    private String city;
    private Country country;
    }
    /*
    @Override
    public String toString() {
        return "City{" +
                "city='" + city + '\'' +
                ", country=" + country +
                '}';
    }*/
