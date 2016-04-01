package com.yy.cloud.core.workflow.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.yy.cloud.core.workflow.data.domain.Member;

import java.util.List;

//@RepositoryRestResource(collectionResourceRel = "member", path = "members")
public interface MemberRepository extends JpaRepository<Member, Long> {
	List<Member> findByNickName(@Param("0") String name);
	Page<Member> findByIdIn(@Param("ids")Long[] ids, Pageable pageable);
	List<Member> findByName(@Param("0") String name);
	List<Member> findAll();
}
