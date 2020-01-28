package com.example.travelagency;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Cost {
    PersonNumb personNumb;
    private double adultPrice;
    private double childPrice = 0.3 * adultPrice;
    private double teensPrice = 0.7 * adultPrice;

/*public double priceCounting(){

    double price = (numbOfAdults->) personNumb.getAdultPersonNumber() * adultPrice + (numbOfChild->) personNumb.getChildPersonNumber()*childPrice + (numbOfTeens->) personNumb.getTeensPersonNumber() *teensPrice;

    return "Cena całkowita wynosi "+ price +"zł";

}}*/

    @Override
    public String toString() {
        return "Cost{" +
                "personNumb=" + personNumb +
                ", adultPrice=" + adultPrice +
                ", childPrice=" + childPrice +
                ", teensPrice=" + teensPrice +
                '}';
    }
}
