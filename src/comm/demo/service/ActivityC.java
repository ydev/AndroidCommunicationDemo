package comm.demo.service;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import comm.demo.direct.R;

/**
 * Demonstration for a service communication with an intent.
 *
 */
public class ActivityC extends Activity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		
		
		// Intents are like an envelop
		Intent intent = getIntent();

		// Set the communication path by caller and callee (from -> to)
		intent.setClass(this, ServiceA.class);

		// Bundles contain the content (in the envelop). Possible datatypes are
		// strings, integers, booleans or serializeable objects
		Bundle bundle = new Bundle();
		bundle.putString("key", "value");
		intent.putExtras(bundle);

		// now start a service
		startService(intent);
	}

}
