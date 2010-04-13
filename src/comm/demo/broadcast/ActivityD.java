package comm.demo.broadcast;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

import comm.demo.direct.R;

/**
 * Demonstration for broadcast messages with an intent.
 *
 */
public class ActivityD extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		
		
		// An IntentFilter listens for a specific broadcast message. The filter
		// can be also defined in the manifest file.
		IntentFilter intentFilter = new IntentFilter();
		intentFilter.addAction("comm.demo.broadcast.ACTION_A");
		registerReceiver(new BroadcastReceiverA(), intentFilter);

		// Intents are like an envelop. Add the action name as the parameter
		Intent intent = new Intent("comm.demo.broadcast.ACTION_A");

		// Bundles contain the content (in the envelop). Possible datatypes are
		// strings, integers, booleans or serializeable objects
		Bundle bundle = new Bundle();
		bundle.putString("key", "value");
		intent.putExtras(bundle);

		// send the broadcast to any listener (one is set before)
		sendBroadcast(intent);
	}

}
