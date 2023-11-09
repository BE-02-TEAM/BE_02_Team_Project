package com.b2.supercoding_prj01.service.board;

import com.b2.supercoding_prj01.repository.board.BoardRepository;
import com.b2.supercoding_prj01.web.controller.dto.Board;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Slf4j
@Service
@Builder
@RequiredArgsConstructor
public  class BoardServiceImpl implements BoardService{
    private final BoardRepository boardRepository;

    @Override
    public Object creatBoard(CreateBoard board) {
        return null;
    }

    @Override
    @Transactional
    public Board createBoard(CreateBoard board) {
        //Controller에서 createBoard로 받았으니까 BoardRepository에 Board로 넘겨줘야하니까
        //createBoard를 boardDTO로 변환하는 작업필요.
        Board newBoard = Board.builder()
                .subject(board.getSubject())
                .detail(board.getDetail())
                .writer(board.getWriter())
                .tag(board.getTag())
                .status(BoardStatus.NEW)
                .build();

        return boardRepository.createBoard(newBoard);
    }

    @Override
    public Object creatBoard(Object o) {
        return null;
    }


    @Override
    public String udpdateBoard(UpdateBoard updateBoard) {
        return null;
    }
}
