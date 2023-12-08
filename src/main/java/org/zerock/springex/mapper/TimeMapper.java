package org.zerock.springex.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {

    @Select("select now()") // @Select 어노테이션을 이용해 쿼리 작성, ";"을 이용하지 않음에 주의
    String getTime();

}
