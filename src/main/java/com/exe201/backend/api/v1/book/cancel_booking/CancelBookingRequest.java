package com.exe201.backend.api.v1.book.cancel_booking;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@Data
public class CancelBookingRequest {
    @NonNull
    private String reason;


}
