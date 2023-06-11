package com.exe201.backend.api.v1.owner.yard.request;


import lombok.Data;

@Data
public class SlotRequest {
    private String startTime;
    private String endTime;
    private int price;
}
