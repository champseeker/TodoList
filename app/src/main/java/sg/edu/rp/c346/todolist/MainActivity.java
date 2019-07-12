package sg.edu.rp.c346.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvTodoList;
    ArrayList<ToDo> todoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvTodoList = findViewById(R.id.lvTodoList);

        todoList = new ArrayList<>();

        todoList.add(new ToDo("MSA", "1/7/2019"));
        todoList.add(new ToDo("Go for haircut", "22/9/2019"));

        CustomAdapter adapter = new CustomAdapter(this, R.layout.row, todoList);
        lvTodoList.setAdapter(adapter);

    }
}
