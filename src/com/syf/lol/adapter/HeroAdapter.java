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
import com.syf.lol.entity.Hero;
import com.syf.lol.entity.HeroData;

public class HeroAdapter extends BaseAdapter
{
	HeroData herodata;
	Context context;
	Activity activity;
   public HeroAdapter(Context context)
   {
	   this.context=context;
	   Data data=App.getData(context);
	   herodata=data.herodata;
	   this.activity=(Activity)context;
   }
	@Override
	public int getCount()
	{
		return herodata.herodata.size();
		//return newsdata.getnewscount();
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
		String idstr=herodata.herodata.get(position).id;
        String temp=idstr.substring(1);
		return Long.parseLong(temp);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{
		RelativeLayout itemview=(RelativeLayout) activity.getLayoutInflater().inflate(R.layout.item_hero,null);
		ImageView img=(ImageView)itemview.getChildAt(0);
		TextView title=(TextView)itemview.getChildAt(1);
		Hero hero=herodata.herodata.get(position);
		img.setImageResource(context.getResources().getIdentifier(hero.id,"drawable", "com.syf.lol"));
		title.setText(hero.name);
		return itemview;
	}

}
