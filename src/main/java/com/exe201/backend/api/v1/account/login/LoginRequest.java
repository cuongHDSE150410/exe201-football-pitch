package com.exe201.backend.api.v1.account.login;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
public class LoginRequest {

    @NonNull
    private String username;

    @NonNull
    private String password;
}
