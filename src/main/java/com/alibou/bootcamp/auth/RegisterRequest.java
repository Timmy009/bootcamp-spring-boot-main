package com.alibou.bootcamp.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterRequest {

  @NotNull(message = "First name is mandatory")
  @NotBlank(message = "First name is mandatory")
  private String firstname;
  @NotNull(message = "Last name is mandatory")
  @NotBlank(message = "Last name is mandatory")
  private String lastname;
  @NotNull(message = "Email name is mandatory")
  @NotBlank(message = "Email name is mandatory")
  @Email(message = "Email is not valid")
  private String email;
  @NotNull(message = "Email name is mandatory")
  @NotBlank(message = "Email name is mandatory")
  @Size(min = 4, max = 16, message = "Password should be between 4 and 16 chars")
  private String password;

}
