package comm.demo.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class BroadcastReceiverA extends BroadcastReceiver {
	@Override
	public void onReceive(Context context, Intent intent) {
		Toast.makeText(context, "Broadcast message received.",
				Toast.LENGTH_LONG).show();

		// if the filter is set for more than one action, you can get the current by getAction() method
		if (intent.getAction().equals("comm.demo.broadcast.ACTION_A"))
			Toast.makeText(context, "Intent action is: " + intent.getAction(),
					Toast.LENGTH_LONG).show();

		// Get the data from the intent
		Bundle bundle = intent.getExtras();
		Toast.makeText(context, "Intent includes: " + bundle.getString("key"),
				Toast.LENGTH_LONG).show();

	}

}
