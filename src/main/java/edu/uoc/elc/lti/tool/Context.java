package edu.uoc.elc.lti.tool;

import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author xaracil@uoc.edu
 */
@Getter
@Setter
public class Context {
	private String id;
	private String label;
	private String title;
	private List<String> type;
	// Required in Canvas
	private LinkedHashMap errors;
	private String validation_context;

}
