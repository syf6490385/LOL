package com.syf.lol.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.syf.lol.R;
import com.syf.lol.app.App;
import com.syf.lol.customview.ItemView;
import com.syf.lol.entity.Item;

public class ItemDialog extends Dialog
{
	String id;
	Item item;
	RelativeLayout layout;
	ImageView imgview;
	TextView nameview,goldview,typeview,descview;
	Context context;
	ItemView toitemview,needitemview;
    public ItemDialog(Context context, int theme,String id)
	{
		super(context, theme);
		this.id=id;
		this.context=context;
		App app=(App)context.getApplicationContext();
		item=app.getData().getItembyId(id);
		/*WindowManager.LayoutParams lp = this.getWindow().getAttributes();
		lp.height=680;
		lp.width=370;
		this.getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
		this.getWindow().setAttributes(lp);*/
	}

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_item);
        layout=(RelativeLayout)findViewById(R.id.dialog_item_attrlayout);
        imgview=(ImageView)findViewById(R.id.itemimg);
        nameview=(TextView)findViewById(R.id.itemname);
        goldview=(TextView)findViewById(R.id.itemgold);
        typeview=(TextView)findViewById(R.id.itemtype);
        descview=(TextView)findViewById(R.id.itemdesc);
        toitemview=(ItemView)findViewById(R.id.toitemview);
        needitemview=(ItemView)findViewById(R.id.needitemview);
        toitemview.init("可合成为:", item.toitem);
        needitemview.init("合成所需物品:", item.baseitem);
        imgview.setImageResource(context.getResources().getIdentifier(item.id,"drawable", "com.syf.lol"));
        nameview.setText(item.name);
        goldview.setText(item.gold);
        typeview.setText(item.type);
        descview.setText(item.desc);

	}




}
