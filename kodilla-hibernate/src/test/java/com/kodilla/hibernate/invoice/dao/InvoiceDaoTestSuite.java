package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.InvoiceItem;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private InvoiceItemDao invoiceItemDao;


    @Test
    public void testInvoiceDaoSave() {

        //GIVEN

        Product product1 = new Product("product1");
        Product product2 = new Product("product2");
        Product product3 = new Product("product3");
        Product product4 = new Product("product4");
        Product product5 = new Product("product5");

        InvoiceItem invoiceItem1 = new InvoiceItem(product1,new BigDecimal(100.00),10);
        InvoiceItem invoiceItem2 = new InvoiceItem(product2,new BigDecimal(101.00),11);
        InvoiceItem invoiceItem3 = new InvoiceItem(product3,new BigDecimal(102.00),11);
        InvoiceItem invoiceItem4 = new InvoiceItem(product4,new BigDecimal(103.00),11);
        InvoiceItem invoiceItem5 = new InvoiceItem(product5,new BigDecimal(104.00),11);

        invoiceItem1.setProduct(product1);
        invoiceItem2.setProduct(product2);
        invoiceItem3.setProduct(product3);
        invoiceItem4.setProduct(product4);
        invoiceItem5.setProduct(product5);


        Invoice invoice = new Invoice("12345");

        invoiceItem1.setInvoice(invoice);
        invoiceItem2.setInvoice(invoice);
        invoiceItem3.setInvoice(invoice);
        invoiceItem4.setInvoice(invoice);
        invoiceItem5.setInvoice(invoice);


        //WHEN
        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);
        productDao.save(product4);
        productDao.save(product5);

        invoiceDao.save(invoice);

        invoiceItemDao.save(invoiceItem1);
        invoiceItemDao.save(invoiceItem2);
        invoiceItemDao.save(invoiceItem3);
        invoiceItemDao.save(invoiceItem4);
        invoiceItemDao.save(invoiceItem5);


        //THEN
        int itemId = invoiceItem1.getId();
        int invoiceId = invoice.getId();

        Assert.assertNotEquals(0,itemId);
        Assert.assertNotEquals(0,invoiceId);
        Assert.assertEquals(5,invoiceItemDao.countByInvoice(invoice));

        Assert.assertEquals(4,invoiceItemDao.quantityBiggerThanTen(invoice).size());
    }
}
