package com.exe201.backend.api.v1.yard.search;


import com.exe201.backend.service.YardService;
import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(value = "api/v1/yards")
public class SearchYardRestApi {

    private YardService yardService;
    private Gson gson;

    @PostMapping(value = "search")
    public ResponseEntity<String> searchYardByLocation(@RequestBody(required = false) SearchYardRequest searchYardRequest) {
//        if (searchYardRequest == null) {
//            YardResponse yardResponse = yardService.findYardByFilter(null, null, null, null);
//            return ResponseEntity.ok().body(gson.toJson(yardResponse));
//        }
//
//        YardResponse yardResponse = yardService.findYardByFilter(searchYardRequest.getProvinceId(), searchYardRequest.getDistrictId(), searchYardRequest.getItemsPerPage(), searchYardRequest.getPage());
//        return ResponseEntity.ok().body(gson.toJson(yardResponse));
//    }
        try {
            if (searchYardRequest == null) {
                YardResponse yardResponse = yardService.findYardByFilter(null, null, null, null);
                return ResponseEntity.ok().body(gson.toJson(yardResponse));
            }

            YardResponse yardResponse = yardService.findYardByFilter(searchYardRequest.getProvinceId(), searchYardRequest.getDistrictId(), searchYardRequest.getItemsPerPage(), searchYardRequest.getPage());
            return ResponseEntity.ok().body(gson.toJson(yardResponse));
        } catch (Exception e) {
            // Handle any exceptions that may occur during execution
            e.printStackTrace();
            String errorMessage = "An error occurred while processing the request.";
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorMessage);
        }
}}
