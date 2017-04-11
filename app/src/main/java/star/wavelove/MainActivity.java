package star.wavelove;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    WaveView mWaveview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWaveview = (WaveView) findViewById(R.id.waveview);

        mWaveview.setMax(200);
        mWaveview.setProgress(20);
        mWaveview.setSingleLine(true);
        mWaveview.setSpeed(WaveView.SPEED_FAST);
        mWaveview.setWaveColorGradient(getResources().getColor(R.color.wave_zi), getResources().getColor((R.color.wave_hong)));
    }
}
