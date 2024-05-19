package com.vcdstore.main.models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;

public class productDTO {
    @NotEmpty(message ="Judul diperlukan")
    private String judul;

    @NotEmpty(message ="Aktor diperlukan")
    private String aktor;

    @NotEmpty(message ="Sutradara diperlukan")
    private String sutradara;

    @NotEmpty(message ="Publisher diperlukan")
    private String publisher;

    @NotEmpty(message ="Kategori diperlukan")
    private String kategori;

    @Min(0)
    private double harga;

    @Min(0)
    private int stok;


    public String getJudul() {
        return this.judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getAktor() {
        return this.aktor;
    }

    public void setAktor(String aktor) {
        this.aktor = aktor;
    }

    public String getSutradara() {
        return this.sutradara;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getKategori() {
        return this.kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public double getHarga() {
        return this.harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStok() {
        return this.stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
}
