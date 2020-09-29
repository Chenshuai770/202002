package com.cs.charty.socket;


import com.cs.charty.ActionType;

//用来增删改查
public class MultipleResult<T> {

    /**
     * action : insert
     * data : {"traverler_cname":"陈总","traveler_lname":"CHEN","traveler_fname":"ZONG"}
     */

    private ActionType action;
    private T data;


    public ActionType getAction() {
        return action;
    }

    public void setAction(ActionType action) {
        this.action = action;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {

        this.data = data;
    }


}
