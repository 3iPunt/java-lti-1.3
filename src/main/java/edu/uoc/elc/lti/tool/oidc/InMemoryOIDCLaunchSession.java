package edu.uoc.elc.lti.tool.oidc;

import edu.uoc.lti.oidc.OIDCLaunchSession;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author xaracil@uoc.edu
 */
@Getter
@Setter
public class InMemoryOIDCLaunchSession implements OIDCLaunchSession, Serializable {
	private String state;
	private String nonce;
	private String targetLinkUri;
}
