package seminar3.model;

public class Person {
    private String personName;
    private String personSurname;
    private String personPatronymic;
    private String birthday;
    private Integer phoneNumber;
    private String sex;

    public Person(String personName, String personSurname, String personPatronymic, String birthday, Integer phoneNumber, String sex) {
        this.personName = personName;
        this.personSurname = personSurname;
        this.personPatronymic = personPatronymic;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonSurname() {
        return personSurname;
    }

    public void setPersonSurname(String personSurname) {
        this.personSurname = personSurname;
    }

    public String getPersonPatronymic() {
        return personPatronymic;
    }

    public void setPersonPatronymic(String personPatronymic) {
        this.personPatronymic = personPatronymic;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personName='" + personName + '\'' +
                ", personSurname='" + personSurname + '\'' +
                ", personPatronymic='" + personPatronymic + '\'' +
                ", birthday='" + birthday + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", sex='" + sex + '\'' +
                '}';
    }
}
