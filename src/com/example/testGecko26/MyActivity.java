package com.example.testGecko26;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.widget.Toast;
import org.mozilla.gecko.*;

public class MyActivity extends Activity {
	private static final String LOGTAG = "Gecko";
	private GeckoView mGeckoView;

	/**
	 * Called when the activity is first created.
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
		setContentView(R.layout.main);
		mGeckoView = (GeckoView) findViewById(R.id.layer_view);
		GeckoNetworkManager.getInstance().start(MyActivity.this);

		mGeckoView.setChromeDelegate(new MyGeckoViewChrome());
		mGeckoView.setContentDelegate(new MyGeckoViewContent());
	}

	private class MyGeckoViewChrome extends GeckoViewChrome {
		@Override
		public void onReady(GeckoView geckoView) {
			Toast.makeText(MyActivity.this, "Gecko is ready",Toast.LENGTH_LONG).show();

			mGeckoView.addBrowser("http://www-tc.pbskids.org/curiousgeorge/games/i_love_shapes/i_love_shapesV5.swf");
		}

	}

	private class MyGeckoViewContent extends GeckoViewContent {

	}
}
