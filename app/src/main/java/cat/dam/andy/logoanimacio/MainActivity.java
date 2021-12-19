package cat.dam.andy.logoanimacio;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LottieAnimationView like = findViewById(R.id.like);

        LottieAnimationView spider = findViewById(R.id.spider);

        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                like.setAnimation(R.raw.dokkan);
                like.playAnimation();
            }
        });

        spider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spider.playAnimation();
            }
        });

    }
}

