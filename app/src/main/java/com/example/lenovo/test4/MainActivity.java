package com.example.lenovo.test4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MainActivity extends AppCompatActivity {
    private final static String PRODUCT="product";
    private final static String PRICE="price";
    private final static String CONFIGURATION="configuration";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] products={"小米Note","华为荣耀7","魅族MX5","锤子T1"};
        String[] prices={"1999","1999","1999","2480"};
        String[] configurations={"高通骁龙 801，3GB RAM，16GB ROM","麒麟 935，3GB RAM，16GB ROM","联发科（MTK)Helio X10 Turbo，3GB RAM，32GB ROM","高通骁龙 801，2GB RAM，32GB ROM"};

        List<Map<String,Object>> items=new ArrayList<Map<String,Object>>();

        for(int i=0;i<products.length;i++) {
            Map<String,Object> item=new HashMap<String,Object>();
            item.put(PRODUCT, products[i]);
            item.put(PRICE, prices[i]);
            item.put(CONFIGURATION, configurations[i]);
            items.add(item);
        }

        SimpleAdapter adapter=new SimpleAdapter(this,items,R.layout.item,new String[]{PRODUCT,PRICE,CONFIGURATION},new int[]{R.id.txtProduct,R.id.txtPrice,R.id.txtConfiguration});

        ListView list=(ListView)findViewById(R.id.list);

        list.setAdapter(adapter);
    }
}

