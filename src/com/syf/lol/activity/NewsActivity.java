package com.syf.lol.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.syf.lol.R;
import com.syf.lol.adapter.NewsAdapter;
import com.syf.lol.entity.NewsData;
import com.syf.lol.listener.NewsItemListener;

public class NewsActivity extends Activity
{
    ListView newslist;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_news);
		newslist=(ListView)findViewById(R.id.activity_news_listview);
		newslist.setAdapter(new NewsAdapter(this));
		newslist.setOnItemClickListener(new NewsItemListener(this));
	}


}
