package com.example.twitterApi.Security;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class JWTResponseDto {
	
	private String accessToken;
	
	private String refreshToken;

}
