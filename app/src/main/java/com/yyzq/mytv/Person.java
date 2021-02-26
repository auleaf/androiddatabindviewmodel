package com.yyzq.mytv;

import androidx.databinding.ObservableField;

public class Person {
   public ObservableField<String> name = new ObservableField<>();
   public ObservableField<Integer> age = new ObservableField<>();

    public Person(String name, Integer age) {
        this.name.set(name);
        this.age.set(age);
    }


}
