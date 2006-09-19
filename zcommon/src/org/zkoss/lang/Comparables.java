/*	Comparables.java

{{IS_NOTE

	Purpose:
	Description:
	History:
		2001/11/23, Henri Chen: Created.

}}IS_NOTE

Copyright (C) 2001 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
	This program is distributed under GPL Version 2.0 in the hope that
	it will be useful, but WITHOUT ANY WARRANTY.
}}IS_RIGHT
*/

package org.zkoss.lang;

/**
 * Utilities regarding Comparable type objects.
 *
 * @author <a href="mailto:henrichen@potix.com">Henri Chen</a>
 */
public final class Comparables {
	/**
	 * Given two comparables, return the minimum of the two.
	 * Note that the two Comparable must be with compatible type, or a
	 * ClassCastException might be thrown.
	 */
	public static final Comparable min(Comparable a, Comparable b) {
		return  (a.compareTo(b) < 0) ? a : b;
	}

	/**
	 * Given two comparables, return the maximum of the two.
	 * Note that the two Comparable must be with compatible type, or a
	 * ClassCastException might be thrown.
	 */
	public static final Comparable max(Comparable a, Comparable b) {
		return  (a.compareTo(b) < 0) ? b : a;
	}
}
