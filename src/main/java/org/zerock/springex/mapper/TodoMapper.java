package org.zerock.springex.mapper;

import org.zerock.springex.domain.TodoVO;
import org.zerock.springex.dto.PageRequestDTO;

import java.util.List;

public interface TodoMapper {
    String getTime();

    //글 등록하기
    void insert(TodoVO todoVO);

    //전체 조회하기
    List<TodoVO> selectAll();

    //글 하나 조회하기
    TodoVO selectOne(Long tno);

    // 글 삭제하기
    void delete(Long tno);


    // 글 수정하기
    void update(TodoVO todoVO);

    List<TodoVO> selectList(PageRequestDTO pageRequestDTO);

    int getCount(PageRequestDTO pageRequestDTO);


}
