package com.example.ExpenseManagement.DTO;


public class AuthResponseDTO {
    private String accessToken;
    private String refreshToken;
    private UserDTO user;
       
    
	public AuthResponseDTO() {
		super();
	}

	public AuthResponseDTO(String accessToken, String refreshToken, UserDTO user) {
		super();
		this.accessToken = accessToken;
		this.refreshToken = refreshToken;
		this.user = user;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}
    
    
    
}

