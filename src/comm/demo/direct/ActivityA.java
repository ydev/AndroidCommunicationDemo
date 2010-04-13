package comm.demo.direct;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Demonstration for a direct activity to activity communication with an intent.
 *
 */
public class ActivityA extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		
		
		// Intents are like an envelop
		Intent intent = getIntent();

		// Set the communication path by caller and callee (from -> to)
		// Add the ActivityB to your manifest: 
		//   application > application nodes > add activity > name
		intent.setClass(this, ActivityB.class);

		// Bundles contain the content (in the envelop). Possible datatypes are
		// strings, integers, booleans or serializeable objects
		Bundle bundle = new Bundle();
		bundle.putString("key", "value");
		intent.putExtras(bundle);

		// now start another activity
		startActivity(intent);
	}
}