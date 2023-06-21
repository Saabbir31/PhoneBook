


class Contact{
    private String name;
    private String phoneNumber;
    private String countryCode;
    private String country;
    private String email;
    private String gender;

    public Contact(String name, String phoneNumber, String countryCode, String country, String email, String gender) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.countryCode = countryCode;
        this.country = country;
        this.email = email;
        this.gender = gender;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCountry() {
        return country;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }
}