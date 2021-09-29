package com.example.rxjava;

//import io.reactivex.rxjava3.core.Observable;
import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ApiService {

    String API_BASE_URL = "https://jsonplaceholder.typicode.com/";

    @GET("/todos/1")
    Observable<Todo> getFirstTodo();
}
