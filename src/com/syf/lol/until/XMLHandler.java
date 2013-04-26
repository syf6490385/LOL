package com.syf.lol.until;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import android.util.Log;

public class XMLHandler extends DefaultHandler
{
    ArrayList<String> strdata;
	public XMLHandler()
	{
		super();
		strdata=new ArrayList<String>();
	}
	public void characters (char ch[], int start, int length)
		    throws SAXException
		    {
		    String result="";
		    if(length<10){     }
		    else
		    {
		    for(;start<length;start++)
		    {
		    	result=result+ch[start];
		    }
		    strdata.add(result);
		    }
		    }
	public ArrayList<String> getstrdata()
	{
		return strdata;
	}
 

}
