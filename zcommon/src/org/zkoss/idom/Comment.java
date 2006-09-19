/* Comment.java

{{IS_NOTE

	Purpose: 
	Description: 
	History:
	2001/10/22 20:55:39, Create, Tom M. Yeh.
}}IS_NOTE

Copyright (C) 2001 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
	This program is distributed under GPL Version 2.0 in the hope that
	it will be useful, but WITHOUT ANY WARRANTY.
}}IS_RIGHT
*/
package org.zkoss.idom;

import org.zkoss.idom.impl.*;

/**
 * The iDOM Comment.
 *
 * @author <a href="mailto:tomyeh@potix.com">Tom M. Yeh</a>
 */
public class Comment extends AbstractTextual implements org.w3c.dom.Comment {
	/** Constructor.
	 */
	public Comment(String text) {
		super(text);
	}
	/** Constructor.
	 */
	public Comment() {
	}

	//-- AbstractTextual --//
	/**
	 * Returns false to denote it is not part of parent's text,
	 */
	public final boolean isPartOfParentText() {
		return false;
	}
	protected void checkText(String text) {
		Verifier.checkCommentData(text, getLocator());
	}

	//-- Item --//
	public final String getName() {
		return "#comment";
	}

	//-- Node --//
	public final short getNodeType() {
		return COMMENT_NODE;
	}
}
