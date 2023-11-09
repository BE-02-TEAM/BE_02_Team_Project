package com.b2.supercoding_prj01.web.controller;

import com.b2.supercoding_prj01.service.board.CreateBoard;
import com.b2.supercoding_prj01.service.board.UpdateBoard;
import com.b2.supercoding_prj01.web.controller.dto.Board;

public interface BoardService {

    //반환값은 front랑 정하기 나름임
    //create -> dto
    Board createBoard(CreateBoard board);


    //update delete -> String
    String updateBoard(UpdateBoard updateBoard);
}
