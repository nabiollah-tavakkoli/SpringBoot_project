package biz.aeffegroup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import biz.aeffegroup.entity.DeveloperEntity;

@Repository
public interface DeveloperRepository extends JpaRepository<DeveloperEntity, Long> {

}
