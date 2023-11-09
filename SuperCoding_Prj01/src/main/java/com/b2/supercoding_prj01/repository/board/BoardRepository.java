package com.b2.supercoding_prj01.repository.board;

import com.b2.supercoding_prj01.web.controller.dto.Board;
import java.util.List;

public interface BoardRepository {

    //등록 ->return DTO
    Board createBoard(Board board);

    //수정


    //삭제

    //조회
    public List<Board> findAll();
}
