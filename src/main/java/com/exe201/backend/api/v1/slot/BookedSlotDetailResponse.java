package com.exe201.backend.api.v1.slot;

import com.exe201.backend.model.BookedSlotModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookedSlotDetailResponse {
    private String message;
    private BookedSlotModel data;
}
