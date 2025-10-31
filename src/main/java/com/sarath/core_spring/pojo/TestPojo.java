package com.sarath.core_spring.pojo;

import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.jmx.export.notification.NotificationPublisher;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public abstract class TestPojo {

    private int marker;

   @PreDestroy
    public void destroying(){
        //System.out.println("Destroying");
    }

    @PostConstruct
    public void constructed(){
        //System.out.println("Constructed with testHelper"+testHelper);
    }

    public void greet(){
        System.out.println(getTestHelper().provideGreeting());
    }

    public abstract TestHelper getTestHelper();

    public int getMarker() {
        return marker;
    }

    public void setMarker(int marker) {
        this.marker = marker;
    }
}
