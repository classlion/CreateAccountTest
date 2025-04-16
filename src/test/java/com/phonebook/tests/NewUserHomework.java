package com.phonebook.tests;

public class NewUserHomework{
    String firstName;
    String lastName;
    String email;
    String password;
    String confirmPassword;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public NewUserHomework setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public NewUserHomework setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public NewUserHomework setEmail(String email) {
        this.email = email;
        return this;
    }

    public NewUserHomework setPassword(String password) {
        this.password = password;
        return this;
    }

    public NewUserHomework setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    }
}