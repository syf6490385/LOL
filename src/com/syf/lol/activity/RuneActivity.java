package com.syf.lol.activity;

import com.syf.lol.R;
import com.syf.lol.adapter.ItemAdapter;
import com.syf.lol.adapter.RuneAdapter;
import com.syf.lol.listener.ItemItemListener;
import com.syf.lol.listener.RuneItemListener;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.GridView;

public class RuneActivity extends Activity
{
	GridView runeview;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rune);
		runeview=(GridView)findViewById(R.id.activity_rune_gridview);
		runeview.setAdapter(new RuneAdapter(this));
		runeview.setOnItemClickListener(new RuneItemListener(this));
	}

}
