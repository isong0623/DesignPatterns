package com.dreaming.design.solve.state.impl;

import com.dreaming.design.solve.VoteManager;
import com.dreaming.design.solve.state.wrapper.VoteState;

public class NormalVoteState implements VoteState{
        public void vote(String user, String voteItem, VoteManager voteManager) {
            //正常投票
            //记录到投票记录中
            voteManager.getMapVote().put(user, voteItem);
            System.out.println("恭喜你投票成功");
        }
}
