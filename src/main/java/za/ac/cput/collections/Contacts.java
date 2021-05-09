package za.ac.cput.collections;

import java.util.*;

public class Contacts {
    private String name, surname, nickname;
    private int test;
    private long numbers, idNumber;

    public Contacts(String name, String surname, String nickname, long numbers, long idNumber, int test) {
        this.name = name;
        this.surname = surname;
        this.nickname = nickname;
        this.numbers = numbers;
        this.idNumber = idNumber;
        this.test = test;
    }

    public int getTest(){
        return this.test;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNickname() {
        return nickname;
    }

    public long getNumbers() {
        return numbers;
    }

    public long getIdNumber() {
        return idNumber;
    }

}
