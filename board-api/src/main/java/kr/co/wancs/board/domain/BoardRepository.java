package kr.co.wancs.board.domain;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface BoardRepository extends CrudRepository<Board, Long> {
  List<Board> findAll();
}
