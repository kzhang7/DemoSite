package com.mycompany.kzhang.tutorial.service;

import com.mycompany.kzhang.tutorial.domain.ContactUs;

public interface ContactUsService {
    public ContactUs createContactUs();
    
    public ContactUs findContactUsById(Long contactUsId);
    
    public ContactUs saveContactUs(ContactUs contactUs);

    public void removeContactUs(ContactUs contactUs);
}
