package model;

public class ContactData {
    private String name;
    private String email;
    private String phone;
    private String company;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getCompany() {
        return company;
    }

    public ContactData withName(String name) {
        this.name = name;
        return this;
    }

    public ContactData withEmail(String email) {
        this.email = email;
        return this;
    }

    public ContactData withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public ContactData withCompany(String company) {
        this.company = company;
        return this;
    }
}
