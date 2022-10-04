package ${YYAndroidPackageName};

import ${YYAndroidPackageName}.R;
import com.yoyogames.runner.RunnerJNILib;
import android.app.Activity;
import android.view.WindowManager;
import android.app.Activity;
import android.os.Build;
import android.util.Log;




public class FullScreenMode
{
	public static Activity activity;
	
	
	public FullScreenMode() {
		
		
		Log.i("yoyo","Blob Inside ");
		
		activity = RunnerActivity.CurrentActivity;
		
		
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
			Log.i("yoyo","Blob Executing ");
		      activity.getWindow().getAttributes().layoutInDisplayCutoutMode = WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES;
			Log.i("yoyo","Blob Ok");
		  }
		
		
		
		
		
		
	}
	
	
	
	//public String LaunchFullScreen()
	//{
	//	
	//	
	//	Log.i("yoyo","Blob Inside ");
	//	
	//	activity = RunnerActivity.CurrentActivity;
	//	
	//	
	//	if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
	//		Log.i("yoyo","Blob Executing ");
    //        activity.getWindow().getAttributes().layoutInDisplayCutoutMode = WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES;
	//		Log.i("yoyo","Blob Ok");
    //    }
	//	
	//	
	//	return "Full Screen : On";
	//	
	//	
	//	
	//}
	//












}