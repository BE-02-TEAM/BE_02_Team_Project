package com.b2.supercoding_prj01.repository.board;

import com.b2.supercoding_prj01.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardJpaRepository extends JpaRepository <BoardEntity, Long>{
    //JPA 명명규칙
    //findBy~.

}
