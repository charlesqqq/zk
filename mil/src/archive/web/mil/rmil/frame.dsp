<%--
frame.dsp

{{IS_NOTE
	Purpose:
		
	Description:

	History:
		Tue May 22 18:13:12     2007, Created by henrichen
}}IS_NOTE

Copyright (C) 2007 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
	This program is distributed under GPL Version 2.0 in the hope that
	it will be useful, but WITHOUT ANY WARRANTY.
}}IS_RIGHT
--%><%@ taglib uri="http://www.zkoss.org/dsp/web/core" prefix="c" %>
<%@ taglib uri="http://www.zkoss.org/dsp/zk/core" prefix="z" %>
<c:set var="self" value="${requestScope.arg.self}"/>
<fr id="${self.uuid}" ${self.outerAttrs}${self.innerAttrs}>
<c:forEach var="child" items="${self.children}">
${z:redraw(child, null)}
</c:forEach>
</fr>