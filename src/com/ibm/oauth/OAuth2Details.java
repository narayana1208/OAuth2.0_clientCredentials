package com.ibm.oauth;
public class OAuth2Details {

	private String scope;
	private String grantType;
	private String clientId;
	private String clientSecret;
	private String accessToken;
	private String refreshToken;
	private String username;
	private String password;
	private String authenticationServerUrl;
	private String resourceServerUrl;
	private String requestServerUrl;
	private boolean isAccessTokenRequest;
	
	
	
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	public String getGrantType() {
		return grantType;
	}
	public void setGrantType(String grantType) {
		System.out.println(" Setting Grant Type:- "+grantType);
		this.grantType = grantType;
	}
	public String getClientId() {
		System.out.println("sending Client id");
		return clientId;
	}
	public void setClientId(String clientId) {
		System.out.println("setting client id :- "+clientId);
		this.clientId = clientId;
	}
	public String getClientSecret() {
		return clientSecret;
	}
	public void setClientSecret(String clientSecret) {
		System.out.println("Setting Client secret :-"+clientSecret);
		this.clientSecret = clientSecret;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		System.out.println("setting access token :-"+accessToken);
		this.accessToken = accessToken;
	}
	public String getRefreshToken() {
		return refreshToken;
	}
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	public String getAuthenticationServerUrl() {
		return authenticationServerUrl;
	}
	public void setAuthenticationServerUrl(String authenticationServerUrl) {
		this.authenticationServerUrl = authenticationServerUrl;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isAccessTokenRequest() {
		System.out.println("sending access token request  "+isAccessTokenRequest);
		return isAccessTokenRequest;
	}
	public void setAccessTokenRequest(boolean isAccessTokenRequest) {
		System.out.println(" Access token request has been set");
		this.isAccessTokenRequest = isAccessTokenRequest;
	}
	public String getResourceServerUrl() {
		return resourceServerUrl;
	}
	public void setResourceServerUrl(String resourceServerUrl) {
		this.resourceServerUrl = resourceServerUrl;
	}
	
	public String getRequestServerUrl() {
		return requestServerUrl;
	}
	public void setRequestServerUrl(String resourceServerUrl) {
		this.requestServerUrl = resourceServerUrl;
	}
}
