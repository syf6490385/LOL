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

public class ItemItemListener implements OnItemClickListener
{
   Context context;
   public ItemItemListener(Context context)
   {
	   this.context=context;
   }
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id)
	{
		String idstr="i"+Long.toString(id);
	    ItemDialog dialog=new ItemDialog(context,R.layout.dialog_item,idstr);
		dialog.show();
	}

}
