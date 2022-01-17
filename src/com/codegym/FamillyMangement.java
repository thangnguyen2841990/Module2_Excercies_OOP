package com.codegym;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FamillyMangement {
    Familly[] famillies = new Familly[0];


    public FamillyMangement() {

    }

    public FamillyMangement(Familly[] famillies) {
        this.famillies = famillies;
    }

    public Familly[] getFamillies() {
        return famillies;
    }

    public void setFamillies(Familly[] famillies) {
        this.famillies = famillies;
    }

    public void displayAllFamillies() {
        for (int i = 0; i < famillies.length; i++) {
            System.out.println((i + 1) + ". " + famillies[i]);
            famillies[i].displayAllMember();
        }
    }

    public void addNewFamilly(int index, Familly newFamilly) {
        Familly[] newFamillies = new Familly[famillies.length + 1];
        for (int i = 0; i < newFamillies.length; i++) {
            if (i < index) {
                newFamillies[i] = famillies[i];
            } else if (i == index) {
                newFamillies[i] = newFamilly;

            } else {
                newFamillies[i] = famillies[i - 1];
            }
        }
        this.famillies = newFamillies;
    }

    public void removeFamilly(int index) {
        Familly[] newFamillies = new Familly[famillies.length - 1];
        for (int i = 0; i < newFamillies.length; i++) {
            if (i < index) {
                newFamillies[i] = famillies[i];
            } else {
                newFamillies[i] = famillies[i + 1];
            }
        }
        this.famillies = newFamillies;
    }

    public void updateFamilly(int index, Familly newFamilly) {
        famillies[index] = newFamilly;
    }

    public Date strToDate(String birthDay) {
        Date date = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = simpleDateFormat.parse(birthDay);
        } catch (ParseException e) {
            System.out.println("Lỗi");
        }
        return date;
    }

}
