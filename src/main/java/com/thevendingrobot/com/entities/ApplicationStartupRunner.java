package com.thevendingrobot.com.entities;

import com.thevendingrobot.com.entities.entities.Entity1;
import com.thevendingrobot.com.entities.entities.Entity2;
import com.thevendingrobot.com.entities.entities.Parent;
import com.thevendingrobot.com.entities.repositories.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationStartupRunner implements CommandLineRunner {

    @Autowired
    private ParentRepository parentRepository;

    @Override
    public void run(String... args) throws Exception {


        Entity1 entity1 = new Entity1();
        entity1.setName("entity1");
        Entity2 entity2 = new Entity2();
        entity2.setName("entity2");

        Parent parent = new Parent();
        parent.setName("parent");
        parent.setEntity1(entity1);
        parent.setEntity2(entity2);

        parent = parentRepository.save(parent);

        System.out.println(parent);

    }


}
