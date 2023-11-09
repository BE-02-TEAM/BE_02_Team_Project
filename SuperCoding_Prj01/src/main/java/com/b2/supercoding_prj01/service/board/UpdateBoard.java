package com.b2.supercoding_prj01.service.board;

import lombok.Getter;
import lombok.Builder;

@Getter
public enum UpdateBoard {
    ;

    private final String subject;
    private final String detail;
    private final String tag;

    @Builder
    UpdateBoard(String subject, String detail, String tag){
        this.subject=subject;
        this.detail=detail;
        this.tag=tag;

    }
}
