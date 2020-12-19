package com.example.wqh007.bean;

import com.example.wqh007.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "车厘子", "花生", "柠檬", "橘子", "梨", "甜椒","苹果","麻薯"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "新疆车厘子太好吃了",
            "世界上最好吃的花生",
            "世界上最酸的柠檬",
            "其实是柚子的橘子",
            "宁夏的水梨，水分很大",
            "没有辣味的甜椒",
            "大苹果，大苹果，超大的大苹果",
            "好吃的手工的爆浆麻薯"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {50, 30, 40, 30, 16, 7,10,15};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.a001_, R.drawable.a002_, R.drawable.a003_,
            R.drawable.a004_, R.drawable.a005_, R.drawable.a006_,
            R.drawable.a007_, R.drawable.a008_
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.a001, R.drawable.a002, R.drawable.a003,
            R.drawable.a004, R.drawable.a005, R.drawable.a006,
            R.drawable.a007, R.drawable.a008
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}