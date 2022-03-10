package com.loki.todo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.loki.todo.R;
import com.loki.todo.model.ToDos;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ToDoAdapter extends RecyclerView.Adapter<ToDoAdapter.ToDoViewHolder> {

    private Context mContext;
    private List<ToDos> mToDos;

    public ToDoAdapter(Context context, List<ToDos> toDos) {
        this.mContext = context;
        this.mToDos = toDos;
    }

    @NonNull
    @Override
    public ToDoAdapter.ToDoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.todo_item, parent, false);
        ToDoViewHolder holder = new ToDoViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ToDoAdapter.ToDoViewHolder holder, int position) {
        holder.bindToDos(mToDos.get(position));
    }

    @Override
    public int getItemCount() {
        return mToDos.size();
    }

    public class ToDoViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.title_todo)TextView mTitleTodo;
        @BindView(R.id.des_todo) TextView mDesTodo;
        @BindView(R.id.date_todo) TextView mDateTodo;

        private Context mContext;

        public ToDoViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            mContext = itemView.getContext();
        }

        public void bindToDos(ToDos toDos) {
            mTitleTodo.setText(toDos.getTitletodo());
            mDesTodo.setText(toDos.getDestodo());
            mDateTodo.setText(toDos.getDatetodo());
        }
    }
}
