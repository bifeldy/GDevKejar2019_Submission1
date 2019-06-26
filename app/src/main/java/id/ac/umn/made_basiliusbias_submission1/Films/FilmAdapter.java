package id.ac.umn.made_basiliusbias_submission1.Films;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.ac.umn.made_basiliusbias_submission1.R;

public class FilmAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Film> films;

    public FilmAdapter() {
    }

    public FilmAdapter(Context context) {
        this.context = context;
        this.films = new ArrayList<>();
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public ArrayList<Film> getFilms() {
        return films;
    }

    public void setFilms(ArrayList<Film> films) {
        this.films = films;
    }

    @Override
    public int getCount() {
        return films.size();
    }

    @Override
    public Object getItem(int position) {
        return films.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        }

        ViewHolder viewHolder = new ViewHolder(convertView);
        Film film = (Film) getItem(position);
        viewHolder.bind(film);

        return convertView;
    }

    private class ViewHolder {

        private TextView txtTitle;
        private TextView txtDescription;
        private ImageView imgPhoto;

        ViewHolder(View view) {
            txtTitle = view.findViewById(R.id.txt_title);
            txtDescription = view.findViewById(R.id.txt_description);
            imgPhoto = view.findViewById(R.id.img_photo);
        }

        void bind(Film film) {
            txtTitle.setText(film.getName());
            txtDescription.setText(film.getDescription());
            imgPhoto.setImageResource(film.getPhoto());
        }
    }
}
