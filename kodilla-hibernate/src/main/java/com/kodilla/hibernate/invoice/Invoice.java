package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "INVOICES")
public class Invoice {
    private int id;
    private String number;

    public Invoice() {
    }

    public Invoice(String number) {
        this.number = number;
    }

    @GeneratedValue
    @NotNull
    @Column(name = "INVOICE_ID")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "INVOICE_NUMBER")
    @NotNull
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    }
