package com.syf.lol.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.syf.lol.R;
import com.syf.lol.app.App;
import com.syf.lol.entity.Item;
import com.syf.lol.entity.Skill;

public class SkillDialog extends Dialog
{
	String id;
	Skill skill;
	RelativeLayout layout;
	ImageView imgview;
	TextView nameview,cdview,manaview,descview;
	Context context;
    public SkillDialog(Context context, int theme,String id)
	{
		super(context, theme);
		this.id=id;
		this.context=context;
		App app=(App)context.getApplicationContext();
		skill=app.getData().getSkillbyId(id);
		WindowManager.LayoutParams lp = this.getWindow().getAttributes();
		lp.height=480;
		lp.width=340;
		this.getWindow().setAttributes(lp);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_skill);
        layout=(RelativeLayout)findViewById(R.id.dialog_item_attrlayout);
        imgview=(ImageView)findViewById(R.id.skillimg);
        nameview=(TextView)findViewById(R.id.skillname);
        cdview=(TextView)findViewById(R.id.skillcd);
        manaview=(TextView)findViewById(R.id.skillmana);
        descview=(TextView)findViewById(R.id.skilldesc);
        imgview.setImageResource(context.getResources().getIdentifier(skill.id,"drawable", "com.syf.lol"));
        nameview.setText(skill.name);
        cdview.setText(skill.cd);
        manaview.setText(skill.mana);
        descview.setText(Html.fromHtml(skill.desc));

	}




}
