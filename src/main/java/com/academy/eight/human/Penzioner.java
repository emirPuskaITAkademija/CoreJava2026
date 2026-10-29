package com.academy.eight.human;

import java.time.LocalDate;

//Koncept naslijeđivanja
public class Penzioner extends Person {
    private double pensionAmount;

    public Penzioner(String name, String surname, LocalDate birthday, String nin, double pensionAmount) {
        super(name, surname, birthday, nin);
        this.pensionAmount = pensionAmount;
    }

    public double getPensionAmount() {
        return pensionAmount;
    }

    public void setPensionAmount(double pensionAmount) {
        this.pensionAmount = pensionAmount;
    }
}
