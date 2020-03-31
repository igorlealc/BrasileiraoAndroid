package br.com.demonstracao.adapters

import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import br.com.demonstracao.models.Jogo

class ActMainRecyclerAdapter(var jogos: Array<Jogo>) :
    RecyclerView.Adapter<ActMainRecyclerAdapter.ActMainViewHolder>() {

    class ActMainViewHolder(
        ctrtLltView: ConstraintLayout
    ) : RecyclerView.ViewHolder(ctrtLltView)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ActMainRecyclerAdapter.ActMainViewHolder {
       /*
       LayoutInflater....
       textNomeTimeCasa: TextView,
        textNomeTimeVisitante: TextView,
        imgTimeCasa: ImageView,
        imgTimeVisitante: ImageView,
        txtData: TextView,
        TxtPlacar: TextView

        */
    }

    override fun getItemCount(): Int {
        return this.jogos.size
    }

    override fun onBindViewHolder(holder: ActMainRecyclerAdapter.ActMainViewHolder, position: Int) {
        0,
    }


}