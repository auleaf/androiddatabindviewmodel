package com.yyzq.mytv;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    private MutableLiveData<Person> personData;

    public MutableLiveData<Person> getPersonData() {
        if(personData==null)
        {
            personData = new MutableLiveData<Person>();
            loadPersonData("test",20);
        }
        return personData;
    }

    public void loadPersonData(String name,Integer age) {
        //增加需要保持的数据
        Person person = new Person(name,age);
        personData.setValue(person);
    }

    public void CallbackLoadPersonClick(){
        loadPersonData(String.valueOf(System.currentTimeMillis()),1);
    }
}
