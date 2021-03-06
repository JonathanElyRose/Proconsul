package edu.duke.oit.idms.proconsul;

public class UserSessionRequest {
	// POJO to hold references from a User Session request
	//
	String targetFQDN;
	String displayName;
	String csrfToken;
	String resolution;

	public String getCsrfToken() {
		return csrfToken;
	}

	public void setCsrfToken(String csrfToken) {
		this.csrfToken = csrfToken;
	}

	public String getTargetFQDN() {
		return targetFQDN;
	}

	public void setTargetFQDN(String targetFQDN) {
		this.targetFQDN = targetFQDN;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	
	public String getResolution() {
		return resolution;
	}
	
	public void setResolution(String res) {
		this.resolution = res;
	}
	
}
