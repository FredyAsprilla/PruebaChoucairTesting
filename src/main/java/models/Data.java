package models;

public class Data {
    public String name;
    public String lastName;
    public String day;
    public String month;
    public String year;


    public Data(String name, String lastName,  String day, String month, String year) {
        this.name = name;
        this.lastName = lastName;

        this.day = day;
        this.month = month;
        this.year = year;

    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

}
