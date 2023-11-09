package com.b2.supercoding_prj01.service.board;

import javax.transaction.Transactional;

public interface BoardService<Board> {

    Object creatBoard(CreateBoard board);

    @Transactional
    Object createBoard(CreateBoard board);

    // 반환값은 front랑 정하기나름이며
    // creat -> dto
    <CreatBoard> Board creatBoard(CreatBoard board);

    // update delete ->
    String udpdateBoard(UpdateBoard updateBoard);
}
