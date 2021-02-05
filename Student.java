package com.company;

import java.time.LocalDate;

public class Student {
    private String jmeno;
    private String prijmeni;
    private String trida;
   private LocalDate datumNarozeni;
    private int cestina;
    private int matika;
    private int anglictina;
    private int ekonomika;
    private LocalDate datumMaturity;
    private VysledekMaturity vysledekMaturity;


    // contruktor
    public Student(String jmeno, String prijmeni, String trida, int cestina, int matika, int anglictina, int ekonomika) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.trida = trida;
        this.cestina = cestina;
        this.matika = matika;
        this.anglictina = anglictina;
        this.ekonomika = ekonomika;
    }

    //metody
    public void vypisStudenta () {
       System.out.println("Student/ka: " + jmeno + " " + prijmeni + ", třída: " + trida + ". Narozen/a dne: "+ datumNarozeni +". Maturoval/a za známky: ");
       System.out.println("Čeština: " + cestina + ", Matematika: " + matika + ", Angličtina: " + anglictina + ", Ekonomie: " + ekonomika + ".");
       System.out.println("Student z maturity: " + vysledekMaturity);
    }

    public void  maToZasebou() {
        System.out.println("Má už student/ka " + jmeno +" "+ prijmeni + " po maturitě? " + datumMaturity.isBefore(LocalDate.now()));
    }


//Getters

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public String getTrida() {
        return trida;
    }

    public LocalDate getDatumNarozeni(int i, int i1, int i2) {
        return datumNarozeni;
    }

    public int getCestina() {
        return cestina;
    }

    public int getMatika() {
        return matika;
    }

    public int getAnglictina() {
        return anglictina;
    }

    public int getEkonomika() {
        return ekonomika;
    }

    public LocalDate getDatumMaturity() {
        return datumMaturity;
    }

    public LocalDate getDatumNarozeni() {
        return datumNarozeni;
    }

    public VysledekMaturity getVysledekMaturity() {
        return vysledekMaturity;
    }

    //Setters


    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public void setTrida(String trida) {
        this.trida = trida;
    }

    public void setDatumNarozeni(LocalDate datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }

    public void setCestina(int cestina) {
        this.cestina = cestina;
    }

    public void setMatika(int matika) {
        this.matika = matika;
    }

    public void setAnglictina(int anglictina) {
        this.anglictina = anglictina;
    }

    public void setEkonomika(int ekonomika) {
        this.ekonomika = ekonomika;
    }

    public void setDatumMaturity(LocalDate datumMaturity) {
        this.datumMaturity = datumMaturity;
    }

    public void setVysledekMaturity(VysledekMaturity vysledekMaturity) {
        this.vysledekMaturity = vysledekMaturity;
    }
}
