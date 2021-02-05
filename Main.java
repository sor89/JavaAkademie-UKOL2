package com.company;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
// 1. student
        Student pepa = new Student("Josef", "Novotný", "4A", 1, 1, 1, 1);

        pepa.setDatumNarozeni(LocalDate.of(1989,10,10));
        pepa.setDatumMaturity(LocalDate.of(2009,6,1));
        pepa.setVysledekMaturity(VysledekMaturity.PROSPEL_S_VYZNAMENANIM);
// 2. student
        Student lenka = new Student("Lenka", "Střelenka", "4B", 2, 3, 1, 2);

        lenka.setDatumNarozeni(LocalDate.of(1900,01,21));
        lenka.setDatumMaturity(LocalDate.of(2009,6,8));
        lenka.setVysledekMaturity(VysledekMaturity.PROSPELA);

// 3. student
        Student franta = new Student("František", "Nepil", "4C", 5, 5, 5, 5);

        lenka.setDatumNarozeni(LocalDate.of(1900,12,24));
        lenka.setDatumMaturity(LocalDate.of(2009,6,3));
        lenka.setVysledekMaturity(VysledekMaturity.NEPROSPEL);

// 4. student
        Student mirka = new Student("Miroslava", "Nedochodilová", "4C", 0, 0, 0, 0);

        mirka.setDatumNarozeni(LocalDate.of(2003,10,20));
        mirka.setDatumMaturity(LocalDate.of(2021,6,10));
        mirka.setVysledekMaturity(VysledekMaturity.NEKLASIFIKOVANO);

        //volane metody
       pepa.vypisStudenta();
       pepa.maToZasebou();

    }
}
