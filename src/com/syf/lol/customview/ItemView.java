package com.syf.lol.customview;

import com.syf.lol.R;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.Html.ImageGetter;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class ItemView extends TextView
{
	ImageGetter imageGetter= new ImageGetter() { 
   	 
        @Override 
        public Drawable getDrawable(String source) { 
            int id = getResources().getIdentifier(source,"drawable", "com.syf.lol");
            Drawable drawable = getResources().getDrawable(id); 
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(),drawable.getIntrinsicHeight()); 
            return drawable; 
        } 
    };
    public ItemView(Context context, AttributeSet attrs, int defStyle) 
    {
		super(context, attrs, defStyle);
	}
	public ItemView(Context context, AttributeSet attrs) 
    {
		super(context, attrs);
	}
	public ItemView(Context context) 
	{
     super(context);
	}
	public void init(String title,String itemstr)
	{
		this.setBackgroundColor(0x000000);
		this.setText("");
		this.append(Html.fromHtml(title+"<br>"));
		if(!itemstr.equals("0"))
		{
		String[] item=itemstr.split("_");
		for(int i=0;i<item.length;i++)
		{
		this.append(Html.fromHtml("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src='"+item[i]+"'/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;",imageGetter,null));
		 if(i==2){ this.append(Html.fromHtml("<br>"));}
		}
		}
		else
			this.append("нч");
	}

}
