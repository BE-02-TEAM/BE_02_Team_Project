package com.b2.supercoding_prj01.service.board;


import lombok.Getter;

@Getter
public class CreateBoard {

    private final String subject;
    private final String detail;
    private final Long writer;
    private final String tag;


    public CreateBoard(String subject, String detail, Long writer, String tag) {
        this.subject = subject;
        this.detail = detail;
        this.writer = writer;
        this.tag = tag;
    }
}
