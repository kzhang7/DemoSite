package com.mycompany.kzhang.tutorial.domain;

public interface ContactUs {

    public abstract Long getId();

    public abstract void setId(Long id);

    public abstract String getName();

    public abstract void setName(String name);

    public abstract String getEmailAddress();

    public abstract void setEmailAddress(String emailAddress);

    public abstract String getComments();

    public abstract void setComments(String comments);

}