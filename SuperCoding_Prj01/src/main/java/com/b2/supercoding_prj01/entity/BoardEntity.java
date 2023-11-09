package com.b2.supercoding_prj01.entity;

import com.b2.supercoding_prj01.service.board.BoardStatus;
import com.b2.supercoding_prj01.web.controller.dto.Board;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@Table(name="board")
@NoArgsConstructor
public class BoardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id")
    private Long id;

    @Column(name="board_subject")
    private String subject;

    @Column(name="board_detail")
    private String detail;

    @Column(name="board_writer")
    private Long writer;

    @Column(name="board_tag")
    private String tag;

    @Column(name="board_status")
    @Enumerated(EnumType.STRING)
    private BoardStatus status;



    @Builder
    public BoardEntity(Long id, String subject, String detail, Long writer, String tag, BoardStatus status) {
        this.id = id;
        this.subject = subject;
        this.detail = detail;
        this.writer = writer;
        this.tag = tag;
        this.status = status;
    }



    //DTO to Entity
    public static BoardEntity from(Board board){
        return BoardEntity.builder()
                .id(board.getId())
                .subject(board.getSubject())
                .detail(board.getDetail())
                .writer(board.getWriter())
                .tag(board.getTag())
                .status(board.getStatus())
                .build();
    }


    //Entity to DTO
    public Board toDTO(){
        return Board.builder()
                .id(this.id)
                .subject(this.subject)
                .detail(this.detail)
                .writer(this.writer)
                .tag(this.tag)
                .status(this.status)
                .build();
    }



}

