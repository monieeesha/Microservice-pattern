package com.stackroute.muzixservice.repository;

import com.stackroute.muzixservice.domain.Track;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//Enabled repository use built in methods
@Repository
public interface TrackRepository extends MongoRepository<Track,String>
{

}
