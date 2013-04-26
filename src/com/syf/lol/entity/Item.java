package com.syf.lol.entity;

import java.util.ArrayList;

public class Item
{
  public String id;
  public String name;
  public String desc;
  public String damage;
  public String magicdamage;
  public String armor;
  public String magicarmor;
  public String armorpenetration;
  public String magicpenetration;
  public String life;
  public String mana;
  public String attackspeed;
  public String gold;
  public String liferecovery;
  public String manarecovery;
  public String criticalrate;
  public String speed;
  public String lifesteal;
  public String manasteal;
  public String goldperseconds;
  public String skill;
  public String baseitem;
  public String toitem;
  public String type;    //ad ap 近战 远程 辅助 坦克 1 2 3 4 5 6
  public Item()
  { 
	  
  }
  public Item(String id,String name)
  {
	  this.id=id;
	  this.name=name;
  }
  
}
