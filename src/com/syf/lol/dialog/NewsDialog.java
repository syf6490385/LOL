package com.syf.lol.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.syf.lol.R;
import com.syf.lol.app.App;
import com.syf.lol.entity.News;

public class NewsDialog extends Dialog
{
	TextView title,content;
	String id;
	News news;
    public NewsDialog(Context context, int theme,String id)
	{
		super(context, theme);
		this.id=id;
		App app=(App)context.getApplicationContext();
		news=app.getData().getNewsbyId(id);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_news);
        title=(TextView)findViewById(R.id.dialog_news_title);
        content=(TextView)findViewById(R.id.dialog_news_content);
        title.setText(news.title);
        content.setText(news.content);
	}




}
