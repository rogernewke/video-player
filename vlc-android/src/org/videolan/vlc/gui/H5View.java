package org.videolan.vlc.gui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import org.videolan.vlc.StartActivity;

public class H5View extends Activity{	
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		new Handler().postDelayed(new Runnable(){  
		     public void run() {  
		     //execute the task
				 jump();
		    	 
		     }  
		  }, 2000);
	}
	
	public void jump(){
		Intent intent = new Intent();
		intent.setClass(H5View.this, StartActivity.class);
		H5View.this.startActivity(intent);	
		finish();
	}
	
	public void onBackPressed(){
	}
	
}
