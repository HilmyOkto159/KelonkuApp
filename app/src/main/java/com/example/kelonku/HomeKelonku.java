package com.example.kelonku;

public class HomeKelonku {

    String Bulan;
    String Pengeluaran;
    String Pemasukan;

    public HomeKelonku(String bulan, String pengeluaran, String pemasukan) {
        this.Bulan = bulan;
        this.Pengeluaran = pengeluaran;
        this.Pemasukan = pemasukan;
    }

    public String getBulan() {
        return Bulan;
    }

    public void setBulan(String judul) {
        this.Bulan = Bulan;
    }

    public String getPengeluaran() {
        return Pengeluaran;
    }

    public void setJan(String pengeluaran) {
        Pengeluaran = pengeluaran;
    }

    public String getPemasukan() {
        return Pemasukan;
    }

    public void setFeb(String pemasukan) {
        Pemasukan = pemasukan;
    }
}
