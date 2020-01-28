package com.example.travelagency;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Hotel {
    private double stars;
    private String allimentation;
    private String description;
    private City city;
}
