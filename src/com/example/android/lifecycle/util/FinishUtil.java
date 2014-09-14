package com.example.android.lifecycle.util;

import com.example.android.lifecycle.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;

public class FinishUtil {
	public static void finish(final Activity activity) {
		AlertDialog.Builder builder = new AlertDialog.Builder(activity);
    	builder
    		.setMessage(R.string.confirm_finish)
        	.setTitle(R.string.confirm_finish_title)
        	.setNegativeButton(R.string.yes, new DialogInterface.OnClickListener() {
        		public void onClick(DialogInterface dialog, int id) {
        			activity.finish();
        		}
        	})
        	.setPositiveButton(R.string.no, null);
    	AlertDialog dialog = builder.create();
    	dialog.show();
	}
}
