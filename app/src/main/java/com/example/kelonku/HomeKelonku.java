package com.example.kelonku;

public class HomeKelonku {

    private String judul;
    private String Jan;
    private String Feb;

    public HomeKelonku(String judul, String jan, String feb) {
        this.judul = judul;
        this.Jan = jan;
        this.Feb = feb;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getJan() {
        return Jan;
    }

    public void setJan(String jan) {
        Jan = jan;
    }

    public String getFeb() {
        return Feb;
    }

    public void setFeb(String feb) {
        Feb = feb;
    }
}
