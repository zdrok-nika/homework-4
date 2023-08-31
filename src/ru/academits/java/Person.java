package ru.academits.java;

public class Person {

    private String name;
    private String middleName;
    private String familyName;
    private int age;

    public Person(String name, String middlName, String familyName, int age) {
        this.name = name;
        this.middleName = middlName;
        this.familyName = familyName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!(name.length() == 0)) {
            this.name = name;
            System.out.println("Имя было изменено");
        }
    }

    public String getMiddlName() {
        return middleName;
    }

    public void setMiddlName(String middlName) {
        if (!(middleName.length() == 0)) {
            this.middleName = middlName;
            System.out.println("Отчество было изменено");
        }
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        if (!(familyName.length() == 0)) {
            this.familyName = familyName;
            System.out.println("Фамилия была изменена");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
           this.age = age;
    }
}