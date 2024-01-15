package edu.pro.demodatarest;
/*
  @author   george
  @project   demo-data-rest
  @class  DataBaseLoader
  @version  1.0.0 
  @since 15.01.24 - 14.43
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final ItemRepository repository;

    @Autowired
    public DatabaseLoader(ItemRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.saveAll(List.of(
                new Item("1", " name1", "d1"),
                new Item("2", " name2", "d2"),
                new Item("3", " name3", "d3")
                ));
    }
}
