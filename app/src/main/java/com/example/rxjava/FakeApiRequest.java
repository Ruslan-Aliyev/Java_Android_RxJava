package com.example.rxjava;

public class FakeApiRequest {
    private String result;

    public FakeApiRequest(String result) {
        this.result = result;
    }

    public String getResult() {
        return this.result;
    }
}
