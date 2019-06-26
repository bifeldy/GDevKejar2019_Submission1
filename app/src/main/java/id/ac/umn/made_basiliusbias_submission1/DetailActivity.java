package id.ac.umn.made_basiliusbias_submission1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import id.ac.umn.made_basiliusbias_submission1.Films.Film;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_DETAIL = "extra_detail";

    private TextView txtTitle;
    private TextView txtDescription;
    private ImageView imgPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        txtTitle = findViewById(R.id.detail_title);
        txtDescription = findViewById(R.id.detail_description);
        imgPhoto = findViewById(R.id.detail_poster);

        Film film = getIntent().getParcelableExtra(EXTRA_DETAIL);

        txtTitle.setText(film.getName());
        txtDescription.setText(film.getDescription());
        imgPhoto.setImageDrawable(getDrawable(film.getPhoto()));
    }
}
