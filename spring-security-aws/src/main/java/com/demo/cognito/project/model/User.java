package com.demo.cognito.project.model;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {
    private String accessToken;
    private String refreshToken;
    private String idToken;
}
