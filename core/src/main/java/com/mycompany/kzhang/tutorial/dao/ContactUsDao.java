package com.mycompany.kzhang.tutorial.dao;

import com.mycompany.kzhang.tutorial.domain.ContactUs;

public interface ContactUsDao {
    public ContactUs create();
    
    public ContactUs readContactUsById(Long contactUsId);
    
    public ContactUs save(ContactUs contactUs);

    public void remove(ContactUs contactUs);
}
