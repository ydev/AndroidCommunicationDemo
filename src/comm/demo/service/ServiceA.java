package comm.demo.service;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.Toast;

public class ServiceA extends Service {

	@Override
	public IBinder onBind(Intent arg0) {
		return null;
	}

	@Override
	public void onCreate() {
		super.onCreate();

		Toast.makeText(this, "Service started.", Toast.LENGTH_LONG).show();

		// stop the service right now
		stopSelf();
	}

	public int onStartCommand(Intent intent, int flags, int startId) {
		// Get the data from the intent
		Bundle bundle = intent.getExtras();
		Toast.makeText(this, "Intent includes: " + bundle.getString("key"),
				Toast.LENGTH_LONG).show();

		return startId;
	}

	@Override
	public void onDestroy() {
		super.onDestroy();

		Toast.makeText(this, "Service destroyed.", Toast.LENGTH_LONG).show();
	}

}
