package ru.stqa.pft.addressbook.model;

public class ContactData {
    private final String name;
    private final String middleName;
    private final String lastName;
    private final String homeTelephone;
    private final String mobileTelephone;
    private final String workTelephone;
    private final String email;
    private final String email2;
    private final String email3;
    private final String address;
    private String group;

    public ContactData(String name, String middleName, String lastName, String homeTelephone, String mobileTelephone, String workTelephone, String email, String email2, String email3, String address, String group) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.homeTelephone = homeTelephone;
        this.mobileTelephone = mobileTelephone;
        this.workTelephone = workTelephone;
        this.email = email;
        this.email2 = email2;
        this.email3 = email3;
        this.address = address;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getHomeTelephone() {
        return homeTelephone;
    }

    public String getMobileTelephone() {
        return mobileTelephone;
    }

    public String getWorkTelephone() {
        return workTelephone;
    }

    public String getEmail() {
        return email;
    }

    public String getEmail2() {
        return email2;
    }

    public String getEmail3() {
        return email3;
    }

    public String getAddress() {
        return address;
    }

    public String getGroup() {
        return group;
    }
}
