package com.dreaming.design.solve;

import com.dreaming.design.business.UserModel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class UserManager {

    private HashMap<String, List<UserModelApi>> mUsers = new HashMap<>();
    private HashMap<UserModelProxy, UserModel> mLoader = new HashMap<>();

    private UserManager(){
        List<UserModel> lstUsers = new ArrayList<>();
        lstUsers.add(new UserModel("user0001","张三1","010101","男"));
        lstUsers.add(new UserModel("user0002","张三2","010101","男"));
        lstUsers.add(new UserModel("user0003","张三3","010102","男"));
        lstUsers.add(new UserModel("user0004","张三4","010201","男"));
        lstUsers.add(new UserModel("user0005","张三5","010201","男"));
        lstUsers.add(new UserModel("user0006","张三6","010202","男"));
        for(UserModel user : lstUsers){
            UserModelProxy proxy = new UserModelProxy(user.getUserId(), user.getName());

            List<UserModelApi> lstApis = mUsers.get(user.getDepId());
            if(lstApis == null){
                lstApis = new ArrayList<>();
                mUsers.put(user.getDepId(),lstApis);
            }
            lstApis.add(proxy);
            mLoader.put(proxy,user);
        }
    }

    private static UserManager instance = new UserManager();
    public static UserManager getInstance(){
        return instance;
    }

    /**
     *根据部门编号来获取该部门下的所有人员
     *@param depId 部门编号
     *@return 该部门下的所有人员
     */
    public Collection<UserModelApi> getUserByDepId(String depId){
        Collection result = mUsers.get(depId);
        if(result == null) return new ArrayList<>();
        return result;
    }

    public void reload(UserModelApi user){
        UserModel model = mLoader.get(user);
        if(model == null) return;
        user.setSex(model.getSex());
        user.setDepId(model.getDepId());
    }
}
