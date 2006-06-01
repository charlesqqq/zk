/* LiteNameSpace.java

{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
		Thu Jun  1 15:37:04     2006, Created by tomyeh@potix.com
}}IS_NOTE

Copyright (C) 2006 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
	This program is distributed under GPL Version 2.0 in the hope that
	it will be useful, but WITHOUT ANY WARRANTY.
}}IS_RIGHT
*/
package com.potix.zk.ui.impl.bsh;

import bsh.NameSpace;

/**
 * A light-weight namespace that never imports the default packages.
 *
 * @author <a href="mailto:tomyeh@potix.com">tomyeh@potix.com</a>
 */
/*package*/ class LiteNameSpace extends NameSpace {
	/*package*/ LiteNameSpace(NameSpace parent, String id) {
		super(parent, id);
	}
    public void loadDefaultImports() {
    	 //to speed up the formance
    }
}
