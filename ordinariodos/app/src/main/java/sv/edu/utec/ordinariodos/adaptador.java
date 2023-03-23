package sv.edu.utec.ordinariodos;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class adaptador {
    Activity contexto;
    String []empleado;
    Integer [] Imgempleado;
    ImageView imgfoto;
    TextView tvNombre;
    public AdaptadorEmpleado(Activity contexto, String[]empleado,Integer[] Imgempleado) {
        super(contexto, R.layout.empleado, empleado);
        this.contexto = contexto;
        this.empleado = empleado;
        this.Imgempleado = Imgempleado;
    }
    public View getView(int posicion, View v, ViewGroup parent) {
        LayoutInflater inflater = contexto.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.empleado, null, true);
        tvNombre = rowView.findViewById(R.id.txNombre);
        imgfoto = rowView.findViewById(R.id.imgvempleado);
        tvNombre.setText(empleado[posicion]);
        imgfoto.setImageResource(Imgempleado[posicion]);
        return rowView;
    }
}
