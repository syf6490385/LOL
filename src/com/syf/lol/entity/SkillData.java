package com.syf.lol.entity;

import java.util.ArrayList;

import android.util.Log;

public class SkillData
{
  public ArrayList<Skill> skilldata;
  public SkillData()
  {
	  skilldata=new ArrayList<Skill>();
  }
  public void addskillbyString(String str)
  {
	  String s[]=str.split(",", -1);
	  Skill skill=new Skill();
	  skill.id=s[0];
	  skill.name=s[1];
	  skill.cd=s[2];
	  skill.mana=s[3];
	  skill.desc=s[4];
	  skilldata.add(skill);
	  
  }
}
