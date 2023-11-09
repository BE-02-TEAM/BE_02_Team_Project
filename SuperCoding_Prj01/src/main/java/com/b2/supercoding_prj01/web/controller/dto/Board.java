package com.b2.supercoding_prj01.web.controller.dto;

import com.b2.supercoding_prj01.entity.BoardEntity;
import com.b2.supercoding_prj01.entity.BoardStatus;
import lombok.*;

import javax.persistence.Column;

@Getter
@Builder
public class Board {

    private final Long id;
    private final String subject;
    private final String detail;
    private final Long writer;
    private final String tag;
    private final BoardStatus status;

    @Builder
    public Board(Long id, String subject, String detail, Long writer, String tag, BoardStatus status) {
        this.id = id;
        this.subject = subject;
        this.detail = detail;
        this.writer = writer;
        this.tag = tag;
        this.status = status;

        //Entity to DTO
        public static Board from(BoardEntity board){
            return Board.builder()
                    .id(board.getId())
                    .subject(board.getSubject())
                    .detail(board.getDetail())
                    .writer(board.getWriter())
                    .tag(board.getTag())
                    .status(board.getStatus())
                    .build();

        }
    }
}
