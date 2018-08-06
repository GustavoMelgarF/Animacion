package gusmf.com.animacion_agitar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Animation rotar = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotar);
        Animation fade = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        ImageView avion = (ImageView) findViewById(R.id.avion);
        ImageView puntos = (ImageView) findViewById(R.id.puntos);
        avion.startAnimation(rotar);
        puntos.startAnimation(fade);



    }


}
