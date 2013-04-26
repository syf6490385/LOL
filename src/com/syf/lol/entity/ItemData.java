package com.syf.lol.entity;

import java.util.ArrayList;

public class ItemData
{
  public ArrayList<Item> itemdata;
  public ItemData()
  {
	  itemdata=new ArrayList<Item>();
  }
  public void additembyString(String str)
  {
	  String s[]=str.split(",", -1);
	  Item item=new Item();
	  item.id=s[0];
	  item.name=s[1];
	  item.desc=s[2];
	  item.damage=s[3];
	  item.magicdamage=s[4];
	  item.armor=s[5];
	  item.magicarmor=s[6];
	  item.armorpenetration=s[7];
	  item.magicpenetration=s[8];
	  item.life=s[9];
	  item.mana=s[10];
	  item.attackspeed=s[11];
	  item.gold=s[12];
	  item.liferecovery=s[13];
	  item.manarecovery=s[14];
	  item.criticalrate=s[15];
	  item.speed=s[16];
	  item.lifesteal=s[17];
	  item.manasteal=s[18];
	  item.goldperseconds=s[19];
	  item.skill=s[20];
	  item.baseitem=s[21];
	  item.toitem=s[22];
	  item.type=s[23];
	  itemdata.add(item);	  
  }
}
