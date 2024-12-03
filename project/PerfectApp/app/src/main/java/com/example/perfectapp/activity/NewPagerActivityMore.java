package com.example.perfectapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.perfectapp.R;
import com.example.perfectapp.adapter.NewPagerLinearLayoutAdapter;
import com.example.perfectapp.adapter.NewPagerMoreSpeakAdapter;
import com.example.perfectapp.bean.LineanNewPage;
import com.example.perfectapp.bean.NewPager;
import com.example.perfectapp.bean.NewPagerParent;
import com.example.perfectapp.bean.Speak;

import java.util.ArrayList;
import java.util.List;

public class NewPagerActivityMore extends AppCompatActivity {

    private TextView title,content,bigTitle;
    private Button button;
    private ImageView back,iv;
    private Bundle bundle;
    private RecyclerView recyclerView,pushRecycle;
    private List<Speak> list;
    private List<LineanNewPage> pushList;
    private NewPagerParent newPagerParent;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_pager_more);

        initActivity();
        initView();
        initTopBar();
        initList();
        initMain();
        initButton();
        initRecycle();

    }

    private void initList() {
        list = new ArrayList<>();

        pushList = new ArrayList<>();

        pushList.add(new LineanNewPage(R.drawable.k1,"【登月第一人留下的脚印真相】",1,34,"中国青年报客户端北京5月17电（中青报·中青网记者 邱晨辉）北京时间2023年5月17日10时49分，我国在西昌卫星发射中心用长征三号乙运载火箭，成功发射第五十六颗北斗导航卫星。该卫星属地球静止轨道卫星，是我国北斗三号工程的首颗备份卫星。入轨并完成在轨测试后，将接入北斗卫星导航系统。\n" +
                "\n" +
                "　　此次发射是北斗三号工程高密度组网之后，时隔3年的首发任务。该卫星的发射将进一步提升系统服务性能，对推广北斗系统特色服务、支撑北斗系统规模应用具有重要意义。该卫星实现了对现有地球静止轨道卫星的在轨热备份，将增强系统的可用性和稳健性，提升系统现有区域短报文通信容量三分之一，提高星基增强和精密单点定位服务性能，有助于用户实现快速高精度定位。\n" +
                "\n" +
                "　　此次发射的北斗导航卫星和配套运载火箭由中国航天科技集团有限公司所属的中国空间技术研究院和中国运载火箭技术研究院分别抓总研制。这是长征系列运载火箭的第473次发射。"));
        pushList.add(new LineanNewPage(R.drawable.k2,"【中国河流详细介绍，分为九大流域片、七大水系，了解河流】",1,34,"中国青年报客户端北京5月17电（中青报·中青网记者 邱晨辉）北京时间2023年5月17日10时49分，我国在西昌卫星发射中心用长征三号乙运载火箭，成功发射第五十六颗北斗导航卫星。该卫星属地球静止轨道卫星，是我国北斗三号工程的首颗备份卫星。入轨并完成在轨测试后，将接入北斗卫星导航系统。\n" +
                "\n" +
                "　　此次发射是北斗三号工程高密度组网之后，时隔3年的首发任务。该卫星的发射将进一步提升系统服务性能，对推广北斗系统特色服务、支撑北斗系统规模应用具有重要意义。该卫星实现了对现有地球静止轨道卫星的在轨热备份，将增强系统的可用性和稳健性，提升系统现有区域短报文通信容量三分之一，提高星基增强和精密单点定位服务性能，有助于用户实现快速高精度定位。\n" +
                "\n" +
                "　　此次发射的北斗导航卫星和配套运载火箭由中国航天科技集团有限公司所属的中国空间技术研究院和中国运载火箭技术研究院分别抓总研制。这是长征系列运载火箭的第473次发射。"));
        pushList.add(new LineanNewPage(R.drawable.k3,"【侏罗纪恐龙种族迁徙】",1,34,"中国青年报客户端北京5月17电（中青报·中青网记者 邱晨辉）北京时间2023年5月17日10时49分，我国在西昌卫星发射中心用长征三号乙运载火箭，成功发射第五十六颗北斗导航卫星。该卫星属地球静止轨道卫星，是我国北斗三号工程的首颗备份卫星。入轨并完成在轨测试后，将接入北斗卫星导航系统。\n" +
                "\n" +
                "　　此次发射是北斗三号工程高密度组网之后，时隔3年的首发任务。该卫星的发射将进一步提升系统服务性能，对推广北斗系统特色服务、支撑北斗系统规模应用具有重要意义。该卫星实现了对现有地球静止轨道卫星的在轨热备份，将增强系统的可用性和稳健性，提升系统现有区域短报文通信容量三分之一，提高星基增强和精密单点定位服务性能，有助于用户实现快速高精度定位。\n" +
                "\n" +
                "　　此次发射的北斗导航卫星和配套运载火箭由中国航天科技集团有限公司所属的中国空间技术研究院和中国运载火箭技术研究院分别抓总研制。这是长征系列运载火箭的第473次发射。"));

    }

    private void initRecycle() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(new NewPagerMoreSpeakAdapter(this,list));
        recyclerView.setLayoutManager(linearLayoutManager);

        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(this);
        pushRecycle.setAdapter(new NewPagerLinearLayoutAdapter(this,pushList));
        pushRecycle.setLayoutManager(linearLayoutManager2);


    }

    private void initButton() {

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText.getText().toString();
                if(s!=null){
                    list.add(new Speak(R.drawable.me_tt,s));
                    editText.setText(null);
                }
            }
        });


    }

    private void initMain() {

        title.setText("《"+newPagerParent.getTitle()+"》");
        iv.setImageResource(newPagerParent.getImgSrc());
        content.setText("    "+newPagerParent.getContentText());

    }

    private void initActivity() {

        bundle = getIntent().getBundleExtra("newPagerBundle");

        if(bundle != null) {

            newPagerParent =(NewPager) bundle.getSerializable("newPager");

        }else {

            bundle = getIntent().getBundleExtra("lineanNewPagerBundle");
            newPagerParent = (LineanNewPage) bundle.getSerializable("lineanNewPager");

        }




    }

    private void initTopBar() {

        back.setVisibility(View.VISIBLE);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewPagerActivityMore.this.finish();
            }
        });

        bigTitle.setText("新闻详情页");
    }

    private void initView() {

        bigTitle = findViewById(R.id.topbar_tv);
        content = findViewById(R.id.ac_newpager_content);
        button = findViewById(R.id.ac_newpager_btn);
        back = findViewById(R.id.topbar_back);
        iv = findViewById(R.id.ac_newpager_iv);
        recyclerView = findViewById(R.id.ac_newpager_recycle);
        editText = findViewById(R.id.ac_newpager_put);
        pushRecycle = findViewById(R.id.ac_newpager_recycle_push);
        title = findViewById(R.id.ac_newpager_title);

    }
}