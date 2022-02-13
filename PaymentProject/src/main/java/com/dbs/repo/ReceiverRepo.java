package com.dbs.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbs.entity.Receiver;

@Repository
public interface ReceiverRepo extends JpaRepository<Receiver,Integer> {

}
