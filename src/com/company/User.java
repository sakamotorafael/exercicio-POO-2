package com.company;

public class User {
    private static int lastId;
    private int id;
    private String name;
    private String cpf;
    private String phone;
    private String email;
    private int score;
    private Address address;

    public User(String name, String cpf, String phone, String email, int score, Address address) {
        this.id = ++lastId;
        this.name = name;
        this.cpf = cpf;
        this.phone = phone;
        this.email = email;
        this.score = score;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if(score >= 0 && score <= 1000) {
            this.score = score;
        }
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
