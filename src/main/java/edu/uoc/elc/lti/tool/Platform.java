package edu.uoc.elc.lti.tool;

import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashMap;

/**
 * @author xaracil@uoc.edu
 */
@Getter
@Setter
public class Platform {
	private String guid;
	private String name;
	private String contact_email;
	private String description;
	private String url;
	private String product_family_code;
	private String version;
	// Required in Canvas
	private LinkedHashMap errors;
	private String validation_context;
}
