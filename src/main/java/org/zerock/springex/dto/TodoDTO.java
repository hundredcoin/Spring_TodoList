package org.zerock.springex.dto;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TodoDTO {

    private Long tno;

    @NotEmpty // null, 빈 문자열 불가
    private String title;

    @Future // 현재 보다 미래인가?
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dueDate;

    private boolean finished;

    @NotEmpty
    private String writer;

}
