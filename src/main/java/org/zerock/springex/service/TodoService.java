package org.zerock.springex.service;

import org.zerock.springex.domain.TodoVO;
import org.zerock.springex.dto.PageRequestDTO;
import org.zerock.springex.dto.PageResponseDTO;
import org.zerock.springex.dto.TodoDTO;

import java.util.List;

public interface TodoService {

    //글 등록하기
    void register(TodoDTO todoDTO);

    //전체 글 조회하기 ( 페이징 처리)
    List<TodoDTO> getAll();
    PageResponseDTO<TodoDTO> getList(PageRequestDTO pageRequestDTO);

    //글 하나 조회하기
    TodoDTO getOne(Long tno);

    // 글 삭제하기
    void remove(Long tno);

    // 글 수정하기
    void modify(TodoDTO todoDTO);



}
