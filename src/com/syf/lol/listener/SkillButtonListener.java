package com.syf.lol.listener;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

import com.syf.lol.R;
import com.syf.lol.dialog.SkillDialog;

public class SkillButtonListener implements OnClickListener
{
    String heroid;
    Context context;
    public SkillButtonListener(Context context,String heroid)
    {
    	this.heroid=heroid;
    	this.context=context;
    }
	@Override
	public void onClick(View v)
	{
	 ImageButton btn=(ImageButton)v;
	 String skillid=heroid+(String)btn.getTag();
	 SkillDialog dialog=new SkillDialog(context,R.layout.dialog_skill,skillid);
     dialog.show();
		
	}

}
