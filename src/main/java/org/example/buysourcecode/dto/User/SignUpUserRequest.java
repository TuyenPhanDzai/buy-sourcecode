package org.example.buysourcecode.dto.User;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class SignUpUserRequest {
    @NotBlank(message = "username không được để trống")
    @Size(min = 6, max = 16, message = "username có độ dài từ 6-16 kí tự")
    private String username;

    @NotNull
    @Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}$", message = "từ 8 kí tự, có chữ thường, hoa, số")
    private String password;
}
