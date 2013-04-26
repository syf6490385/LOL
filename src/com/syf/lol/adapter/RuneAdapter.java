package com.syf.lol.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.syf.lol.R;
import com.syf.lol.app.App;
import com.syf.lol.entity.Data;
import com.syf.lol.entity.Item;
import com.syf.lol.entity.ItemData;
import com.syf.lol.entity.Rune;
import com.syf.lol.entity.RuneData;

public class RuneAdapter extends BaseAdapter
{
	RuneData runedata;
	Context context;
	Activity activity;
   public RuneAdapter(Context context)
   {
	   this.context=context;
	   Data data=App.getData(context);
	   runedata=data.runedata;
	   this.activity=(Activity)context;
   }
	@Override
	public int getCount()
	{
		return runedata.runedata.size();
	}

	@Override
	public Object getItem(int position)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position)
	{
		String idstr=runedata.runedata.get(position).id;
        String temp=idstr.substring(1);
		return Long.parseLong(temp);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{
		RelativeLayout runeview=(RelativeLayout) activity.getLayoutInflater().inflate(R.layout.item_rune,null);
		ImageView img=(ImageView)runeview.getChildAt(0);
		TextView title=(TextView)runeview.getChildAt(1);
		Rune rune=runedata.runedata.get(position);
		img.setImageResource(context.getResources().getIdentifier(rune.id,"drawable", "com.syf.lol"));
		title.setText(runedata.runedata.get(position).name);
		return runeview;
	}

}
