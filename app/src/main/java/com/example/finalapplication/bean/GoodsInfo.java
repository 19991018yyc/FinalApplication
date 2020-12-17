package com.example.finalapplication.bean;

import com.example.finalapplication.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc1; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号
    public int pic_id;
    public String title;
    public boolean bPressed;
    public int id;
    private static int seq = 0;
    public String desc;
    public GoodsInfo(int pic_id, String title, String desc) {
        rowid = 0L;
        sn = 0;
        name = "";
        desc1 = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
        this.pic_id = pic_id;
        this.title = title;
        this.desc = desc;
        this.bPressed = false;
        this.id = this.seq;
        this.seq++;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "高夫", "only", "only1", "摩托罗拉", "sk2", "vivo","versace","三星"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "高夫锐智多效三部曲套装（洗面奶120g+焕肤水75ml+乳液75ml送洗面奶25g*3 男士护肤套装 礼盒随机）",
            " 玉兰油（OLAY）超A眼霜30gA醇ProX精华乳护肤品（赠Prox眼霜15g*2）淡纹抗皱补水保湿去黑眼圈",
            "玉兰油（OLAY）大红瓶空气霜50g面霜女士护肤品补水保湿提拉紧致淡化细纹细致毛孔清爽不油腻焕活胶原力礼物",
            "摩托罗拉 razr 5G 刀锋折叠屏手机 双模5G全网通 超薄无缝无折痕+大双屏 4800万超强自拍 8GB+256GB 锋雅黑",
            "SK-II神仙水330ml精华液护肤品套装化妆品礼盒 SK2 补水保湿 均匀肤色 囤货装",
            "vivo S7 5G手机 8GB+128GB 莫奈漫彩 前置4400万AF双摄自拍 后置6400万超感光夜摄 双模5G全网通手机",
            " 范思哲(VERSACE)晶钻女用香水 30ml 节日生日礼物送女友女士香水香氛清新花果香持久自然",
            "三星 Galaxy Z Flip（SM-F7000） 超感官灵动折叠屏 8GB+256GB 潘多拉紫"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {389, 328, 248, 12499, 2150, 2700,229,7969};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.gaofu_s, R.drawable.only_s, R.drawable.only1_s,
            R.drawable.rongyao_s, R.drawable.sk2_s, R.drawable.vivo_s, R.drawable.versace_s, R.drawable.sj_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.gaofu, R.drawable.only, R.drawable.only1,
            R.drawable.rongyao, R.drawable.sk2, R.drawable.vivo,
            R.drawable.versace, R.drawable.sj
    };

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc1 = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

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
    private static int[] gridImageArray = {R.drawable.pic_01, R.drawable.pic_02, R.drawable.pic_03
            , R.drawable.pic_04, R.drawable.pic_05, R.drawable.pic_06, R.drawable.pic_07
            , R.drawable.pic_08, R.drawable.pic_09, R.drawable.pic_10};
    private static String[] gridTitleArray = {"商场", "超市", "百货", "便利店",
            "地摊", "食杂店", "饭店", "餐厅", "会所", "菜市场"};

    public static ArrayList<GoodsInfo> getDefaultGrid() {
        ArrayList<GoodsInfo> gridArray = new ArrayList<GoodsInfo>();
        for (int i = 0; i < gridImageArray.length; i++) {
            gridArray.add(new GoodsInfo(gridImageArray[i], gridTitleArray[i], null));
        }
        return gridArray;
    }
    private static int[] stagImageArray = {R.drawable.skirt01, R.drawable.skirt02, R.drawable.skirt03
            , R.drawable.skirt04, R.drawable.skirt05, R.drawable.skirt06, R.drawable.skirt07
            , R.drawable.skirt08, R.drawable.skirt09, R.drawable.skirt10, R.drawable.skirt11
            , R.drawable.skirt12, R.drawable.skirt13, R.drawable.skirt14, R.drawable.skirt15
            , R.drawable.skirt16, R.drawable.skirt17, R.drawable.skirt18, R.drawable.skirt19
            , R.drawable.skirt20, R.drawable.skirt21, R.drawable.skirt22, R.drawable.skirt23};
    private static String[] stagTitleArray = {"促销价", "惊爆价", "跳楼价", "白菜价", "清仓价", "割肉价",
            "实惠价", "一口价", "满意价", "打折价", "腰斩价", "无人问津", "算了吧", "大声点",
            "嘘嘘", "嗯嗯", "呼呼", "呵呵", "哈哈", "嘿嘿", "嘻嘻", "嗷嗷", "喔喔"};

    public static ArrayList<GoodsInfo> getDefaultStag() {

        ArrayList<GoodsInfo> stagArray = new ArrayList<GoodsInfo>();
        for (int i = 0; i < stagImageArray.length; i++) {
            stagArray.add(new GoodsInfo(stagImageArray[i], stagTitleArray[i], null));
        }
        return stagArray;
    }
}
