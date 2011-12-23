/* 

{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
}}IS_NOTE

Copyright (C) 2011 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
}}IS_RIGHT
*/
package org.zkoss.zktest.bind.component

import org.zkoss.zstl.ZTL4ScalaTestCase
import org.zkoss.ztl.ZKSeleneseTestCase
import org.openqa.selenium.Keys
import org.zkoss.ztl.Tags

/**
 * @author Hawk
 */
@Tags(tags = "zbind")
class Z60_MenuitemTest extends ZTL4ScalaTestCase {
  def testComponent() = {
    val zul = {
    		<include src="bind/component/menuitem.zul"/>
    }
    runZTL(zul, () => {
    
      //button
      val checked = engine $f "checked"
      ZKSeleneseTestCase.assertEquals("false", getText(checked));
      click(jq("@menu"))
      waitResponse()
      click(jq("@menuitem"))
      waitResponse()
      ZKSeleneseTestCase.assertEquals("true", getText(checked));
    })
  }
}