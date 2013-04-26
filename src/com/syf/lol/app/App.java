package com.syf.lol.app;

import android.app.Application;
import android.content.Context;

import com.syf.lol.activity.MainActivity;
import com.syf.lol.entity.Data;

public class App extends Application
{
 private Data data;
 private MainActivity mainactivity;

public Data getData()
{
	return data;
}

public void setData(Data data)
{
	this.data = data;
}

public MainActivity getMainactivity()
{
	return mainactivity;
}

public void setMainactivity(MainActivity mainactivity)
{
	this.mainactivity = mainactivity;
}
public static Data getData(Context context)
{
	App app=(App)context.getApplicationContext();
	return app.getData();
}

 
}
