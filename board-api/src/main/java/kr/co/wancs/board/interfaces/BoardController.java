package kr.co.wancs.board.interfaces;

import kr.co.wancs.board.application.BoardService;
import kr.co.wancs.board.domain.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

  @Autowired
  BoardService boardService;

  @GetMapping("/board/{id}")
  public Board detail(@PathVariable("id") Long id) {
    Board board = boardService.getBoard(id);

    return board;
  }
}
