package com.syf.lol.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

import com.syf.lol.R;
import com.syf.lol.adapter.HeroAdapter;
import com.syf.lol.entity.HeroData;
import com.syf.lol.listener.HeroItemListener;

public class HeroActivity extends Activity
{
    GridView heroview;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hero);
		heroview=(GridView)findViewById(R.id.activity_hero_gridview);
		heroview.setAdapter(new HeroAdapter(this));
		heroview.setOnItemClickListener(new HeroItemListener(this));
	}


}
