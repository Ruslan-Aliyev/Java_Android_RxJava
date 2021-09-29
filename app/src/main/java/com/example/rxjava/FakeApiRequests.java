package com.example.rxjava;

import java.util.ArrayList;
import java.util.List;

public class FakeApiRequests {
    public static List<FakeApiRequest> makeFakeApiRequests() {
        List<FakeApiRequest> requests = new ArrayList<>();
        requests.add(new FakeApiRequest("Result #1"));
        requests.add(new FakeApiRequest("Result #2"));
        return requests;
    }
}
