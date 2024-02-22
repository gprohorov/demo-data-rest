package edu.pro.demodatarest;
/*
  @author   george
  @project   demo-data-rest
  @class  Item
  @version  1.0.0 
  @since 15.01.24 - 14.23
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    @Id
    private String id;
    private String name;
    private String description;

}
