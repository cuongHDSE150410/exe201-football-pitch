package com.exe201.backend.api.v1.slot;

import com.exe201.backend.utils.DateHelper;
import com.google.type.DateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.sql.Timestamp;

@Data
//@AllArgsConstructor
@NoArgsConstructor
public class GetSlotRequest {
    @NotNull
    private String date;


}
