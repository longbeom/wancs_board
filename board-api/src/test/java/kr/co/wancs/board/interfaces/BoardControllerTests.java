package kr.co.wancs.board.interfaces;

import static org.mockito.BDDMockito.given;

import kr.co.wancs.board.application.BoardService;
import kr.co.wancs.board.domain.Board;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

class BoardControllerTests {

  @Autowired
  private MockMvc mvc;

  @MockBean
  BoardService boardService;

  @Test
  void detail(Long id) {
    Board board = boardService.getBoard(id);

  }
}