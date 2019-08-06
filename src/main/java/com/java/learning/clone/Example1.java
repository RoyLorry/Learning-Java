package com.java.learning.clone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Example1 {

    class InfoBean implements Cloneable {
        public String name;
        public int age;

        public InfoBean clone() {
            try {
                return (InfoBean) super.clone();
            } catch (CloneNotSupportedException e) {
                return null;
            }
        }
    }

    class PeopleBean implements Cloneable {
        public int id;
        public InfoBean infoBean;

        public Object clone() {
            try {
                PeopleBean bean = (PeopleBean) super.clone();
                bean.infoBean = (InfoBean) this.infoBean.clone();
                return bean;
            } catch (CloneNotSupportedException e) {
                return null;
            }
        }
    }

    public static void collectionShallowCopy(){
        List<Object> oldList = new ArrayList<>(); 

    }

    public static <T extends Serializable> T deepCopy(T originalObj) throws IOException, ClassNotFoundException {
        T cloneObj = null;
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        ObjectOutputStream objOut = new ObjectOutputStream(byteOut);
        objOut.writeObject(originalObj);
        objOut.close();

        ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());
        ObjectInputStream objIn = new ObjectInputStream(byteIn);
        cloneObj = (T) objIn.readObject();
        objIn.close();
        return cloneObj;
    }

    public static void main(String[] args) {
        
    }
}