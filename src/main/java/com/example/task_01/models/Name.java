package com.example.task_01.models;

public class Name {

//    POJOs have 3 requirements:
// properties must be private
//    accessible via public getters and setters
//    must include a default constructor
private String name;
private String timeOfDay;


public Name(){}

public Name(String name, String timeOfDay){
    this.name = name;
    this.timeOfDay = timeOfDay;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }
}
