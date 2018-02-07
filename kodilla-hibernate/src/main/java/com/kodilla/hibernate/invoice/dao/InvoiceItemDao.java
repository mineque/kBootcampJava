package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.InvoiceItem;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface InvoiceItemDao extends CrudRepository<InvoiceItem,Integer> {
    int countByInvoice(Invoice invoice);

    @Query
    List<InvoiceItem> quantityBiggerThanTen(@Param("INVOICE") Invoice invoice);
}
