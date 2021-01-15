package edu.uoc.elc.lti.tool;

import edu.uoc.lti.accesstoken.AccessTokenRequestBuilder;
import edu.uoc.lti.clientcredentials.ClientCredentialsTokenBuilder;
import edu.uoc.lti.deeplink.DeepLinkingTokenBuilder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

/**
 * @author xaracil@uoc.edu
 */
@RequiredArgsConstructor
@Getter
public class ToolBuilders implements Serializable {
	private final ClientCredentialsTokenBuilder clientCredentialsTokenBuilder;
	private final AccessTokenRequestBuilder accessTokenRequestBuilder;
	private final DeepLinkingTokenBuilder deepLinkingTokenBuilder;
}
