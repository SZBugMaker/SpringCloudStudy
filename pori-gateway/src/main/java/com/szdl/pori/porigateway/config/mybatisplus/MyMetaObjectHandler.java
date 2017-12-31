package com.szdl.pori.porigateway.config.mybatisplus;

import com.baomidou.mybatisplus.mapper.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;

import java.sql.Timestamp;

/**
 * @author: 黄乐
 * @date: 2017/12/31
 * @time: 15:57
 * @description: 
 */
public class MyMetaObjectHandler extends MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        Object created = getFieldValByName("created", metaObject);
        if(created==null){
            setFieldValByName("created", new Timestamp(System.currentTimeMillis()), metaObject);
        }
        Object updated = getFieldValByName("updated", metaObject);
        if(updated==null) {
            setFieldValByName("updated", new Timestamp(System.currentTimeMillis()), metaObject);
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        Object updated = getFieldValByName("updated", metaObject);
        if(updated==null) {
            setFieldValByName("updated", new Timestamp(System.currentTimeMillis()), metaObject);
        }
    }
}
