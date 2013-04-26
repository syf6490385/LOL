package com.syf.lol.datafactory;

import android.content.Context;

import com.syf.lol.entity.Data;
import com.syf.lol.entity.Hero;
import com.syf.lol.entity.HeroData;
import com.syf.lol.entity.Item;
import com.syf.lol.entity.ItemData;
import com.syf.lol.entity.News;
import com.syf.lol.entity.NewsData;
import com.syf.lol.entity.RuneData;
import com.syf.lol.entity.SkillData;
import com.syf.lol.until.XMLParser;

public class DataFactory
{
 public static Data getData(Context context)
 {
	 HeroData herodata=XMLParser.getherodata(context);
	 ItemData itemdata=XMLParser.getitemdata(context);
	 SkillData skilldata=XMLParser.getskilldata(context);
	 RuneData runedata=XMLParser.getrunedata(context);
	 
	 
	 NewsData newsdata=new NewsData();
     newsdata.newsdata.add(new News("n1","生化魔人扎克上线!","热烈祝贺生化魔人扎克上线!","target1"));
	 newsdata.newsdata.add(new News("n2","最新排位系统","s3赛季迎来了新的排位系统","target2"));
	 newsdata.newsdata.add(new News("n3","排位小队详解","新的排位系统支持组建自己的小队了哦","target3"));
	 newsdata.newsdata.add(new News("n4","新版本发布!","本软件最新版本,敬请下载","target4"));
	 Data data=new Data(herodata,itemdata,newsdata,skilldata,runedata);
	 return data;
	 
 }
}
