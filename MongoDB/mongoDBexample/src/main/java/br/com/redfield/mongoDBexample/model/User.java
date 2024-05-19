package br.com.redfield.mongoDBexample.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "user_table")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @MongoId
    private String id;
    private String name;
    private Long age;
    private String email;
}
