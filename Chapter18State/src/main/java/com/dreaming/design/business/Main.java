package com.dreaming.design.business;

/**
 * 实现在线投票
 *
 * 考虑一个在线投票的应用，
 * 要实现控制同一个用户只能投一票，
 * 如果一个用户反复投票，而且投票次数超过5次，则判定为恶意刷票，要取消该用户投票的资格，当然同时也要取消他所投的票;
 * 如果一个用户的投票次数超过8次，将进入黑名单，禁止再登录和使用系统。
 *
 * 该怎么实现这样的功能呢?
 */
public class Main {
    public static void main(String[] args) {
        VoteManager vm = new VoteManager();
        for(int i=0;i<8;i++) {
            vm.vote("u1", "A");
        }
    }
}
