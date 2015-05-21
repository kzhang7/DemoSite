package com.mycompany.kzhang.tutorial.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "CONTACT_US")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region="blStandardElements")
public class ContactUsImpl implements ContactUs {

    @Id
    @GeneratedValue(generator= "ContactUsId")
    @GenericGenerator(
        name="ContactUsId",
        strategy="org.broadleafcommerce.common.persistence.IdOverrideTableGenerator",
        parameters = {
            @Parameter(name="segment_value", value="ContactUsImpl"),
            @Parameter(name="entity_name", value="com.mycompany.kzhang.tutorial.domain.ContactUsImpl")
        }
    )
    @Column(name = "CONTACT_US_ID")
    protected Long id;

    @Column(name = "NAME")
    protected String name;
    
    @Column(name = "EMAIL_ADDRESS")
    protected String emailAddress;
    
    @Column(name = "COMMENTS")
    protected String comments;
    
    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String getComments() {
        return comments;
    }

    @Override
    public void setComments(String comments) {
        this.comments = comments;
    }
    
}
