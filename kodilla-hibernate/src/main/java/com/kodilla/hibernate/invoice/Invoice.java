package com.kodilla.hibernate.invoice;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "INVOICES")
public class Invoice {
    private int id;
    private String number;
    private List<Item> items;
}
