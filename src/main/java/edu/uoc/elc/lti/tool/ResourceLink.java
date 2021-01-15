package edu.uoc.elc.lti.tool;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author xaracil@uoc.edu
 */
@Getter
@Setter
public class ResourceLink implements Serializable {
	private String id;
	private String title;
	private String description;
}
