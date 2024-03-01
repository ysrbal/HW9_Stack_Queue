package com.yasar.Question3;

public class Musteri implements Comparable<Musteri> {
    private int siraNo;
    private String name;
    private boolean isCustomer;

    public Musteri(int siraNo, String name, boolean isCustomer) {
        this.siraNo = siraNo;
        this.name = name;
        this.isCustomer = isCustomer;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Musteri{");
        sb.append("siraNo=").append(siraNo);
        sb.append(", name='").append(name).append('\'');
        sb.append(", isCustomer=").append(isCustomer);
        sb.append('}');
        return sb.toString();
    }

    public int getSiraNo() {
        return siraNo;
    }

    public void setSiraNo(int siraNo) {
        this.siraNo = siraNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCustomer() {
        return isCustomer;
    }

    public void setCustomer(boolean customer) {
        isCustomer = customer;
    }

    @Override
    public int compareTo(Musteri o) {
        if (o.isCustomer) {
            return 1;
        }
        return -1;
    }
}
