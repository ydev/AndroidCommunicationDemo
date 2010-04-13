package comm.demo.direct;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class ActivityB extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		
		
		// Get the data from the intent
		Bundle bundle = getIntent().getExtras();
		Toast.makeText(this, "Intent includes: " + bundle.getString("key"), Toast.LENGTH_LONG)
				.show();

		finish();
	}
}