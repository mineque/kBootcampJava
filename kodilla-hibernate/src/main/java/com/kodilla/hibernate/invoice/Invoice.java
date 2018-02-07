package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "INVOICES")
public class Invoice {
    private int id;
    private String number;
    private List<InvoiceItem> invoiceItems;

    public Invoice() {
    }

    public Invoice(String number, List<InvoiceItem> invoiceItems) {
        this.number = number;
        this.invoiceItems = invoiceItems;
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

    @OneToMany(
        targetEntity = InvoiceItem.class,
        mappedBy = "id",
        cascade = CascadeType.ALL,
        fetch = FetchType.LAZY
    )
    public List<InvoiceItem> getInvoiceItems() {
        return invoiceItems;
    }

    public void setInvoiceItems(List<InvoiceItem> invoiceItems) {
        this.invoiceItems = invoiceItems;
    }
}
