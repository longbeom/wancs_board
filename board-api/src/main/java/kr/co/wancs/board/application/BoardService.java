package kr.co.wancs.board.application;

import java.util.List;
import kr.co.wancs.board.domain.Board;
import kr.co.wancs.board.domain.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService  {

  @Autowired
  BoardRepository boardRepository;

  public Board getBoard(Long id) {

    return null;
  }

  public List<Board> getBoardList() {
    return boardRepository.findAll();
  }
}
