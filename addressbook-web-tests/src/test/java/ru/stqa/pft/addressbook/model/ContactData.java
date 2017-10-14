package ru.stqa.pft.addressbook.model;

public class ContactData {
    private int id;
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
        this.id = Integer.MAX_VALUE;
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

    public ContactData(int id, String name, String middleName, String lastName, String homeTelephone, String mobileTelephone, String workTelephone, String email, String email2, String email3, String address, String group) {
        this.id = id;
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

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
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

    @Override
    public String toString() {
        return "ContactData{" +
                "name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", homeTelephone='" + homeTelephone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", group='" + group + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactData that = (ContactData) o;

        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
