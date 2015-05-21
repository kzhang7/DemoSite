package com.mycompany.kzhang.tutorial.dao;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.broadleafcommerce.common.persistence.EntityConfiguration;
import org.springframework.stereotype.Repository;

import com.mycompany.kzhang.tutorial.domain.ContactUs;
import com.mycompany.kzhang.tutorial.domain.ContactUsImpl;

@Repository("contactUsDao")
public class ContactUsDaoImpl implements ContactUsDao {

    @PersistenceContext(unitName = "blPU")
    protected EntityManager em;
    
    @Resource(name = "blEntityConfiguration")
    protected EntityConfiguration entityConfiguration;
    
    @Override
    public ContactUs create() {
        return ((ContactUs) entityConfiguration.createEntityInstance(ContactUs.class.getName()));
    }

    @Override
    public ContactUs readContactUsById(Long contactUsId) {
        return em.find(ContactUsImpl.class, contactUsId);
    }

    @Override
    public ContactUs save(ContactUs contactUs) {
        return em.merge(contactUs);
    }

    @Override
    public void remove(ContactUs contactUs) {
        em.remove(contactUs);
    }

}
