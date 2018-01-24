package edu.suraj.mydynamicwebproject;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class MyFirstTag implements Tag {
	
	private boolean check;
	private int kount;
	private Tag parentTag;
	private JspContext jspContext;

	@Override
	public int doEndTag() throws JspException {
		if (true) {
			return EVAL_PAGE;
		} else {
		    return SKIP_PAGE;
		}		
	}

	@Override
	public int doStartTag() throws JspException {
		System.out.println(check);
		System.out.println(kount);
		if(check) {
			return EVAL_BODY_INCLUDE;
		} else {
		    return SKIP_BODY;
		}
	}

	@Override
	public Tag getParent() {
		// TODO Auto-generated method stub
		return null;
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
