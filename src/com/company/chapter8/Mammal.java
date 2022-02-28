package com.company.chapter8;

public class Mammal {
    String type = "mammal";
}


class Bat extends Mammal {

    String type = "bat";

    public String getType() {
        return super.type + ":" + this.type;
    }

}