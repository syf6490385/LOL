package com.syf.lol.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

import com.syf.lol.R;
import com.syf.lol.adapter.ItemAdapter;
import com.syf.lol.entity.ItemData;
import com.syf.lol.listener.ItemItemListener;

public class ItemActivity extends Activity
{
   GridView itemview;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_item);
		itemview=(GridView)findViewById(R.id.activity_item_gridview);
		itemview.setAdapter(new ItemAdapter(this));
		itemview.setOnItemClickListener(new ItemItemListener(this));
	}



}
