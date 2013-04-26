package com.syf.lol.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.syf.lol.R;
import com.syf.lol.app.App;
import com.syf.lol.customview.ItemView;
import com.syf.lol.entity.Hero;
import com.syf.lol.listener.SkillButtonListener;

public class HeroInfoDialog extends Dialog
{
	Context context;
	Hero hero;
    TextView nameview,nameEview,popnameview;
    TextView lifeview,liferecview,manaview,manarecview,damageview,armorview,attackspeedview,speedview,radiusview;
    TextView goldview,vouncherview,lvlview,typeview,guideview,againstview,tipview;
    ImageButton skill1btn,skill2btn,skill3btn,skill4btn,skill0btn;
    ImageView heroimg;
    ItemView itemview1,itemview2,itemview3,itemview4;
    public HeroInfoDialog(Context context, int theme,String id) {
    	super(context,theme);
    	App app=(App)context.getApplicationContext();
    	hero=app.getData().getHerobyId(id);
    	this.context=context;
    }
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dialog_hero_info);
		initView();
		heroimg.setImageResource(context.getResources().getIdentifier(hero.id,"drawable", "com.syf.lol"));
		Log.e("test", hero.guideitem1);
		nameview.setText(hero.name);
		nameEview.setText(hero.nameE);
		popnameview.setText(hero.popname);
		lifeview.setText(hero.life+"+"+hero.lifelvl+"每级");
		liferecview.setText(hero.liferec+"+"+hero.lifereclvl+"每级");
		manaview.setText(hero.mana+"+"+hero.manalvl+"每级");
		manarecview.setText(hero.manarec+"+"+hero.manareclvl+"每级");
		damageview.setText(hero.damage);
		armorview.setText(hero.armor+"+"+hero.armorlvl+"每级");
		attackspeedview.setText(hero.attackspeed);
		speedview.setText(hero.speed);
		radiusview.setText(hero.radius);
		goldview.setText(hero.gold);
		vouncherview.setText(hero.vouncher);
		lvlview.setText(hero.lvl);
		typeview.setText(hero.type);
		guideview.setText(hero.guide);
		againstview.setText(hero.against);
		tipview.setText(hero.tip);
		itemview1.init("优势ad出装",hero.guideitem1);
		itemview2.init("优势ap出装",hero.guideitem2);
		itemview3.init("劣势ad出装",hero.guideitem3);
		itemview4.init("劣势ap出装",hero.guideitem4);
		skill0btn.setImageResource(context.getResources().getIdentifier(hero.id+"s0","drawable", "com.syf.lol"));
		skill1btn.setImageResource(context.getResources().getIdentifier(hero.id+"s1","drawable", "com.syf.lol"));
		skill2btn.setImageResource(context.getResources().getIdentifier(hero.id+"s2","drawable", "com.syf.lol"));
		skill3btn.setImageResource(context.getResources().getIdentifier(hero.id+"s3","drawable", "com.syf.lol"));
		skill4btn.setImageResource(context.getResources().getIdentifier(hero.id+"s4","drawable", "com.syf.lol"));
		SkillButtonListener listener=new SkillButtonListener(context,hero.id);
		skill1btn.setOnClickListener(listener);
		skill2btn.setOnClickListener(listener);
		skill3btn.setOnClickListener(listener);
		skill4btn.setOnClickListener(listener);
		skill0btn.setOnClickListener(listener);
	}
	private void initView()
	{
		nameview=(TextView)findViewById(R.id.name);
		nameEview=(TextView)findViewById(R.id.nameE);
		popnameview=(TextView)findViewById(R.id.popname);
		lifeview=(TextView)findViewById(R.id.life);
		liferecview=(TextView)findViewById(R.id.liferec);
		manaview=(TextView)findViewById(R.id.mana);
		manarecview=(TextView)findViewById(R.id.manarec);
		damageview=(TextView)findViewById(R.id.damage);
		armorview=(TextView)findViewById(R.id.armor);
		attackspeedview=(TextView)findViewById(R.id.attackspeed);
		speedview=(TextView)findViewById(R.id.speed);
		radiusview=(TextView)findViewById(R.id.radius);
		goldview=(TextView)findViewById(R.id.gold);
		vouncherview=(TextView)findViewById(R.id.vouncher);
		guideview=(TextView)findViewById(R.id.guideview);
		againstview=(TextView)findViewById(R.id.againstview);
		tipview=(TextView)findViewById(R.id.tipview);
		lvlview=(TextView)findViewById(R.id.lvl);
		typeview=(TextView)findViewById(R.id.type);
		heroimg=(ImageView)findViewById(R.id.heroimg);
		skill0btn=(ImageButton)findViewById(R.id.skillbtn0);
		skill1btn=(ImageButton)findViewById(R.id.skillbtn1);
		skill2btn=(ImageButton)findViewById(R.id.skillbtn2);
		skill3btn=(ImageButton)findViewById(R.id.skillbtn3);
		skill4btn=(ImageButton)findViewById(R.id.skillbtn4);
		itemview1=(ItemView)findViewById(R.id.guideitem1);
		itemview2=(ItemView)findViewById(R.id.guideitem2);
		itemview3=(ItemView)findViewById(R.id.guideitem3);
		itemview4=(ItemView)findViewById(R.id.guideitem4);
	}

}
