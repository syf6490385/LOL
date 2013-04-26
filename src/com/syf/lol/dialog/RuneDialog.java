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
import com.syf.lol.entity.Rune;

public class RuneDialog extends Dialog
{
	String id;
	Rune rune;
	RelativeLayout layout;
	ImageView imgview;
	TextView nameview,goldview,typeview,descview,runetypeview;
	Context context;
    public RuneDialog(Context context, int theme,String id)
	{
		super(context, theme);
		this.id=id;
		this.context=context;
		App app=(App)context.getApplicationContext();
		rune=app.getData().getRunebyId(id);
	    WindowManager.LayoutParams lp = this.getWindow().getAttributes();
		lp.height=680;
		lp.width=370;
		this.getWindow().setAttributes(lp);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_rune);
        layout=(RelativeLayout)findViewById(R.id.dialog_item_attrlayout);
        imgview=(ImageView)findViewById(R.id.runeimg);
        nameview=(TextView)findViewById(R.id.runename);
        goldview=(TextView)findViewById(R.id.runegold);
        typeview=(TextView)findViewById(R.id.runetype);
        descview=(TextView)findViewById(R.id.runedesc);
        runetypeview=(TextView)findViewById(R.id.type);
        imgview.setImageResource(context.getResources().getIdentifier(rune.id,"drawable", "com.syf.lol"));
        nameview.setText(rune.name);
        goldview.setText(rune.gold);
        typeview.setText(rune.runetype);
        descview.setText(rune.desc);
        runetypeview.setText(rune.type);

	}




}
