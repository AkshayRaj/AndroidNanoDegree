package akshayraj.com.myappportfolio;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    static Context mContext;

    Button mBtnSpotifyStreamer;
    Button mBtnScoresApp;
    Button mBtnLibraryApp;
    Button mBtnBuildItBigger;
    Button mBtnXyzReader;
    Button mBtnCapstone;

    int toast_duration = Toast.LENGTH_SHORT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = getApplicationContext();
        findViewByIds();
        setOnClickListeners();
    }

    private void findViewByIds(){
        mBtnSpotifyStreamer = (Button) findViewById(R.id.btn_spotify_streamer);
        mBtnScoresApp = (Button) findViewById(R.id.btn_scores_app);
        mBtnLibraryApp = (Button) findViewById(R.id.btn_library_app);
        mBtnBuildItBigger = (Button) findViewById(R.id.btn_build_it_bigger);
        mBtnXyzReader = (Button) findViewById(R.id.btn_xyz_reader);
        mBtnCapstone = (Button) findViewById(R.id.btn_capstone);
    }

    private void setOnClickListeners() {
        mBtnSpotifyStreamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, R.string.SpotifyStreamer, toast_duration).show();
            }
        });

        mBtnScoresApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, R.string.ScoreApp, toast_duration).show();
            }
        });

        mBtnLibraryApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, R.string.LibraryApp, toast_duration).show();
            }
        });

        mBtnBuildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, R.string.BuildItBigger, toast_duration).show();
            }
        });

        mBtnXyzReader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, R.string.XYZReader, toast_duration).show();
            }
        });

        mBtnCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, R.string.Capstone, toast_duration).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
