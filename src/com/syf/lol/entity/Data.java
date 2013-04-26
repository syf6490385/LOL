package com.syf.lol.entity;

public class Data
{
  public  HeroData herodata;
  public ItemData itemdata;
  public NewsData newsdata;
  public SkillData skilldata;
  public RuneData runedata;
  public Data(HeroData herodata,ItemData itemdata,NewsData newsdata,SkillData skilldata,RuneData runedata)
  {
	  this.herodata=herodata;
	  this.itemdata=itemdata;
	  this.newsdata=newsdata;
	  this.skilldata=skilldata;
	  this.runedata=runedata;
  }
  public Hero getHerobyId(String id)
  {
	  for(int i=0;i<herodata.herodata.size();i++)
	  {
		 Hero hero=herodata.herodata.get(i);
		 if(id.equals(hero.id))
		 {
			 return hero;
		 }
	  }
	  return null;
  }
  public News getNewsbyId(String id)
  {
	  for(int i=0;i<newsdata.newsdata.size();i++)
	  {
		 News news=newsdata.newsdata.get(i);
		 if(id.equals(news.id))
		 {
			 return news;
		 }
	  }
	  return null;
  }
  public Item getItembyId(String id)
  {
	  for(int i=0;i<itemdata.itemdata.size();i++)
	  {
		 Item item=itemdata.itemdata.get(i);
		 if(id.equals(item.id))
		 {
			 return item;
		 }
	  }
	  return null;
  }
  public Skill getSkillbyId(String id)
  {
	  for(int i=0;i<skilldata.skilldata.size();i++)
	  {
		Skill skill=skilldata.skilldata.get(i);
		 if(id.equals(skill.id))
		 {
			 return skill;
		 }
	  }
	  return null;
  }
  public Rune getRunebyId(String id)
  {
	  for(int i=0;i<skilldata.skilldata.size();i++)
	  {
		Rune rune=runedata.runedata.get(i);
		 if(id.equals(rune.id))
		 {
			 return rune;
		 }
	  }
	  return null;
  }
}
