package edu.uoc.elc.lti.tool.deeplinking;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author xaracil@uoc.edu
 */
@Getter
@Setter
public class Settings {
	private List<String> accept_types;
	private String accept_media_types;
	private List<String> accept_presentation_document_targets;
	private boolean accept_multiple;
	private boolean auto_create;
	private String title;
	private String text;
	private String data;
	private String deep_link_return_url;
	// Required in Canvas
	private LinkedHashMap errors;
	private String validation_context;
	// Required in Moodle
	private boolean accept_copy_advice;
	private boolean accept_unsigned;
	private boolean can_confirm;
}
