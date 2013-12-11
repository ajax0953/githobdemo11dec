package tw.java2.androidtestee;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		return super.onOptionsItemSelected(item);
	}

	private final static String TAG = "MYTEST";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.v("abc","123456789");
		Log.v("abc","987654321");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void doClick(View view) {
		Log.v(TAG, "Button Click !!!");
		TextView textView1 = (TextView) findViewById(R.id.textView1);
		EditText editText1 = (EditText) findViewById(R.id.editText1);
		textView1.setText(editText1.getText().toString());
	}
}
