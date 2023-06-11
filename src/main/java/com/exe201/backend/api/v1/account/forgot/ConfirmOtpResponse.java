package com.exe201.backend.api.v1.account.forgot;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ConfirmOtpResponse {
    private String token;
}
