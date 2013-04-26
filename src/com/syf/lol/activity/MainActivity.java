package com.syf.lol.activity;
import android.app.ActivityGroup;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;
import com.syf.lol.R;
import com.syf.lol.app.App;
import com.syf.lol.customview.SlidingMenuView;
import com.syf.lol.datafactory.DataFactory;

public class MainActivity extends ActivityGroup
{
	public ViewGroup activitygroup;
	ListView slidinglist;
	Context context;
	SlidingMenuView slidingview;
	protected void onCreate(Bundle savedInstanceState)
	{	
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		context=this;
		activitygroup=(ViewGroup)findViewById(R.id.activity_body);
		slidingview=(SlidingMenuView)findViewById(R.id.sliding_view);
		loaddata();
		Intent intent=new Intent(context,NewsActivity.class);
		activitygroup.removeAllViews();
		activitygroup.addView(getLocalActivityManager().startActivity("main", intent).getDecorView());
	}
	public void changeactivity(View v)
	{
		Button btn=(Button)v;
		String name=(String)btn.getText();
		Intent intent=null;
		View rootview=null;
		if(name.equals("新闻讯息"))         {    intent=new Intent(context,NewsActivity.class);   }
		if(name.equals("英雄资料"))         {    intent=new Intent(context,HeroActivity.class);   }
		if(name.equals("物品资料"))         {    intent=new Intent(context,ItemActivity.class);   }
		if(name.equals("符文资料"))         {    intent=new Intent(context,RuneActivity.class);   }
		if(name.equals("天赋资料"))         {    intent=new Intent(context,TalentActivity.class);   }
		if(name.equals("英雄模拟器"))      {    intent=new Intent(context,SimulatorActivity.class);   }
		if(name.equals("分享软件"))         {    intent=new Intent(context,ShareActivity.class);   }
		if(intent!=null)
		  {
		rootview=getLocalActivityManager().startActivity(name, intent).getDecorView();
		activitygroup.removeAllViews();
		activitygroup.addView(rootview);
		slidingview.snapToScreen(1);//1为侧滑菜单收起,0为侧滑菜单展示,2为 右侧侧滑
		  }
	 }
	public boolean onKeyDown(int keyCode, KeyEvent event)
	{
		String str=getLocalActivityManager().getCurrentActivity().getLocalClassName();
		if(str.equals("activity.NewsActivity"))
		{
			Toast.makeText(context, "按两下退出", Toast.LENGTH_SHORT).show();
		}
		else
		{
			Toast.makeText(context, "返回主界面", Toast.LENGTH_SHORT).show();
			Button temp=new Button(context);
			temp.setText("新闻讯息");
			changeactivity(temp);
		}
		return true;
	}
	public void exit(View v)
	{
		finish();
	}
	private void loaddata()
	{
		App app=(App)getApplication();
		app.setData(DataFactory.getData(context));
		app.setMainactivity(this);
	}
}
