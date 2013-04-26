package com.syf.lol.entity;

import java.util.ArrayList;

import android.util.Log;

public class HeroData
{
 public ArrayList<Hero> herodata;
 public HeroData()
 {
	 herodata=new ArrayList<Hero>();
 }
 public void addherobyString(String str)
 {
	 Hero hero=new Hero();
	 String s[]=str.split(",", -1);
	 hero.id=s[0];
	 hero.name=s[1];
	 hero.nameE=s[2];
	 hero.nickname=s[3];
	 hero.popname=s[4];
	 //---------------------------------
	 hero.damage=s[5];
	 hero.attackspeed=s[6];
	 hero.armor=s[7];
	 hero.attacklvl=s[8];
	 hero.armorlvl=s[9];
	 hero.radius=s[10];
	 //----------------------------
	 hero.life=s[11];
	 hero.liferec=s[12];
	 hero.lifereclvl=s[13];
	 hero.mana=s[14];
	 hero.manarec=s[15];
	 hero.manareclvl=s[16];
	 hero.speed=s[17];
	 hero.gold=s[18];
	 hero.vouncher=s[19];
	 //------------------------------
	 hero.lvl=s[20];
	 hero.type=s[21];
	 hero.guide=s[22];
	 hero.guideitem1=s[23];
	 hero.guideitem2=s[24];
	 hero.guideitem3=s[25];
	 hero.guideitem4=s[26];
	 hero.against=s[27];
	 hero.tip=s[28];
	 hero.lifelvl=s[29];
	 hero.manalvl=s[30];
	 herodata.add(hero);
 }
}
