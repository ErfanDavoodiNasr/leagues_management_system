package model.human;

import java.util.Objects;

public class Person {
    private String firstName;
    private String secondName;
    private String nationalId;
    private String gender;
    private int age;

    public Person(String firstName, String secondName, String nationalId) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.nationalId = nationalId;
    }

    public Person(String firstName, String secondName, String nationalId, String gender, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.nationalId = nationalId;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(firstName, person.firstName) && Objects.equals(secondName, person.secondName) && Objects.equals(nationalId, person.nationalId) && Objects.equals(gender, person.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, nationalId, gender, age);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", nationalId='" + nationalId + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
