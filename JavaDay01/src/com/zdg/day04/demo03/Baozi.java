package com.zdg.day04.demo03;

public class Baozi {
    private String pi;
    private String xian;
    private boolean flag = false;

    public Baozi() {
    }

    public Baozi(String pi, String xian) {
        this.pi = pi;
        this.xian = xian;
    }

    public String getPi() {
        return pi;
    }

    public void setPi(String pi) {
        this.pi = pi;
    }

    public String getXian() {
        return xian;
    }

    public void setXian(String xian) {
        this.xian = xian;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
