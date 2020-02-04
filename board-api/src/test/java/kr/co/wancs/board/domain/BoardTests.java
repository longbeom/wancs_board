package kr.co.wancs.board.domain;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;

import org.junit.jupiter.api.Test;

public class BoardTests {

  @Test
  public void creation() {
    // when
    Board board = Board.builder()
        .boardNo(1L)
        .title("제목입니다")
        .content("내용입니다")
        .views(3)
        .build();

    // then
    assertThat(board.getBoardNo(), is(1L));
    assertThat(board.getTitle(), is("제목입니다"));
    assertThat(board.getContent(), is("내용입니다"));
    assertThat(board.getViews(), is(3));
  }
}