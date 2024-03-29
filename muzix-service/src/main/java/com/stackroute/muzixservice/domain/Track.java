package com.stackroute.muzixservice.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//Enabled track class with lombok

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Track {

     @Id
    String trackId;
    String trackname;
    String trackcmnt;

}
