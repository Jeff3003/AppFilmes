import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

public class AdapterFilmes extends RecyclerView.Adapter<AdapterFilmes.ViewHolder> {
    private Context context;
    private List<Filmes>lstFilmes;

    public AdapterFilmes(Context context, List<Filmes> lstFilmes) {
        this.context = context;
        this.lstFilmes = lstFilmes;
    }

    @NonNull
    @Override
    public AdapterFilmes.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterFilmes.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView {

        public ViewHolder(@NonNull Context context) {
            super(context);
        }
    }

}
