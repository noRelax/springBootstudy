package com.norelax.www.service;import com.norelax.www.dao.PersonDao;import com.norelax.www.entity.Person;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Service;/** * @author wusong * @create 2017-06-15 下午5:00 **/@Servicepublic class PersonService {    public PersonService() {        System.out.println("PersonService inited!");    }    @Autowired    private PersonDao personDao;    public String getPersonName(){        Person person = personDao.getPerson();        return person.toString();    }}