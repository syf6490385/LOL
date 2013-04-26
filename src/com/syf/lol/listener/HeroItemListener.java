package com.syf.lol.listener;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

import com.syf.lol.R;
import com.syf.lol.app.App;
import com.syf.lol.dialog.HeroInfoDialog;
import com.syf.lol.dialog.ItemDialog;

public class HeroItemListener implements OnItemClickListener
{
   Context context;
   public HeroItemListener(Context context)
   {
	   this.context=context;
   }
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id)
	{
		String idstr="h"+Long.toString(id);
	    HeroInfoDialog dialog=new HeroInfoDialog(context,R.layout.dialog_hero_info,idstr);
		dialog.show();
		
		
	}

}
