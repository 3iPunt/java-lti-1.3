package edu.uoc.elc.lti.platform.accesstoken;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.io.Serializable;

/**
 * @author xaracil@uoc.edu
 */
@Getter
public class AccessTokenResponse  implements Serializable {
	private String scope;

	@JsonProperty("access_token")
	private String accessToken;

	@JsonProperty("token_type")
	private String tokenType;

	@JsonProperty("expires_in")
	private int expiresIn;
}
