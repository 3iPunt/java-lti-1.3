package edu.uoc.elc.lti.tool;

import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;

/**
 * @author xaracil@uoc.edu
 */
@Getter
@Builder
public class ToolDefinition implements Serializable {
	private String clientId;
	private String name;
	private String platform;
	private String keySetUrl;
	private String accessTokenUrl;
	private String oidcAuthUrl;
	private String privateKey;
	private String publicKey;
	private String deploymentId;
}
