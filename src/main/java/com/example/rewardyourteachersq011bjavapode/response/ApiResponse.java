package com.example.rewardyourteachersq011bjavapode.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse<T> {

    private String message;
    private LocalDateTime timeStamp;
    private T data;

    public ApiResponse(String message, T data, LocalDateTime timeStamp) {
        this.message = message;
        this.timeStamp = LocalDateTime.now();
        this.data = data;
    }


}
