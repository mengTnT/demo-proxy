package com.test.demo.entity;


import javax.validation.constraints.Min;

public class Users {
    private Integer id;
    private String username;
    private String password;
    //min注解表示这个值最小为18
    @Min(value = 18, message = "未满18岁禁止注册")
    private Integer age;
    private String telphone;

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", telphone='" + telphone + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public Users(Integer id, String username, String password, Integer age, String telphone) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
        this.telphone = telphone;
    }

    public Users() {
    }


}
