package org.jefrienalvizures.ticcalc.models;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Jefrien Alvizures on 13/06/2016.
 */
public class TipRecord {
    private double bill;
    private int tipPercentage;
    private Date timestamps;

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public int getTipPercentage() {
        return tipPercentage;
    }

    public void setTipPercentage(int tipPercentage) {
        this.tipPercentage = tipPercentage;
    }

    public Date getTimestamps() {
        return timestamps;
    }

    public void setTimestamps(Date timestamps) {
        this.timestamps = timestamps;
    }

    public double getTip(){
        return bill * (tipPercentage/100d);
    }
    public String getDateFormatted(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd,yyyy HH:mm");
        return simpleDateFormat.format(timestamps);
    }
}
