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
import com.syf.lol.entity.NewsData;

public class NewsAdapter extends BaseAdapter
{
	NewsData newsdata;
	Context context;
	Activity activity;
   public NewsAdapter(Context context)
   {
	   this.context=context;
	   Data data=App.getData(context);
	   newsdata=data.newsdata;
	   this.activity=(Activity)context;
   }
	@Override
	public int getCount()
	{
		return newsdata.newsdata.size();
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
        String idstr=newsdata.newsdata.get(position).id;
        String temp=idstr.substring(1);
		return Long.parseLong(temp);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{
		RelativeLayout itemview=(RelativeLayout) activity.getLayoutInflater().inflate(R.layout.item_news,null);
		ImageView img=(ImageView)itemview.getChildAt(0);
		TextView title=(TextView)itemview.getChildAt(1);
		title.setText(newsdata.newsdata.get(position).title);
		return itemview;
	}

}
