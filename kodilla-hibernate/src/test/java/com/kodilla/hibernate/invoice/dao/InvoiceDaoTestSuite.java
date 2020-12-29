package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import com.kodilla.hibernate.invoice.dao.InvoiceDao;
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
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product = new Product("Jabłka");
        Product product2 = new Product("Gruszki");


        Item item = new Item(new BigDecimal(20), 30);
        Item item2 = new Item(new BigDecimal(15), 15);
        Item item3 = new Item(new BigDecimal(20), 44);
        Item item4 = new Item(new BigDecimal(15), 12);

        Invoice invoice = new Invoice("2020/12/12");
        Invoice invoice2 = new Invoice("2020/12/24");

        product.getItems().add(item);
        product.getItems().add(item2);
        product2.getItems().add(item3);
        product2.getItems().add(item4);

        item.setProduct(product);
        item2.setProduct(product);
        item3.setProduct(product2);
        item4.setProduct(product2);

        invoice.getItems().add(item);
        invoice.getItems().add(item3);
        invoice2.getItems().add(item2);
        invoice2.getItems().add(item4);

        item.setInvoice(invoice);
        item2.setInvoice(invoice2);
        item3.setInvoice(invoice);
        item4.setInvoice(invoice2);

        //when
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();
        invoiceDao.save(invoice2);
        int invoice2Id = invoice2.getId();

        //then
        Assert.assertNotEquals(0, invoiceId);
        Assert.assertNotEquals(0, invoice2Id);

        //clean up
        //invoiceDao.deleteById(invoiceId);
        // I can't delete invoice2 cuz it's been already deleted with invoice (cuz of their relationship).
        //invoiceDao.deleteById(invoice2Id);


    }

}
