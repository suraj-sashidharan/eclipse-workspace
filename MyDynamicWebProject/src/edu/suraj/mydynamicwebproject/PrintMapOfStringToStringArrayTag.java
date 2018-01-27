package edu.suraj.mydynamicwebproject;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class PrintMapOfStringToStringArrayTag extends SimpleTagSupport {
	private Map<String, String[]> map;
	private String caption;
	
	public void setMap(Map<String, String[]> arg0) {
		map = arg0;
		System.out.println(map==null ? "headerMap null":"headerMap not null");
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	
	public void doTag() {
		try {
			JspWriter jspWriter = getJspContext().getOut();
			jspWriter.write("<table>");
			jspWriter.write("<caption>");
			jspWriter.write(caption);
			jspWriter.write("</caption>");
			Set<Map.Entry<String, String[]>> entrySet = map.entrySet();
			for(Map.Entry<String, String[]> entry:entrySet) {
				jspWriter.write("<tr><td>");
				String headerName = (String) entry.getKey();
				jspWriter.write(headerName);
				jspWriter.write("</td><td>");								
				jspWriter.write(valuesAsCommaSeparatedString(entry.getValue()));
				jspWriter.write("</td></tr>");
			}
			jspWriter.write("</table>");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	private String valuesAsCommaSeparatedString(String[] values) {
		StringBuilder sb = new StringBuilder();
		for(int index=0;index<values.length;index++) {		
			if (index > 0) {
				sb.append(",");
			}
			sb.append(values[index]);
		}
		return sb.toString();
	}
}