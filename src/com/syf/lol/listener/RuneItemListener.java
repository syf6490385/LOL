package com.syf.lol.listener;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

import com.syf.lol.R;
import com.syf.lol.dialog.ItemDialog;
import com.syf.lol.dialog.NewsDialog;
import com.syf.lol.dialog.RuneDialog;

public class RuneItemListener implements OnItemClickListener
{
   Context context;
   public RuneItemListener(Context context)
   {
	   this.context=context;
   }
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id)
	{
		String idstr="r"+Long.toString(id);
	    RuneDialog dialog=new RuneDialog(context,R.layout.dialog_rune,idstr);
		dialog.show();
	}

}
