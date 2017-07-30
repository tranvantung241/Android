package com.example.trantung.model;

import java.io.Serializable;

/**
 * Created by Tran Tung on 14-Jul-17.
 */

public class DanhBa implements Serializable{
    private  int Ma;
    private  String Ten;
    private String SDT;

    public DanhBa() {
    }

    public DanhBa(int ma, String ten, String SDT) {

        Ma = ma;
        Ten = ten;
        this.SDT = SDT;
    }

    public int getMa() {

        return Ma;
    }

    public void setMa(int ma) {
        Ma = ma;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
}
