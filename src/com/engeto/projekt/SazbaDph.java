package com.engeto.projekt;

public class SazbaDph {
    String zkratkaStatu;
    String nazevStatu;
    double zakladniSazbaDph;
    double snizenaSazbaDph;
    boolean parkingRate;

    public SazbaDph(String zkratkaStatu, String nazevStatu, double zakladniSazbaDph, double snizenaSazbaDph, boolean parkingRate) {
        this.zkratkaStatu = zkratkaStatu;
        this.nazevStatu = nazevStatu;
        this.zakladniSazbaDph = zakladniSazbaDph;
        this.snizenaSazbaDph = snizenaSazbaDph;
        this.parkingRate = parkingRate;
    }

    public String getZkratkaStatu() {
        return zkratkaStatu;
    }

    public void setZkratkaStatu(String zkratkaStatu) {
        this.zkratkaStatu = zkratkaStatu;
    }

    public String getNazevStatu() {
        return nazevStatu;
    }

    public void setNazevStatu(String nazevStatu) {
        this.nazevStatu = nazevStatu;
    }

    public double getZakladniSazbaDph() {
        return zakladniSazbaDph;
    }

    public void setZakladniSazbaDph(double zakladniSazbaDph) {
        this.zakladniSazbaDph = zakladniSazbaDph;
    }

    public double getSnizenaSazbaDph() {
        return snizenaSazbaDph;
    }

    public void setSnizenaSazbaDph(double snizenaSazbaDph) {
        this.snizenaSazbaDph = snizenaSazbaDph;
    }

    public boolean isParkingRate() {
        return parkingRate;
    }

    public void setParkingRate(boolean parkingRate) {
        this.parkingRate = parkingRate;
    }
}
