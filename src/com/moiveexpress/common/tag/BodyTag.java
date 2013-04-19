package com.moiveexpress.common.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class BodyTag extends SimpleTagSupport {
    public void doTag() throws JspException, IOException{
        getJspContext().setAttribute("test","this is a test value");
           getJspBody().invoke(null);
    }
}