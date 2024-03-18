package com.dreaming.design.patterns02.solve;

import com.dreaming.design.patterns02.solve.wrapper.Api;

public class Main {
    public static void main(String[]args){
        Api api;

        api = ApiFactory.createApi();
        api.test1("");

        api = ApiFactory.createApi(ImplType.IMPL_1);
        api.test1("");
    }
}
