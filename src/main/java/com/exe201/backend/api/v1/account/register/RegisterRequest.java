package com.exe201.backend.api.v1.account.register;

import com.exe201.backend.utils.RegexHelper;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class RegisterRequest {
    @NonNull
    private String email;
    @NonNull
    private String fullName;
    @NonNull
    private String password;
    @NonNull
    private String phone;
    @NonNull
    private String confirmPassword;

    //Check valid request form


    public String checkBusinessError() {
        email = email.trim();
        password = password.trim();
        confirmPassword = confirmPassword.trim();
        fullName = fullName.trim();

        if (!email.matches(RegexHelper.EMAIL_REGEX)) {
            return "Email is not valid.";
        }

        if (password.length() < 8) {
            return "Password must at least 8 characters";
        }

        if (!password.matches(confirmPassword)) {
            return "Password and confirm password not matches";
        }
        return null;
    }
}
