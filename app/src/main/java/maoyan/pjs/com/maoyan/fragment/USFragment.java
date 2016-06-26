package maoyan.pjs.com.maoyan.fragment;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.cjj.MaterialRefreshLayout;

import maoyan.pjs.com.maoyan.R;
import maoyan.pjs.com.maoyan.base.BaseFragment;

/**
 * Created by pjs984312808 on 2016/6/22.
 */
public class USFragment extends BaseFragment {

    private MaterialRefreshLayout refresh;
    private RecyclerView recyclerView;
    public USFragment(Context context) {
        super(context);
    }

    @Override
    public View initView() {

        View view =View.inflate(context, R.layout.us,null);
        refresh = (MaterialRefreshLayout) view.findViewById(R.id.refresh);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        return view;
    }

    @Override
    public void initData() {
        Log.i("TAG", "美国热映");
        super.initData();
    }
}
