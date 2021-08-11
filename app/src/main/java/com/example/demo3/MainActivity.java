package com.example.demo3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.CheckBox;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
 CheckBox pizza,coffe,burger;
 Button buttonOrder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButtonClick();



    }

    public void addListenerOnButtonClick() {
        pizza = (CheckBox)findViewById(R.id.checkBox);
        coffe = (CheckBox)findViewById(R.id.checkBox2);
        burger=(CheckBox)findViewById(R.id.checkBox3);
        buttonOrder=(Button)findViewById(R.id.Button);
        buttonOrder.setOnClickListener(new View.OnClickListener()
        {

             public void onClick(View view )
            {

            int totalamount = 0;
            StringBuilder result = new StringBuilder();
            result.append("Selexted Items:");

            if (pizza.isChecked()) {
                result.append("\nPizza 100Rs");
                totalamount += 100;

            }

            if (coffe.isChecked()) {
                result.append("\nCoffe 50Rs");
                totalamount += 50;
            }
            if (burger.isChecked()) {
                result.append("\n Burger 120RS");
                totalamount += 120;

            }

            result.append("\n Total:"+totalamount + "Rs");
            Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
        }


         });

    }

}






