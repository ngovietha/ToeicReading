package com.example.ha.ToeicReading.tuvung;

import java.io.Serializable;

public class TuVung implements Serializable {
    private int id;
    private String tuvung;
    private String phienam;
    private String giaithich;
    private String tuloai;
    private String vidu;
    private  String dichvd;
    private String img;




    public TuVung(int id, String tuvung, String phienam, String giaithich, String tuloai, String vidu, String dichvd, String img) {
        this.id=id;
        this.tuvung=tuvung;
        this.phienam=phienam;
        this.giaithich=giaithich;
        this.tuloai=tuloai;
        this.vidu=vidu;
        this.dichvd=dichvd;
        this.img=img;
    }

    public String getPhienam() {
        return phienam;
    }

    public void setPhienam(String phienam) {
        this.phienam = phienam;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDichvd() {
        return dichvd;
    }

    public void setDichvd(String dichvd) {
        this.dichvd = dichvd;
    }

    public String getVidu() {
        return vidu;
    }

    public void setVidu(String vidu) {
        this.vidu = vidu;
    }

    public String getTuloai() {
        return tuloai;
    }

    public void setTuloai(String tuloai) {
        this.tuloai = tuloai;
    }

    public String getGiaithich() {
        return giaithich;
    }

    public void setGiaithich(String giaithich) {
        this.giaithich = giaithich;
    }

    public String getTuvung() {
        return tuvung;
    }

    public void setTuvung(String tuvung) {
        this.tuvung = tuvung;
    }
}
