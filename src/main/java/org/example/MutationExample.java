package org.example;


public class MutationExample {

    private void internalFunction() {
        //do something for i>=0
    }

    private void internalFunction2() {
        //do something for i<0
    }

    public String function(int i) {
        String message;
        if (i >= 0) {
            //do something
            internalFunction();
            message = "message 1";
        } else {
            //do something
            internalFunction2();
            message = "message 2";
        }
        return message;
    }
}
