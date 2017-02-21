package com.bins.spring.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by songrongbin on 2016/9/29.
 */
@Component
@ConfigurationProperties(prefix = "user")
public class User {
    private @Value("${name}") String name;
    private @Value("${age}") Integer age;
    private @Value("${remark}") String remark;
    private String address;
    private Address detailAddress;
    private Address allAddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Address getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(Address detailAddress) {
        this.detailAddress = detailAddress;
    }

    public Address getAllAddress() {
        return allAddress;
    }

    public void setAllAddress(Address allAddress) {
        this.allAddress = allAddress;
    }
}
