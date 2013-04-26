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

public class ItemAdapter extends BaseAdapter
{
	ItemData itemdata;
	Context context;
	Activity activity;
   public ItemAdapter(Context context)
   {
	   this.context=context;
	   Data data=App.getData(context);
	   itemdata=data.itemdata;
	   this.activity=(Activity)context;
   }
	@Override
	public int getCount()
	{
		return itemdata.itemdata.size();
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
		String idstr=itemdata.itemdata.get(position).id;
        String temp=idstr.substring(1);
		return Long.parseLong(temp);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{
		RelativeLayout itemview=(RelativeLayout) activity.getLayoutInflater().inflate(R.layout.item_item,null);
		ImageView img=(ImageView)itemview.getChildAt(0);
		TextView title=(TextView)itemview.getChildAt(1);
		Item item=itemdata.itemdata.get(position);
		img.setImageResource(context.getResources().getIdentifier(item.id,"drawable", "com.syf.lol"));
		title.setText(itemdata.itemdata.get(position).name);
		return itemview;
	}

}
