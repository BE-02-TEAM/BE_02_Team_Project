package com.b2.supercoding_prj01.repository.board;

import com.b2.supercoding_prj01.entity.BoardEntity;
import com.b2.supercoding_prj01.web.controller.dto.Board;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@RequiredArgsConstructor
public class BoardRepositoryImpl implements BoardRepository {

    private final BoardJpaRepository boardJpaRepository;

    @Override
    public Board createBoard(Board board) {
        return boardJpaRepository.save(BoardEntity.from(board)).toDTO();
    }

//    @Override
//    public Board update(Board board) {
//        return boardJpaRepository.save(BoardEntity.from(board)).toDTO();
//    }


    @Override
    public List<Board> findAll() {
        return null;
    }
}
