package org.za.eoh.services;


import org.za.eoh.model.Invoice;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public interface InvoiceService {
    List<Invoice> getInvoiceList();
    Invoice getInvoice(Long id);
    Invoice save(Invoice invoice);

}
