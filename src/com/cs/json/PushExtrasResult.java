package com.cs.json;

public class PushExtrasResult {

    /**
     * type : user_interactive
     * avatar : https:/w.etx365.cn/upfile/picture/avatar_20.png
     * unid : 060567E3A669DE5440AD72DBC01461C0
     * nick : Lulus
     * time : 2019-09-30 16:59:25
     * contentType : 1
     * usn : 17
     * message :
     * sender : 20
     * noticeType : zanorcom
     * desc : 赞了你的作品
     * index : https://i.etx365.cn/?6QMWOG21
     */

    private String table;// 相关表名
    private String dataid; // 内容id
    private String cover; // 封面地址
    private String action;// 动作

    private String type;// 互动类型 user_interactive
    private String avatar; // 对方用户头像
    private String unid;// 相关内容unid
    private String nick; // 消息发送者昵称
    private String time; // 发送时间
    private String contentType; // 内容类型 1文章 2轨迹 3图片 4视频 (5:一日游,6:国内游,7:出境游,>9 为分类活动) 0 约伴
    private String usn;// 相关内容的发布者usn
    private String message; // 消息内容
    private String sender;// 消息发送者usn
    private String noticeType; // 消息类型 @"zanorcom":@"focus"
    private String desc;//描述
    private String index; // 内容地址

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getDataid() {
        return dataid;
    }

    public void setDataid(String dataid) {
        this.dataid = dataid;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getUsn() {
        return usn;
    }

    public void setUsn(String usn) {
        this.usn = usn;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getNoticeType() {
        return noticeType;
    }

    public void setNoticeType(String noticeType) {
        this.noticeType = noticeType;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }
}
