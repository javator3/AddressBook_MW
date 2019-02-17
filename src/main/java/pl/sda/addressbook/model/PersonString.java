package pl.sda.addressbook.model;

import lombok.*;
import java.util.Objects;
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
@ToString
@Getter


public class PersonString {
    private String name;
    private String lastname;
    private String street;
    private String city;
    private String postalcode;
    private String telephone;

//    public PersonString(String name, String lastname, String street, String city, String postalcode, String telephone) {
//        this.name = name;
//        this.lastname = lastname;
//        this.street = street;
//        this.city = city;
//        this.postalcode = postalcode;
//        this.telephone = telephone;
//    }
//
//    public PersonString() {
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getLastname() {
//        return lastname;
//    }
//
//    public void setLastname(String lastname) {
//        this.lastname = lastname;
//    }
//
//    public String getStreet() {
//        return street;
//    }
//
//    public void setStreet(String street) {
//        this.street = street;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public String getPostalcode() {
//        return postalcode;
//    }
//
//    public void setPostalcode(String postalcode) {
//        this.postalcode = postalcode;
//    }
//
//    public String getTelephone() {
//        return telephone;
//    }
//
//    public void setTelephone(String telephone) {
//        this.telephone = telephone;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        PersonString that = (PersonString) o;
//        return Objects.equals(name, that.name) &&
//                Objects.equals(lastname, that.lastname) &&
//                Objects.equals(street, that.street) &&
//                Objects.equals(city, that.city) &&
//                Objects.equals(postalcode, that.postalcode) &&
//                Objects.equals(telephone, that.telephone);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, lastname, street, city, postalcode, telephone);
//    }
//
//    @Override
//    public String toString() {
//        return "PersonString{" +
//                "name='" + name + '\'' +
//                ", lastname='" + lastname + '\'' +
//                ", street='" + street + '\'' +
//                ", city='" + city + '\'' +
//                ", postalcode='" + postalcode + '\'' +
//                ", telephone='" + telephone + '\'' +
//                '}';
//    }
}
