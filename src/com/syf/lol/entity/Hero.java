package com.syf.lol.entity;

public class Hero
{
 public String id,name,nameE,nickname,popname; //名称信息 共计5个
 public String damage,attackspeed,armor,attacklvl,armorlvl,radius; //属性信息(模拟相关) 共计6个
 public String life,liferec,lifereclvl,mana,manarec,manareclvl,speed,gold,vouncher;//基础属性信息 共计9个
 public String lvl,type,guide,guideitem1,guideitem2,guideitem3,guideitem4,against,tip;//主观信息 共计9个
 public String lifelvl,manalvl; //新增加的
 public Hero()
 {  }
 public Hero(String id,String name)
 {
	 this.id=id;
	 this.name=name;
 }

}
