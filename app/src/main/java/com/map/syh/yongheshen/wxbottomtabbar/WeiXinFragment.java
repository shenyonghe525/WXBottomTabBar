package com.map.syh.yongheshen.wxbottomtabbar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * 作者： yongheshen on 15/11/4.
 * 描述：
 */
public class WeiXinFragment extends Fragment
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.layout_content, container, false);
        TextView textView = (TextView) view.findViewById(R.id.textView);
        textView.setText("WeiXin");
        return view;
    }
}
