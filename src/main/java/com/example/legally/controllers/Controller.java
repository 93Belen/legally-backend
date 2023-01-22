package com.example.legally.controllers;

import com.example.legally.ApiResponse;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {
    ApiResponse apiResponse = new ApiResponse();
    @CrossOrigin("http://localhost:3000")
    @GetMapping("/apicall")
    @ResponseBody
    public String getResponseFromApi() throws Exception {
         System.out.println("Here!");
         String response = apiResponse.getResponse();
         System.out.println(response);
        return response;
    }

    ApiResponse apiResponseMinor = new ApiResponse();
    @CrossOrigin("http://localhost:3000")
    @GetMapping("/apicallMinor")
    @ResponseBody
    public String getResponseFromApiMinor() throws Exception {
        System.out.println("Here!");
        String responseMinor = apiResponseMinor.getResponseMinor();
        System.out.println(responseMinor);
        return responseMinor;
    }
}
