package com.spoon.ggq.festival_msg.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ggq on 2017/1/29.
 */
public class FestivalLab {
    private  static  FestivalLab mInstance;

    public static  FestivalLab getInstance(){
        if (mInstance==null)
        {
            synchronized (FestivalLab.class)
            {
                if (mInstance==null)
                    mInstance=new FestivalLab();
            }
        }
        return mInstance;
    }

    private List<Festival> mFestivals=new ArrayList<Festival>();
    private List<Msg> mMsgs=new ArrayList<Msg>();
    private FestivalLab(){
        mFestivals.add(new Festival(1,"国庆节"));
        mFestivals.add(new Festival(2,"中秋节"));
        mFestivals.add(new Festival(3,"元旦"));
        mFestivals.add(new Festival(4,"春节"));
        mFestivals.add(new Festival(5,"端午节"));
        mFestivals.add(new Festival(6,"七夕节"));
        mFestivals.add(new Festival(7,"圣诞节"));
        mFestivals.add(new Festival(8,"儿童节"));

        mMsgs.add(new Msg(1,1,"国庆快乐"));
        mMsgs.add(new Msg(2,1,"红旗飘扬"));
        mMsgs.add(new Msg(3,1,"我心荡漾"));
        mMsgs.add(new Msg(4,1,"我爱中国"));
        mMsgs.add(new Msg(5,1,"天空真美"));
        mMsgs.add(new Msg(6,1,"祖国真好"));
        mMsgs.add(new Msg(7,1,"Went to the National Day holiday in the country to celebrate this day"));
        mMsgs.add(new Msg(8,1,"我来了，假期"));
        mMsgs.add(new Msg(9,1,"幸福的时光来了"));

    }
    public List<Festival> getFestivals(){
        return new ArrayList<Festival>(mFestivals);
    }
    public Festival getFestivalById(int fesId)
    {
        for (Festival festival:mFestivals
             ) {
            if (festival.getId()==fesId)
                return festival;
        }
        return null;
    }
    public List<Msg>getMsgsByFestivalId(int fesId){
        List<Msg> msgs=new ArrayList<>();
        for (Msg msg:mMsgs)
        {
            if (msg.getFestivalId()==fesId)
            {
                msgs.add(msg);
            }
        }
        return msgs;
    }
    public  Msg getMsgByMsgId(int id){
        for (Msg msg:mMsgs
             ) {
            if(msg.getId()==id)
                return msg;
        }
        return null;
    }



}
