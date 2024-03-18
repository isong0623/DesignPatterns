package com.dreaming.design.business;

public class DepartmentModel {
    private String id;
    private String name;

    public DepartmentModel(){}
    public DepartmentModel(String id, String name){
        this.id = id;
        this.name = name;
    }

    public String getId(){
        return id;
    }
    public DepartmentModel setId(String id){
        this.id = id;
        return this;
    }

    public String getName(){
        return name;
    }
    public DepartmentModel setName(String name){
        this.name = name;
        return this;
    }

}
