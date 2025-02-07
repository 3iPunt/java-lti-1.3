package edu.uoc.elc.lti.tool;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author xaracil@uoc.edu
 */
@Getter
@Setter
public class NamesRoleService implements Serializable {
	private String context_memberships_url;
	private List<String> service_versions;
	// Required in Canvas
	private LinkedHashMap errors;
	private String validation_context;
}
