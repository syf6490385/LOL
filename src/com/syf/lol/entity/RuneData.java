package com.syf.lol.entity;

import java.util.ArrayList;

public class RuneData
{
 public ArrayList<Rune> runedata;
 public RuneData()
 {
	 runedata=new ArrayList<Rune>();
 }
 public void addrunebyString(String str)
 {
	 Rune rune=new Rune();
	 String s[]=str.split(",", -1);
	 rune.id=s[0];
	 rune.name=s[1];
	 rune.gold=s[2];
	 rune.desc=s[3];
	 rune.runetype=s[4];
	 rune.type=s[5];
	 runedata.add(rune);
}

}
