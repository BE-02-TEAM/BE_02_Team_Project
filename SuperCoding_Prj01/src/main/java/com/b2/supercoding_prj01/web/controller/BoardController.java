package com.b2.supercoding_prj01.web.controller;

import com.b2.supercoding_prj01.service.board.BoardService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/board")
@Tag(name = "BOARD", description = "게시글")
@RequiredArgsConstructor
public class BoardController<CreateBoard> {
    private final BoardService BoardService;

    @GetMapping("/")
    @Tag(name = "BOARD")
    @Operation(summary = "게시글", description = "게시글 전체조회 API입니다")
    public ResponseEntity<?> getAllPost(@PathVariable long id) {

        //Service return
        return ResponseEntity.ok()
                .body("Service return");
    }


    @PostMapping("/")
    @Tag(name = "BOARD")
    @Operation(summary = "게시글", description = "게시글 등록하는 API입니다")

    public ResponseEntity<?> save(@RequestBody CreateBoard board,
                                  BindingResult result) {
        try {
            if (result.hasErrors()) {
                log.info("BindingResult error : " + result.hasErrors());
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result.getClass().getSimpleName());

            }
            return
                    ResponseEntity.status(HttpStatus.CREATED).body(boardService.createBoard(board));
        } catch (Exception e) {
            return
                    ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }


//    @PostMapping("/")
//    @Tag(name = "BOARD")
//    @Operation(summary = "게시글", description = "게시글 수정하는 API입니다")
//
//    public ResponseEntity<?> save(@RequestBody UpdateBoard updateBoard,
//                                  BindingResult result) {
//        try {
//            if (result.hasErrors()) {
//                log.info("BindingResult error : " + result.hasErrors());
//                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result.getClass().getSimpleName());
//                postService.updateBoard(updateBoard);
//            }
//            return ResponseEntity.status(HttpStatus.CREATED).body(boardService.updateBoard(updateBoard));
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
//        }
//    }

}
