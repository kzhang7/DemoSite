package com.mycompany.kzhang.tutorial.service;

import javax.annotation.Resource;

import org.broadleafcommerce.common.util.TransactionUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.kzhang.tutorial.dao.ContactUsDao;
import com.mycompany.kzhang.tutorial.domain.ContactUs;

@Service("contactUsService")
public class ContactUsServiceImpl implements ContactUsService {

    @Resource(name = "contactUsDao")
    protected ContactUsDao contactUsDao;
    
    @Override
    public ContactUs createContactUs() {
        return contactUsDao.create();
    }

    @Override
    public ContactUs findContactUsById(Long contactUsId) {
        return contactUsDao.readContactUsById(contactUsId);
    }

    @Override
    @Transactional(value = TransactionUtils.DEFAULT_TRANSACTION_MANAGER)
    public ContactUs saveContactUs(ContactUs contactUs) {
        return contactUsDao.save(contactUs);
    }

    @Override
    @Transactional(value = TransactionUtils.DEFAULT_TRANSACTION_MANAGER)
    public void removeContactUs(ContactUs contactUs) {
        contactUsDao.remove(contactUs);
    }

}
