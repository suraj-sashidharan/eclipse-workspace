package edu.suraj.mydynamicwebproject;

import java.io.IOException;
import java.util.Locale;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class MyFirstTag implements Tag {
	
	private boolean check;
	private int kount;
	private Tag parentTag;
	private JspContext jspContext;

	@Override
	public int doEndTag() throws JspException {
		JspWriter jspWriter = jspContext.getOut();
		Locale locale = Locale.getDefault();
		try {
			jspWriter.write("<br/>");
			jspWriter.write("Country : " + locale.getCountry() + "<br/>");
			jspWriter.write("Display Country : " + locale.getDisplayCountry() + "<br/>");
			jspWriter.write("Language : " + locale.getLanguage() + "<br/>");
			jspWriter.write("Display Language : " + locale.getDisplayLanguage() + "<br/>");
			jspWriter.write("Locale : " + locale.getDisplayName() + "<br/>");			
			jspWriter.write("Locale : " + locale.toString() + "<br/>");
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		jspContext.setAttribute("bla", "blahblah");
		if (true) {
			return EVAL_PAGE;
		} else {
		    return SKIP_PAGE;
		}		
	}

	@Override
	public int doStartTag() throws JspException {
		System.out.println("MyFirstTag implements Tag (output below)");
		System.out.println("check = " + check);
		System.out.println("kount = " + kount);
		System.out.println("JspWriter buffer size : " + jspContext.getOut().getBufferSize() + " bytes");
		if(check) {
			return EVAL_BODY_INCLUDE;
		} else {
		    return SKIP_BODY;
		}
	}

	@Override
	public Tag getParent() {		
		return parentTag;
	}

	@Override
	public void release() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setPageContext(PageContext arg0) {
		jspContext = arg0;
	}

	@Override
	public void setParent(Tag arg0) {
		parentTag = arg0;
	}

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	public int getKount() {
		return kount;
	}

	public void setKount(int kount) {
		this.kount = kount;
	}

}
