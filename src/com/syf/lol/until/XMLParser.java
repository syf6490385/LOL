package com.syf.lol.until;

import java.io.InputStream;
import java.util.ArrayList;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

import android.content.Context;
import android.util.Log;

import com.syf.lol.entity.HeroData;
import com.syf.lol.entity.ItemData;
import com.syf.lol.entity.RuneData;
import com.syf.lol.entity.SkillData;

public class XMLParser
{
	public static HeroData getherodata(Context context)
	{
		ArrayList<String> strlist;
		InputStream input;
		 XMLHandler handler=null;
		HeroData herodata=new HeroData();
		try
		{
			input=context.getResources().getAssets().open("data/herodata.xml");
			SAXParserFactory factory = SAXParserFactory.newInstance();  
	        SAXParser parser = factory.newSAXParser();  
	        XMLReader reader = parser.getXMLReader();  
	        handler=new XMLHandler();
	        reader.setContentHandler(handler);  
	        reader.parse(new InputSource(input));  
		} 
		catch (Exception e)
		{
		}
		strlist=handler.getstrdata();
		for(int i=0;i<strlist.size();i++)
		{
			herodata.addherobyString(strlist.get(i));
		}
		return herodata;
	}
	public static ItemData getitemdata(Context context)
	{
		ArrayList<String> strlist;
		InputStream input;
		XMLHandler handler=null;
		ItemData itemdata=new ItemData();
		try
		{
			input=context.getResources().getAssets().open("itemdata.xml");
			SAXParserFactory factory = SAXParserFactory.newInstance();  
	        SAXParser parser = factory.newSAXParser();  
	        XMLReader reader = parser.getXMLReader();  
	        handler=new XMLHandler();
	        reader.setContentHandler(handler);  
	        reader.parse(new InputSource(input));  
		} 
		catch (Exception e)
		{
		}
		strlist=handler.getstrdata();
		for(int i=0;i<strlist.size();i++)
		{
			itemdata.additembyString(strlist.get(i));
		}
		return itemdata;
	}
	public static SkillData getskilldata(Context context)
	{
		ArrayList<String> strlist;
		InputStream input;
		XMLHandler handler=null;
		SkillData skilldata=new SkillData();
		try
		{
			input=context.getResources().getAssets().open("skilldata.xml");
			SAXParserFactory factory = SAXParserFactory.newInstance();  
	        SAXParser parser = factory.newSAXParser();  
	        XMLReader reader = parser.getXMLReader();  
	        handler=new XMLHandler();
	        reader.setContentHandler(handler);  
	        reader.parse(new InputSource(input));  
		} 
		catch (Exception e)
		{
		}
		strlist=handler.getstrdata();
		for(int i=0;i<strlist.size();i++)
		{
			skilldata.addskillbyString(strlist.get(i));
		}
		return skilldata;
	}
	public static RuneData getrunedata(Context context)
	{
		ArrayList<String> strlist;
		InputStream input;
		XMLHandler handler=null;
		RuneData runedata=new RuneData();
		try
		{
			input=context.getResources().getAssets().open("runedata.xml");
			SAXParserFactory factory = SAXParserFactory.newInstance();  
	        SAXParser parser = factory.newSAXParser();  
	        XMLReader reader = parser.getXMLReader();  
	        handler=new XMLHandler();
	        reader.setContentHandler(handler);  
	        reader.parse(new InputSource(input));  
		} 
		catch (Exception e)
		{
		}
		strlist=handler.getstrdata();
		for(int i=0;i<strlist.size();i++)
		{
			runedata.addrunebyString(strlist.get(i));
		}
		return runedata;
	}
}
