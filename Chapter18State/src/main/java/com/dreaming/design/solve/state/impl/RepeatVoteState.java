package com.dreaming.design.solve.state.impl;

import com.dreaming.design.solve.VoteManager;
import com.dreaming.design.solve.state.wrapper.VoteState;

public class RepeatVoteState implements VoteState {
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //重复投票
        //暂时不做处理
        System.out.println("请不要重复投票");
    }
}
